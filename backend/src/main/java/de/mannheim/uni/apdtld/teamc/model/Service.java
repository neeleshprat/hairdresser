package de.mannheim.uni.apdtld.teamc.model;

public class Service {

	private String title;

	private String description;

	// ms -> possible to add to the date serialization
	private long duration;

	private Gender gender;

	public Service(String title, String description, long duration,
			Gender gender) {
		super();
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.gender = gender;
	}

	public enum Gender {
		MALE, FEMALE
	}

}
