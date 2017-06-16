package com.CustomerDetails.rest;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Bank {
	private String accNo;
	private String name;
	private String accType;
	
	public Bank() {

	}

	public Bank(String accNo, String name, String accType) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.accType = accType;
	}

	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
}
