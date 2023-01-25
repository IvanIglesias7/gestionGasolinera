package gestionGasolinera.DTO;

import java.sql.Date;

public class RepostajeVehiculoDTO {

	// GETTERS & SETTERS
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

	// CONSTRUCTORES

	// FACTURA
	public RepostajeVehiculoDTO(Date fecha, double importe, String dni, String matricula) {
		super();
		this.fecha = fecha;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
	}

	// IMPORTE NORMAL
	public RepostajeVehiculoDTO(Date fecha, double importe) {
		super();
		this.fecha = fecha;
		this.importe = importe;
	}

	// ATRIBUTOS
	private Date fecha;
	private double importe;
	private String dni;
	private String matricula;
}
