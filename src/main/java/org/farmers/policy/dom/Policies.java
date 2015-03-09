package org.farmers.policy.dom;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "POLICIES")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Policies{
	
	private List<Policy> policyList = new ArrayList<Policy>();
	
	@XmlElement(name = "POLICY")
	public List<Policy> getPolicyList() {
		return policyList;
	}

	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}
	
	public List<Policy> createPolicies() {

		for (int i = 0; i < 20; i++) {

			// List<Policy> policyList = new ArrayList<Policy>();

			Policy policy = new Policy();
			policy.setId(i);
			policy.setHouseholdNumber(i + 10);
			policy.setPolicyInfo("AutoInsurance" + i);
			policy.setMailingAddress(i + "policy@farmers.com");
			policy.setPolicyStatus(i + "Active");

			policyList.add(policy);
			this.setPolicyList(policyList);

		}

		return policyList;

	}
	
	public void add(Policy pol){
		
		this.policyList.add(pol);
		
	}
}
