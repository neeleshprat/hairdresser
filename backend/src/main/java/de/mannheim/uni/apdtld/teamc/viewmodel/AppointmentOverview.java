package de.mannheim.uni.apdtld.teamc.viewmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import de.mannheim.uni.apdtld.teamc.model.Appointment;
import de.mannheim.uni.apdtld.teamc.model.Customer;
import de.mannheim.uni.apdtld.teamc.model.Entry;
import de.mannheim.uni.apdtld.teamc.model.Service;
import de.mannheim.uni.apdtld.teamc.model.Service.Gender;

public class AppointmentOverview extends HashMap<String, List<Entry>> {

	public AppointmentOverview() {

		Service service1 = new Service(1, "Waschen+Schneiden", "bla bla bla",
				1000 * 60 * 30, Gender.MALE);
		Service service2 = new Service(2, "Schneiden", "bla bla bla 2",
				1000 * 60 * 20, Gender.MALE);

		Service service3 = new Service(3, "Waschen+Schneiden+Färben",
				"bla bla bla 3", 1000 * 60 * 120, Gender.FEMALE);

		List<Entry> testEntries = new ArrayList<Entry>();
		testEntries.add(new Appointment(1, new Date().getTime(), new Date()
				.getTime() + 10000, null, new Customer(1, "Peter"), service1));
		testEntries.add(new Appointment(2, new Date().getTime(), new Date()
				.getTime() + 10000, null, new Customer(2, "Manuel"), service2));

		this.put("Lena", testEntries);

		List<Entry> testEntriesTine = new ArrayList<Entry>();
		testEntriesTine.add(new Appointment(3, new Date().getTime(), new Date()
				.getTime() + 10000, null, new Customer(3, "Karin"), service3));

		this.put("Tine", testEntriesTine);

	}
}
