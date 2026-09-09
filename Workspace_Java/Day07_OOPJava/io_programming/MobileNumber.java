package io_programming;

public class MobileNumber {
	private String countyCode;
	private String mobileNo;
	public MobileNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileNumber(String countyCode, String mobileNo) {
		super();
		this.countyCode = countyCode;
		this.mobileNo = mobileNo;
	}
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "MobileNumber [countyCode=" + countyCode + ", mobileNo=" + mobileNo + "]";
	}
}
