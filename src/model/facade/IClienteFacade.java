package model.facade;

import java.util.List;

import model.domain.Cliente;

public interface IClienteFacade {

	List<Cliente> getClientes();

	List<Cliente> getClientes(Integer codigo);

	Cliente salvar(Cliente cliente);

	void atualizar(Cliente cliente);

	void deletar(Integer codigo);

}