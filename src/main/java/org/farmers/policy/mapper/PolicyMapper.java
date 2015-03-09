package org.farmers.policy.mapper;

	import java.sql.ResultSet;
import java.sql.SQLException;

import org.farmers.policy.dom.Policy;
import org.springframework.jdbc.core.RowMapper;

@SuppressWarnings("rawtypes")
public class PolicyMapper implements RowMapper	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			Policy policy = new Policy();
			policy.setId(rs.getInt("ID"));
			policy.setPolicyInfo(rs.getString("INFO"));
			policy.setPolicyStatus(rs.getString("STATUS"));
			policy.setHouseholdNumber(rs.getInt("NUMBER"));
			policy.setMailingAddress(rs.getString("MAIL_ADDR"));
			return policy;
		}
}

