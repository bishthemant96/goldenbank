package com.model;


import java.util.List;

public class CustomerModel {

	private int cusID;
	private String cusName;
	private String cusPassword;
	private int cusAge;
	private String cusGender;
	private String cusNationality;
	private List<String> cusIDProof;
	private long cusNo;
	private String cusEmail;
	private String cusAddress;
	private boolean status;
	private String error;
	
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusPassword() {
		return cusPassword;
	}

	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}

	public int getCusAge() {
		return cusAge;
	}

	public void setCusAge(int cusAge) {
		this.cusAge = cusAge;
	}

	public String getCusNationality() {
		return cusNationality;
	}

	public void setCusNationality(String cusNationality) {
		this.cusNationality = cusNationality;
	}

	public String getCusGender() {
		return cusGender;
	}

	public void setCusGender(String cusGender) {
		this.cusGender = cusGender;
	}

	public List<String> getCusIDProof() {
		return cusIDProof;
	}

	public void setCusIDProof(List<String> cusIDProof) {
		this.cusIDProof = cusIDProof;
	}

	public long getCusNo() {
		return cusNo;
	}

	public void setCusNo(long cusNo) {
		this.cusNo = cusNo;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}


}
