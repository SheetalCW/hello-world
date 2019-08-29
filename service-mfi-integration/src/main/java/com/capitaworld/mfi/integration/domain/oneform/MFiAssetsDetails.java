package com.capitaworld.mfi.integration.domain.oneform;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mfi_assets_details")
public class MFiAssetsDetails extends Auditor {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "assets_type_name")
	private String assetsTypeName;

	@Column(name = "particulars_name")
	private String particularsName;

	@Column(name = "asset_owner_detail")
	private String assetOwnerDetail;

	@Column(name = "amount")
	private Double amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssetsTypeName() {
		return assetsTypeName;
	}

	public void setAssetsTypeName(String assetsTypeName) {
		this.assetsTypeName = assetsTypeName;
	}

	public String getParticularsName() {
		return particularsName;
	}

	public void setParticularsName(String particularsName) {
		this.particularsName = particularsName;
	}

	public String getAssetOwnerDetail() {
		return assetOwnerDetail;
	}

	public void setAssetOwnerDetail(String assetOwnerDetail) {
		this.assetOwnerDetail = assetOwnerDetail;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
