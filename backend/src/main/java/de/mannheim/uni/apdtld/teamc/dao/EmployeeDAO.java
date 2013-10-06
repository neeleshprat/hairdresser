package de.mannheim.uni.apdtld.teamc.dao;

import de.mannheim.uni.apdtld.teamc.model.Employee;

public interface EmployeeDAO {

	public Employee getById(int id);

	public void addEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

}