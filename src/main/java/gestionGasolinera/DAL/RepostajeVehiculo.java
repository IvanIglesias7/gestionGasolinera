package gestionGasolinera.DAL;

import java.sql.Date;

import javax.persistence.*;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Entidad que se encarga de cuando un vehiculo reposta gasolina.
 */

@Entity
@Table(name="dlk_gga_tch_repostajeVehiculo",schema="dlk_gestionGasolinera")
public class RepostajeVehiculo {

	// Constructor repostaje factura
	public RepostajeVehiculo(int id, Date fecha, double importe, String dni, String matricula) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
	}

	// Constructor repostaje normal
	public RepostajeVehiculo(int id, Date fecha, double importe) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
	}

	// Constructor vacío
	public RepostajeVehiculo() {
	}

	// Get & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// Atributos

	@Id // Primary Key
	@GeneratedValue // Genera el valor automaticamente
	private int id;
	@Column(nullable=false)
	private Date fecha;
	@Column(nullable=false)
	private double importe;
	@Column(nullable=false)
	private String dni;
	@Column(nullable=false)//TODO:Que tenga un valor por default y no llegue null a la bd.
	private String matricula;

}
