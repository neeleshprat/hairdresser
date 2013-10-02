package de.mannheim.uni.apdtld.teamc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import de.mannheim.uni.apdtld.teamc.dao.InMemoryServiceDAO;
import de.mannheim.uni.apdtld.teamc.dao.ServiceDAO;
import de.mannheim.uni.apdtld.teamc.model.Service;
import de.mannheim.uni.apdtld.teamc.model.Service.Gender;

public class ServiceDAOTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private ServiceDAO serviceDAO;

	@Before
	public void setup() {
		serviceDAO = new InMemoryServiceDAO();
	}

	@Test
	public void persistAndGet() {
		// prepare
		Service expected = new Service(1, "A", "B", 1, Gender.MALE);
		serviceDAO.addService(expected);

		// perform
		Service actual = serviceDAO.getById(1);

		// verify
		assertEquals(expected, actual);
	}

	@Test
	public void getNonExistingService() {
		// perform & verify
		thrown.expectMessage("Unknown Service");
		serviceDAO.getById(1);
	}

	@Test
	public void removeService() {
		// prepare
		Service expected = new Service(1, "A", "B", 1, Gender.MALE);
		serviceDAO.addService(expected);

		// perform
		serviceDAO.deleteService(expected);

		// verify
		thrown.expectMessage("Unknown Service");
		serviceDAO.getById(expected.getId());
	}

}
