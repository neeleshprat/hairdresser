package de.mannheim.uni.apdtld.teamc;

import static org.junit.Assert.*;

import org.junit.Test;

public class DummyTest {

	@Test
	public void sayHello() {
		assertEquals("Hello", new Dummy().sayHello());
	}

}
