package de.mannheim.uni.apdtld.teamc.dao;

import java.util.List;

import de.mannheim.uni.apdtld.teamc.model.Appointment;
import de.mannheim.uni.apdtld.teamc.model.Customer;
import de.mannheim.uni.apdtld.teamc.model.Employee;

public interface AppointmentDAO {

	public Appointment getById(int id);

	public void addAppointment(Appointment appointment);

	public List<Appointment> getAppointmentsForCustomer(Customer customer);

	public List<Appointment> getAppointmentsForEmployee(Employee employee);
}
