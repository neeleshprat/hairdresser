package de.mannheim.uni.apdtld.teamc.dao;

import java.util.ArrayList;
import java.util.List;

import de.mannheim.uni.apdtld.teamc.model.Person;

public abstract class InMemoryPersonDAO {

	private List<Person> store;

	public InMemoryPersonDAO() {
		super();
		store = new ArrayList<Person>();
	}

	public Person getById(int id) {
		for (Person c : store) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}

	public void addPerson(Person person) {
		store.add(person);
	}

	public void deletePerson(Person person) {
		store.remove(person);
	}

}
