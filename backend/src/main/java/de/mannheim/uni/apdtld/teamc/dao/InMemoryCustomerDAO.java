package de.mannheim.uni.apdtld.teamc.dao;

import java.util.ArrayList;
import java.util.List;

import de.mannheim.uni.apdtld.teamc.model.Customer;

public class InMemoryCustomerDAO implements CustomerDAO {

	private List<Customer> store;

	public InMemoryCustomerDAO() {
		super();
		store = new ArrayList<Customer>();
	}

	@Override
	public Customer getById(int id) {
		for (Customer c : store) {
			if (c.getId() == id)
				return c;
		}
		throw new RuntimeException("Unknown Customer");
	}

	@Override
	public void addCustomer(Customer customer) {
		store.add(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		store.remove(customer);
	}

}
