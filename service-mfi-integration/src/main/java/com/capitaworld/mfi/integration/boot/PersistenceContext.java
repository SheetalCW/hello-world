package com.capitaworld.mfi.integration.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.dialect.MySQL5Dialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.capitaworld.api.common.lib.boot.PersistanceContextEnum;
import com.capitaworld.mfi.integration.config.CustomeOracle10gDialect;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author Akshay
 *
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.capitaworld.mfi.integration.repository", entityManagerFactoryRef = "dataSourceEM", transactionManagerRef = "dataSourceTM")
public class PersistenceContext {

	private final Logger log = LoggerFactory.getLogger(PersistenceContext.class);

	protected static final String PROPERTY_NAME_DATABASE_DRIVER = "capitaworld.mfi.integration.db.driver";
	protected static final String PROPERTY_NAME_DATABASE_PASSWORD = "capitaworld.mfi.integration.db.password";
	protected static final String PROPERTY_NAME_DATABASE_URL = "capitaworld.mfi.integration.db.url";
	protected static final String PROPERTY_NAME_DATABASE_USERNAME = "capitaworld.mfi.integration.db.username";
	protected static final String PROPERTY_NAME_DATABASE_MAX_CONNECTIONS = "capitaworld.mfi.integration.db.maxconnections";
	protected static final String PROPERTY_NAME_DATABASE_MIN_CONNECTIONS = "capitaworld.mfi.integration.db.minconnections";
	protected static final String PROPERTY_NAME_DATABASE_MAX_PARTITIONS = "capitaworld.mfi.integration.db.maxpartitions";
	protected static final String PROPERTY_NAME_DATABASE_MAX_LIFETIME = "capitaworld.mfi.integration.db.maxlifetimeinmillis";
	protected static final String PROPERTY_NAME_DATABASE_CONNECTION_TIMEOUT = "capitaworld.mfi.integration.db.connectiontimeoutinmillis";
	protected static final String PROPERTY_NAME_DATABASE = "database.name_or_sid";

	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
	private static final String PROPERTY_NAME_HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
	private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
	private static final String PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY = "hibernate.ejb.naming_strategy";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	private static final String PROPERTY_NAME_HIBERNATE_LAZY_LOAD = "hibernate.enable_lazy_load_no_trans";

	private static final String PROPERTY_PACKAGES_TO_SCAN = "com.capitaworld.mfi.integration.domain.oneform";

	@Autowired
	private Environment environment;

	@Autowired
	private DataSourceProperties dataSourceProperties;

