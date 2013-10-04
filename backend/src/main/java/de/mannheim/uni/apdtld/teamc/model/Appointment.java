package de.mannheim.uni.apdtld.teamc.model;

public class Appointment extends Entry {

	private Customer customer;

	private Service service;

	public Appointment(int id, long start, long end, Employee employee,
			Customer customer, Service service) {
		super(id, start, end, employee);
		this.customer = customer;
		this.service = service;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Service getService() {
		return service;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		return true;
	}

}
