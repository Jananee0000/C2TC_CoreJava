package org.tnsif.java.inheritence;

public class Mp extends Citizen {
	private String mpId;
	private String mpName;
	private String locality;
	private String party;
	
	public Mp(long aadharNo, String nationality, String dob, String address, String mpId, String mpName,
			String locality, String party) {
		super(aadharNo, nationality, dob, address);
		this.mpId = mpId;
		this.mpName = mpName;
		this.locality = locality;
		this.party = party;
	}

	public String getMpId() {
		return mpId;
	}

	public void setMpId(String mpId) {
		this.mpId = mpId;
	}

	public String getMpName() {
		return mpName;
	}

	public void setMpName(String mpName) {
		this.mpName = mpName;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "Mp [mpId=" + mpId + ", mpName=" + mpName + ", locality=" + locality + ", party=" + party
				+ ", getAadharNo()=" + getAadharNo() + ", getNationality()=" + getNationality() + ", getDob()="
				+ getDob() + ", getAddress()=" + getAddress() + "]";
	}
	
	
	

}
