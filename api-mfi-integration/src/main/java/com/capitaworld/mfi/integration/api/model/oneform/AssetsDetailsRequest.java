package com.capitaworld.mfi.integration.api.model.oneform;

import java.io.Serializable;

public class AssetsDetailsRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String assetsTypeName;
	private String particularsName;
	private String assetOwnerDetail;
	private Double amount;

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
