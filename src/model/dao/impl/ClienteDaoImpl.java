package model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.dao.IClienteDao;
import model.domain.Cliente;

public class ClienteDaoImpl implements IClienteDao {
	
	@PersistenceContext(unitName="ClientePU")
	private EntityManager em;

	@Override
	public Cliente findByCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> Listar() {
		Query query = em.createQuery("from Cliente");		
		return query.getResultList();
		
	}

	@Override
	public void remover(Cliente cliente) {
		em.remove(cliente);
	}

	@Override
	public Cliente salvarOuAtualizar(Cliente cliente) {
		if (cliente.getCodigo() != null) 
			cliente = em.merge(cliente);
		
		em.persist(cliente);		
		return cliente;
		
	}

}
