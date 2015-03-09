package org.farmers.policy.srv;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.farmers.policy.dom.Policies;
import org.farmers.policy.dom.Policy;
import org.farmers.policy.impl.PolicyRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
@Path("/policy")
public class PolicyController {
	
	@Autowired 
	private PolicyRepositoryImpl repositoryImpl; 
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Policies getPolicyById(@PathParam("id") int id){
		
		return repositoryImpl.getPolicyById(id);
	
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Policies getAllPolicies(){
		
		return repositoryImpl.getPolicyAll();
	
	}

}
