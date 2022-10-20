package com.model;

public interface CustomerDAO {
	public int addCustomer(Customer c);
	public int updateCustomer(Customer c);
	public boolean deleteCustomer(int id);
}
