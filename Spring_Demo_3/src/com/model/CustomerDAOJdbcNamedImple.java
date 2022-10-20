package com.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="repo1")
public class CustomerDAOJdbcNamedImple implements CustomerDAO {
	
	@Autowired
	NamedParameterJdbcTemplate namedTemp;
	@Override
	public int addCustomer(Customer c) {
		int row=0;
		String query="insert into customer values(:customerId,:customerName)";
		Map<String,Object> map = new HashMap<>();
		map.put("customerId",c.getId());
		map.put("customerName", c.getName());
		row=namedTemp.update(query,map);
		return row;
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		int row=0;
		String query="update customer set name=:cname where id=:cid";
		Map<String,Object> map = new HashMap<>();
		map.put("cname", c.getName());
		map.put("cid",c.getId());
		row=namedTemp.update(query,map);
		return row;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		String query="delete from customer where id=:id";
		Map<String,Object> map = new HashMap<>();
		map.put("id", id);
		int row=namedTemp.update(query,map);
		if(row>0)
			return true;
		return false;
	}
	
}
