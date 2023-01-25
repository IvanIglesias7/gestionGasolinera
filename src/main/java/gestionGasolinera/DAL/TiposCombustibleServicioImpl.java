package gestionGasolinera.DAL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class TiposCombustibleServicioImpl implements TiposCombustibleServicio {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<TiposCombustible> listarTipos() {
		// TODO Auto-generated method stub
		return null;
	}

}
