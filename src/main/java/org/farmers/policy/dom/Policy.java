package org.farmers.policy.dom;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "POLICY")
@XmlRootElement(name="POLICY")
@NamedQuery(name="Policy.findAll", query="SELECT p FROM Policy p")
public class Policy implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2479744631858460318L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID")
	private int id;	
	@Basic(optional = false)
	@Column(name = "INFO")
	private String policyInfo;
	@Basic(optional = false)
	@Column(name = "STATUS")
	private String policyStatus;
	@Column(name = "NUMBER")
	private int householdNumber;
	@Column(name = "MAIL_ADDR")
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
