package gestionGasolinera.DAL;

import javax.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class RepostajeGasolineraServicioImpl implements RepostajeGasolineraServicio {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addRepostajeGasolina(RepostajeGasolinera rg) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
	
}
