package de.mannheim.uni.apdtld.teamc.dao;

import java.util.ArrayList;
import java.util.List;

import de.mannheim.uni.apdtld.teamc.model.Service;

public class InMemoryServiceDAO implements ServiceDAO {

	private List<Service> store;

	public InMemoryServiceDAO() {
		super();
		store = new ArrayList<Service>();
	}

	@Override
	public Service getById(int id) {
		for (Service s : store) {
			if (s.getId() == id)
				return s;
		}
		throw new RuntimeException("Unknown Service");
	}

	@Override
	public void addService(Service service) {
		store.add(service);
	}

	@Override
	public void deleteService(Service service) {
		store.remove(service);
	}

}
