/**
 * 
 */
package gestionGasolinera.DAL;

import org.springframework.stereotype.Service;

/**
 * Interfaz que va a ser implementada en RepostajeGasolineraImpl
 *
 */
public interface RepostajeGasolineraServicio {

	//Reposta gasolina dependiendo del tipo de combustible
	public void addRepostajeGasolina(RepostajeGasolinera rg);
	
}
