package model.facade.rs;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebMethod;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.domain.Cliente;

@Path("/cliente")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ClienteFacade {

	// @WebMethod(operationName="getClientes")
	
	@GET
	public List<Cliente> getClientes() {
		
		return Arrays.asList(new Cliente(1, "Manoel", "manoel@gmail.com"),
				new Cliente(2, "carlos", "carlos@gmail.com"));
		
	}

	@WebMethod(operationName="getCliente")
	public List<Cliente> getCliente(Cliente cliente) {
		
		return Arrays.asList(new Cliente(1, "Manoel", "manoel@gmail.com"),
				new Cliente(2, "carlos", "carlos@gmail.com"));
		
	}
	
}
