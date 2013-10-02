package de.mannheim.uni.apdtld.teamc.dao;

import de.mannheim.uni.apdtld.teamc.model.Service;

public interface ServiceDAO {

	public Service getById(int id);

	public void addService(Service service);

	public void deleteService(Service service);

}
