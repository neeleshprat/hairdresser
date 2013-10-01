package de.mannheim.uni.apdtld.teamc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.mannheim.uni.apdtld.teamc.viewmodel.SampleViewModel;

@Path("sample")
public class DummyService {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public String sayHello() {
		return "Hallo!";
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("complex")
	public SampleViewModel getSampleObject() {
		return new SampleViewModel(1, "MyTitle");
	}

}
