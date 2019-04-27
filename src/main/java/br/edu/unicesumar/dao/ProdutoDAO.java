package br.edu.unicesumar.dao;

import java.util.List;
import javax.persistence.EntityManager;
import br.edu.unicesumar.model.Produto;

public class ProdutoDAO extends DAO{
	private EntityManager manager = getEntityManager();
	
	public void save(Produto produto){
		manager.getTransaction().begin();    
		manager.persist(produto);
		manager.getTransaction().commit();  
	}
	
	public List<Produto> list(){
		return manager.createQuery("from Produto").getResultList();
	}
	
	/*public Produto getById(Long id) {
		
		return manager.find(Produto, id).
	}*/
}