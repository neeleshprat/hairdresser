package de.mannheim.uni.apdtld.teamc.model;

public class Service {

	private int id;

	private String title;

	private String description;

	// ms -> possible to add to the date serialization
	private long duration;

	private Gender gender;

	public Service(int i, String title, String description, long duration,
			Gender gender) {
		super();
		this.id = i;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.gender = gender;
	}

	public enum Gender {
		MALE, FEMALE
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public long getDuration() {
		return duration;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (duration ^ (duration >>> 32));
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Service other = (Service) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration != other.duration)
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
