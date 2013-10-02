package de.mannheim.uni.apdtld.teamc.model;

public class Appointment extends Entry {

	private Customer customer;

	private Service service;

	public Appointment(long start, long end, Customer customer, Service service) {
		super(start, end);
		this.customer = customer;
		this.service = service;
	}

}