	@Bean(name = "dataSource")
	@Primary
	public DataSource dataSource() {
		log.info("Initiate retailDataStore instance");

		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
		dataSource.setJdbcUrl(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
		dataSource.setUsername(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
		dataSource.setPassword(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
		// dataSource.setConnectionTestQuery("SELECT SMTP_CODE FROM JN_C2_AM_SMTP");
		// dataSource.setConnectionTestQuery("SELECT 1");
		dataSource
				.setMaximumPoolSize(Integer.parseInt(environment.getProperty(PROPERTY_NAME_DATABASE_MAX_CONNECTIONS)));
		dataSource.setMaxLifetime(Long.parseLong(environment.getProperty(PROPERTY_NAME_DATABASE_MAX_LIFETIME)));
		dataSource.setConnectionTimeout(
				Long.parseLong(environment.getProperty(PROPERTY_NAME_DATABASE_CONNECTION_TIMEOUT)));

		/**
		 * Set custom data source properties
		 */
		String dialectName = environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT);
		setDataSourceProperties(dialectName);

		log.info(" retailDataStore instance created");
		return dataSource;
	}

	private void setDataSourceProperties(String dialectName) {
		if (true)
			return;
		if ("oracle".equals(dialectName)) {
			dataSourceProperties.setSeparator("/");
			List<String> data = dataSourceProperties.getData();
			if (data == null) {
				data = new ArrayList<>();
			}

			data.add("classpath:oracle/AFTR_INSERT_ON_LOAN_MASTER.sql");
			data.add("classpath:oracle/AFTR_INSERT_ON_SANCTION_DETAIL.sql");
			data.add("classpath:oracle/BANK_CURRENT_PROPOSAL_STATUS.sql");
			data.add("classpath:oracle/BEFOR_INSRT_ON_DISBURSE_DETAIL.sql");
			data.add("classpath:oracle/BEFORE_UPDATE_ON_LOAN_MASTER.sql");
			dataSourceProperties.setData(data);
		} else if ("mysql".equals(dialectName)) {
			dataSourceProperties.setSeparator("/");
			List<String> data = dataSourceProperties.getData();
			if (data == null) {
				data = new ArrayList<>();
			}

			data.add("classpath:mysql/AFTR_INSERT_ON_LOAN_MASTER.sql");
			data.add("classpath:mysql/AFTR_INSERT_ON_SANCTION_DETAIL.sql");
			data.add("classpath:mysql/AFTR_INSRT_ON_BANK_CURR_PROPOSL.sql");
			data.add("classpath:mysql/AFTR_UPDT_ON_BANK_CURR_PROPOSL.sql");
			data.add("classpath:mysql/BEFOR_INSRT_ON_DISBURSE_DETAIL.sql");
			data.add("classpath:mysql/BEFORE_UPDATE_ON_LOAN_MASTER.sql");

			dataSourceProperties.setData(data);
		}
	}

	@Bean(name = "dataSourceTM")
	@Primary
	public JpaTransactionManager transactionManager() {
		log.info("Initiate dataSourceTM instance");
		JpaTransactionManager transactionManager = new JpaTransactionManager();

		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		log.info("dataSourceTM instance created");
		return transactionManager;
	}

	@Bean(name = "dataSourceEM")
	@DependsOn("dataSource")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		log.info("Initiate retailDataStoreEM instance");
		entityManagerFactoryBean.setDataSource(dataSource());
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan(PROPERTY_PACKAGES_TO_SCAN);

		Map<String, Object> jpaProperties = entityManagerFactoryBean.getJpaPropertyMap();

		jpaProperties.put(PROPERTY_NAME_HIBERNATE_FORMAT_SQL,
				environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_FORMAT_SQL));
		jpaProperties.put(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY,
				environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY));
		jpaProperties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL,
				environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
		jpaProperties.put(PROPERTY_NAME_HIBERNATE_LAZY_LOAD,
				environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_LAZY_LOAD));

		jpaProperties.put("hibernate.naming.implicit-strategy",
				"org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyHbmImpl");
		jpaProperties.put("hibernate.naming.physical-strategy",
				"org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");

		// set default dialect and default schema
		String userName = environment.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME);
		String dialectName = environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT);
		if ("oracle".equals(dialectName)) {
			jpaProperties.put(PersistanceContextEnum.DEFAULT_SCHEMA.getKey(), userName);
			CustomeOracle10gDialect.dbName = userName;
			jpaProperties.put(PersistanceContextEnum.HIBERNATE_DIALECT_ORACLE.getKey(),
					CustomeOracle10gDialect.class.getName());

		} else if ("mysql".equals(dialectName)) {
			jpaProperties.put(PersistanceContextEnum.DEFAULT_SCHEMA.getKey(),
					environment.getRequiredProperty(PROPERTY_NAME_DATABASE));
			jpaProperties.put(PersistanceContextEnum.HIBERNATE_DIALECT_MYSQL.getKey(), MySQL5Dialect.class.getName());
		}

		// set HBM2 DDL Auto properties
		String dllProp = environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO);
		if (dllProp.contains("crt")) {

			jpaProperties.put(PersistanceContextEnum.HBM2_DDL_AUTO_CREATE.getKey(),
					PersistanceContextEnum.HBM2_DDL_AUTO_CREATE.getValue());

		} else if (dllProp.contains("update")) {
			/* if(requiredProperty.contains("update")) { */
			jpaProperties.put(PersistanceContextEnum.HBM2_DDL_AUTO_UPDATE.getKey(),
					PersistanceContextEnum.HBM2_DDL_AUTO_UPDATE.getValue());

		} else {
			jpaProperties.put(PersistanceContextEnum.HBM2_DDL_AUTO_VALIDATE.getKey(),
					PersistanceContextEnum.HBM2_DDL_AUTO_VALIDATE.getValue());
		}

		log.info("retailDataStoreEM instance created");
		return entityManagerFactoryBean;
	}

}
