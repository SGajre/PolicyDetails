package org.farmers.policy.dom;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="POLICY")
public class Policy {
	
	private int id;
	private String policyInfo;
	private String policyStatus;
	private int householdNumber;
	private String mailingAddress;
	
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyInfo() {
		return policyInfo;
	}
	
	@XmlElement(name="POLICY_INF")
	public void setPolicyInfo(String policyInfo) {
		this.policyInfo = policyInfo;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	
	@XmlElement(name="POLICY_STA")
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public int getHouseholdNumber() {
		return householdNumber;
	}
	
	@XmlElement(name="HOUSE_ID")
	public void setHouseholdNumber(int householdNumber) {
		this.householdNumber = householdNumber;
	}
	public String getMailingAddress() {
		return mailingAddress;
	}
	
	@XmlElement(name="MAIL_ID")
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	
	
}
