package de.mannheim.uni.apdtld.teamc.dao;

import de.mannheim.uni.apdtld.teamc.model.Employee;

public class InMemoryEmployeeDAO extends InMemoryPersonDAO implements
		EmployeeDAO {

	public InMemoryEmployeeDAO() {
		super();
	}

	@Override
	public Employee getById(int id) {
		Employee employee = (Employee) super.getById(id);
		if (employee == null)
			throw new RuntimeException("Unknown Employee");

		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		super.addPerson(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		super.deletePerson(employee);
	}

}
