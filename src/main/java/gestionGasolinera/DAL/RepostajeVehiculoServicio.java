/**
 * 
 */
package gestionGasolinera.DAL;

/**
 * Interfaz que se va a implementar en RepostajeVehiculoServicioImpl
 *
 */
public interface RepostajeVehiculoServicio {

	//Se reposta en el vehiculo dependiendo si es repostaje normal o con factura.
	public void addFuel(RepostajeVehiculo rv) throws Exception;
}
