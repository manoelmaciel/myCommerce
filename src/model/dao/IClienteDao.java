package model.dao;

import java.util.List;
import model.domain.Cliente;

public interface IClienteDao {
	
	Cliente findByCodigo(Integer codigo);
	
	List<Cliente> Listar();
	
	void remover(Cliente cliente);
	
	Cliente salvarOuAtualizar(Cliente cliente);

}
