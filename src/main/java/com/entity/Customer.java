package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@Column(name = "cusID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusID;

	@Column(name = "cusName")
	private String cusName;

	@Column(name = "cusPassword")
	private String cusPassword;

	@Column(name = "cusAge")
	private String cusAge;

	@Column(name = "cusGender")
	private String cusGender;

	@Column(name = "cusNationality")
	private int cusNationality;

	@Transient
	private List<String> cusIDProof; // will take input from form but not saving in database

	@Column(name = "cusNo")
	private long cusNo;

	@Column(name = "cusEmail")
	private String cusEmail;

	@Column(name = "cusAddress")
	private String cusAddress;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	List<LoanAccount> loanAccount;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	List<Account> account;

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

	public String getCusAge() {
		return cusAge;
	}

	public void setCusAge(String cusAge) {
		this.cusAge = cusAge;
	}

	public String getCusGender() {
		return cusGender;
	}

	public void setCusGender(String cusGender) {
		this.cusGender = cusGender;
	}

	public int getCusNationality() {
		return cusNationality;
	}

	public void setCusNationality(int cusNationality) {
		this.cusNationality = cusNationality;
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

	public List<LoanAccount> getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(List<LoanAccount> loanAccount) {
		this.loanAccount = loanAccount;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

}
