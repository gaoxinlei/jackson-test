package net.webservice.multiversion.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.webservice.bean.Request;
import net.webservice.bean.Response;

@Path("/json")
public interface JsonService {

	@Path("/v0/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response v0Service(Request request,@PathParam("id")Integer id) ;
	
	@Path("/{id}/v1")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response v1Service(Request request,@PathParam("id")Integer id);
}
