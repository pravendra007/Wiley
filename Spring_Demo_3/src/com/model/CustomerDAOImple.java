package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="repo")
public class CustomerDAOImple implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
		int row=0;
		String query="insert into customer values(?,?)";
		row=jdbcTemplate.update(query,c.getId(),c.getName());
		return row;
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		int row=0;
		String query="update customer set name=? where id=?";
		row=jdbcTemplate.update(query,c.getName(),c.getId());
		return row;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		String query="delete from customer where id=?";
		int row=jdbcTemplate.update(query,id);
		if(row>0)
			return true;
		return false;
	}

}
