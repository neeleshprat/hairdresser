package de.mannheim.uni.apdtld.teamc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import de.mannheim.uni.apdtld.teamc.dao.EmployeeDAO;
import de.mannheim.uni.apdtld.teamc.dao.InMemoryEmployeeDAO;
import de.mannheim.uni.apdtld.teamc.model.Employee;

public class EmployeeDAOTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private EmployeeDAO employeeDAO;

	@Before
	public void setup() {
		employeeDAO = new InMemoryEmployeeDAO();
	}

	@Test
	public void persistAndGet() {
		// prepare
		Employee expected = new Employee(1, "Lena");
		employeeDAO.addEmployee(expected);

		// perform
		Employee actual = employeeDAO.getById(expected.getId());

		// verify
		assertEquals(expected, actual);
	}

	@Test
	public void getNonExistingCustomer() {
		// perform & verify
		thrown.expectMessage("Unknown Employee");
		employeeDAO.getById(1);
	}

	@Test
	public void removeCustomer() {
		// prepare
		Employee expected = new Employee(1, "Lena");
		employeeDAO.addEmployee(expected);

		// perform
		employeeDAO.deleteEmployee(expected);

		// verify
		thrown.expectMessage("Unknown Employee");
		employeeDAO.getById(expected.getId());
	}

}
