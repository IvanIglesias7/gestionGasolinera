package gestionGasolinera.DAL;

import javax.persistence.*;
import org.springframework.lang.NonNull;

/**
 * Entidad que se encargará de almacenar cuando un camion cisterna rellena los
 * depositos de la gasolinera
 */
/*
 * IMPORTANTE: La base de datos y el esquema si hay que crearlo. La tabla se generará sola.
 */

@Entity
@Table(name="dlk_gga_tch_repostajeGasolinera",schema="dlk_gestionGasolinera")
public class RepostajeGasolinera {

	public RepostajeGasolinera(int id, double litros, String tipoCombustible, double importeTotal) {
		super();
		this.id = id;
		this.litros = litros;
		this.tipoCombustible = tipoCombustible;
		this.importeTotal = importeTotal;
	}

	public RepostajeGasolinera() {
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	// Atributos

	@Id // @Id indica que es un PrimaryKey
	@GeneratedValue // @GeneratedValue indica que el valor es automaticamente generado por el
					// servidor
	private int id;

	@Column(name = "litros")
	@NonNull
	private double litros;
	@Column(name = "tipoCombustible")
	@NonNull
	private String tipoCombustible;
	@Column(name = "importeTotal")
	@NonNull
	private double importeTotal;
}
