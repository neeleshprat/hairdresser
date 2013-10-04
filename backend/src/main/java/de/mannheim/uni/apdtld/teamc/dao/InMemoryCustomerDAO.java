package de.mannheim.uni.apdtld.teamc.dao;

import de.mannheim.uni.apdtld.teamc.model.Customer;

public class InMemoryCustomerDAO extends InMemoryPersonDAO implements
		CustomerDAO {

	public InMemoryCustomerDAO() {
		super();
	}

	@Override
	public Customer getById(int id) {
		Customer customer = (Customer) super.getById(id);
		if (customer == null)
			throw new RuntimeException("Unknown Customer");

		return customer;
	}

	@Override
	public void addCustomer(Customer customer) {
		super.addPerson(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		super.deletePerson(customer);
	}

}
