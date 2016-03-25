package model.facade.ws;

import java.util.Arrays;
import java.util.List;

// import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

// import model.dao.IClienteDao;
import model.domain.Cliente;

@WebService(serviceName="ws/cliente")
public class ClienteFacade {
	
	@WebMethod(operationName="getClientes")
	public List<Cliente> getClientes() {
		
		return Arrays.asList(new Cliente(1, "Manoel", "manoel@gmail.com"),
				new Cliente(2, "carlos", "carlos@gmail.com"));
		
	}

	@WebMethod(operationName="getCliente")
	public List<Cliente> getCliente(Cliente cliente) {
		
		return Arrays.asList(new Cliente(1, "Manoel", "manoel@gmail.com"),
				new Cliente(2, "carlos", "carlos@gmail.com"));
		
	}
	
	// @Inject
	// private IClienteDao dao;

	// @Override
	// @Transactional
	// @WebMethod(operationName="salvar")
	// public void salvar(Cliente cliente) {

		// cliente = new Cliente(3, "Alexandre", "alexandre@xandao.com");
		
		// dao.salvarOuAtualizar(cliente);
		
	// }



}
