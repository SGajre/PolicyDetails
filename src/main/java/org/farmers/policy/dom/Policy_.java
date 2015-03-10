package org.farmers.policy.dom;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-09T23:54:59.262-0500")
@StaticMetamodel(Policy.class)
public class Policy_ {
	public static volatile SingularAttribute<Policy, Integer> id;
	public static volatile SingularAttribute<Policy, String> policyInfo;
	public static volatile SingularAttribute<Policy, String> policyStatus;
	public static volatile SingularAttribute<Policy, Integer> householdNumber;
	public static volatile SingularAttribute<Policy, String> mailingAddress;
}
