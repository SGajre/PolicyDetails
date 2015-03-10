package org.farmers.policy.odata;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;


public class PolicyServiceFactory  extends ODataJPAServiceFactory  {
	
	final static Logger logger = Logger.getLogger(PolicyServiceFactory.class);
	private static final String PERSISTENCE_UNIT_NAME = "policyDetails";

	@Override
	public ODataJPAContext initializeODataJPAContext()throws ODataJPARuntimeException {
		ODataJPAContext oDataJPAContext = this.getODataJPAContext();
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			oDataJPAContext.setEntityManagerFactory(emf);
			oDataJPAContext.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);
			logger.info("Successfully executed Odata");
			return oDataJPAContext;
			
		} catch (Exception e) {
			logger.error("The ERROR" + new RuntimeException(e));
			
			throw new RuntimeException(e);
		}
	}
	
	
}

