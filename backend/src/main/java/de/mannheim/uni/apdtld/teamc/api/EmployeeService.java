package de.mannheim.uni.apdtld.teamc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.mannheim.uni.apdtld.teamc.viewmodel.AppointmentOverview;
import de.mannheim.uni.apdtld.teamc.viewmodel.SampleViewModel;

@Path("employee")
public class EmployeeService {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public AppointmentOverview getAppointmentOverview() {
		return new AppointmentOverview();
	}

}
