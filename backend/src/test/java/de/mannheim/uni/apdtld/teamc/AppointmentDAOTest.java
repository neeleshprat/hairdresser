package de.mannheim.uni.apdtld.teamc;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import de.mannheim.uni.apdtld.teamc.dao.AppointmentDAO;
import de.mannheim.uni.apdtld.teamc.dao.InMemoryAppointmentDAO;
import de.mannheim.uni.apdtld.teamc.model.Appointment;
import de.mannheim.uni.apdtld.teamc.model.Customer;
import de.mannheim.uni.apdtld.teamc.model.Employee;

public class AppointmentDAOTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private AppointmentDAO appointmentDAO;

	@Before
	public void setup() {
		appointmentDAO = new InMemoryAppointmentDAO();
	}

	@Test
	public void persistAndGet() {
		// prepare
		Appointment expected = new Appointment(1, 1, 2, null, null, null);
		appointmentDAO.addAppointment(expected);

		// perform
		Appointment actual = appointmentDAO.getById(expected.getId());

		// verify
		assertEquals(expected, actual);
	}

	@Test
	public void getNonExistingAppointment() {
		// perform & verify
		thrown.expectMessage("Unknown Appointment");
		appointmentDAO.getById(1);
	}

	@Test
	public void getAppointmentsForEmployee() {
		Employee lena = new Employee(1, "Lena");
		Employee anna = new Employee(2, "Anna");

		Appointment app1 = new Appointment(1, 1, 2, lena, null, null);
		Appointment app2 = new Appointment(2, 1, 2, lena, null, null);
		Appointment app3 = new Appointment(2, 1, 2, anna, null, null);

		appointmentDAO.addAppointment(app1);
		appointmentDAO.addAppointment(app2);
		appointmentDAO.addAppointment(app3);

		List<Appointment> appLena = appointmentDAO
				.getAppointmentsForEmployee(lena);

		assertEquals(Arrays.asList(app1, app2), appLena);
	}

	@Test
	public void getAppointmentsForCustomer() {
		Customer bernd = new Customer(1, "Bernd");
		Customer max = new Customer(2, "Max");

		Appointment app1 = new Appointment(1, 1, 2, null, bernd, null);
		Appointment app2 = new Appointment(2, 1, 2, null, bernd, null);
		Appointment app3 = new Appointment(3, 1, 2, null, max, null);
		Appointment app4 = new Appointment(4, 1, 2, null, max, null);

		appointmentDAO.addAppointment(app1);
		appointmentDAO.addAppointment(app2);
		appointmentDAO.addAppointment(app3);
		appointmentDAO.addAppointment(app4);

		List<Appointment> appBernd = appointmentDAO
				.getAppointmentsForCustomer(bernd);

		assertEquals(Arrays.asList(app1, app2), appBernd);
	}
}
