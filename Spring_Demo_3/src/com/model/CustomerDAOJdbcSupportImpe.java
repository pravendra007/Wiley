package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOJdbcSupportImpe extends JdbcDaoSupport implements CustomerDAO {
	
	@Autowired
	public CustomerDAOJdbcSupportImpe(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}
	@Override
	public int addCustomer(Customer c) {
		int row=0;
		String query="insert into customer values(?,?)";
		row=getJdbcTemplate().update(query,c.getId(),c.getName());
		return row;
	}

	@Override
	public int updateCustomer(Customer c) {
		int row=0;
		String query="update customer set name=? where id=?";
		row=getJdbcTemplate().update(query,c.getName(),c.getId());
		return row;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		String query="delete from customer where id=?";
		int row=getJdbcTemplate().update(query,id);
		if(row>0)
			return true;
		return false;
	}
	
}
