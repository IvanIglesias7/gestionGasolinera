package gestionGasolinera.DAL;

import javax.persistence.*;

/**
 * Entidad que maneja los tipos de combustibles, unicamente será un catálogo.
 */

@Entity
@Table(name="dlk_gga_tch_TiposCombustible",schema="dlk_gestionGasolinera")
public class TiposCombustible {

	// Atributos

	@Id // Primary Key
	@GeneratedValue // Genera el valor automaticamente
	private int id;

	@Column(name = "tipoCombustible")
	private String tipoCombustible;
}
