package com.capitaworld.mfi.integration.config;

import java.sql.Types;
import java.util.Objects;

import org.hibernate.dialect.Oracle10gDialect;

public class CustomeOracle10gDialect extends Oracle10gDialect {

	public static String dbName;

	public CustomeOracle10gDialect() {

		registerColumnType(Types.DOUBLE, "float");
	}

	@Override
	public String getQuerySequencesString() {
		return "SELECT sequence_name FROM all_sequences WHERE UPPER(sequence_owner) = UPPER('"
				+ Objects.requireNonNull(dbName, "dbName") + "')";
	}

}
