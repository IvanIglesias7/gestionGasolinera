package gestionGasolinera.DAL;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository

public class RepostajeVehiculoServicioImpl implements RepostajeVehiculoServicio {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addFuel(RepostajeVehiculo rv) throws Exception{
			em.persist(rv);
			em.clear();
			em.close();
	}

}
