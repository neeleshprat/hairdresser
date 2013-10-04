package de.mannheim.uni.apdtld.teamc.model;

public class Entry {

	private int id;

	private long start;
	private long end;

	private Employee employee;

	public Entry(int id, long start, long end, Employee employee) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public long getStart() {
		return start;
	}

	public long getEnd() {
		return end;
	}

	public Employee getEmployee() {
		return employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + (int) (end ^ (end >>> 32));
		result = prime * result + id;
		result = prime * result + (int) (start ^ (start >>> 32));
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
		Entry other = (Entry) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (end != other.end)
			return false;
		if (id != other.id)
			return false;
		if (start != other.start)
			return false;
		return true;
	}

}
