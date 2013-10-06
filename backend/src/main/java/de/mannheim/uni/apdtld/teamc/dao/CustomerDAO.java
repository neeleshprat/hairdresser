package de.mannheim.uni.apdtld.teamc.dao;

import de.mannheim.uni.apdtld.teamc.model.Customer;

public interface CustomerDAO {

	public Customer getById(int id);

	public void addCustomer(Customer customer);

	public void deleteCustomer(Customer customer);

}
