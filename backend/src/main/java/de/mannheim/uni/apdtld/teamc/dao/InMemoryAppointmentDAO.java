package de.mannheim.uni.apdtld.teamc.dao;

import java.util.ArrayList;
import java.util.List;

import de.mannheim.uni.apdtld.teamc.model.Appointment;
import de.mannheim.uni.apdtld.teamc.model.Customer;
import de.mannheim.uni.apdtld.teamc.model.Employee;

public class InMemoryAppointmentDAO implements AppointmentDAO {

	private List<Appointment> store;

	public InMemoryAppointmentDAO() {
		super();
		this.store = new ArrayList<Appointment>();
	}

	@Override
	public Appointment getById(int id) {
		for (Appointment c : store) {
			if (c.getId() == id)
				return c;
		}
		throw new RuntimeException("Unknown Appointment");
	}

	@Override
	public void addAppointment(Appointment appointment) {
		store.add(appointment);
	}

	@Override
	public List<Appointment> getAppointmentsForCustomer(Customer customer) {
		List<Appointment> result = new ArrayList<>();
		for (Appointment a : store)
			if (a.getCustomer().getId() == customer.getId())
				result.add(a);

		return result;
	}

	@Override
	public List<Appointment> getAppointmentsForEmployee(Employee employee) {
		List<Appointment> result = new ArrayList<>();
		for (Appointment a : store)
			if (a.getEmployee().getId() == employee.getId())
				result.add(a);

		return result;

	}

}
