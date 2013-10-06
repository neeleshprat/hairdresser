package de.mannheim.uni.apdtld.teamc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import de.mannheim.uni.apdtld.teamc.dao.CustomerDAO;
import de.mannheim.uni.apdtld.teamc.dao.InMemoryCustomerDAO;
import de.mannheim.uni.apdtld.teamc.model.Customer;

public class CustomerDAOTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private CustomerDAO customerDAO;

	@Before
	public void setup() {
		customerDAO = new InMemoryCustomerDAO();
	}

	@Test
	public void persistAndGet() {
		// prepare
		Customer expected = new Customer(1, "John Doe");
		customerDAO.addCustomer(expected);

		// perform
		Customer actual = customerDAO.getById(expected.getId());

		// verify
		assertEquals(expected, actual);
	}

	@Test
	public void getNonExistingCustomer() {
		// perform & verify
		thrown.expectMessage("Unknown Customer");
		customerDAO.getById(1);
	}

	@Test
	public void removeCustomer() {
		// prepare
		Customer expected = new Customer(1, "John Doe");
		customerDAO.addCustomer(expected);

		// perform
		customerDAO.deleteCustomer(expected);

		// verify
		thrown.expectMessage("Unknown Customer");
		customerDAO.getById(expected.getId());
	}

}
