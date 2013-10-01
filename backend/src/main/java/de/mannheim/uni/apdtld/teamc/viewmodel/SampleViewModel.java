package de.mannheim.uni.apdtld.teamc.viewmodel;

public class SampleViewModel {

	public int number;

	public String title;

	private SampleViewModel() {
		// non argument constructor required for serialization
	}

	public SampleViewModel(int number, String title) {
		super();
		this.number = number;
		this.title = title;
	}

}
