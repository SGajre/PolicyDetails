package org.farmers.policy.impl;

import java.util.List;

import org.farmers.policy.dom.Policies;
import org.farmers.policy.dom.Policy;
import org.farmers.policy.dom.PolicyRepository;
import org.farmers.policy.mapper.PolicyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PolicyRepositoryImpl implements PolicyRepository {

	@Autowired JdbcTemplate jdbcTemplate;

	@SuppressWarnings({ "unchecked" })
	@Override
	public Policies getPolicyAll() {
		String sql = "SELECT * FROM farm.policy";
		
		Policies policies = new Policies();	 
		List<Policy> policyList = jdbcTemplate.query(sql,new PolicyMapper());		
		policies.setPolicyList(policyList);
		return policies;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public Policies getPolicyById(int id) {
		String sql = "SELECT * FROM farm.POLICY WHERE ID = ?";
		
		Policies policies = new Policies();
		Policy policy = (Policy) jdbcTemplate.queryForObject(sql, new Object[] { id }, new PolicyMapper());	 
		policies.add(policy);
		return policies;
		
	}
}
