/**
 * 
 */
package org.farmers.policy.dom;


/**
 * @author rputtego
 *
 */
public interface PolicyRepository {

	public Policies getPolicyById(final int id);
	
	public Policies getPolicyAll();
}
