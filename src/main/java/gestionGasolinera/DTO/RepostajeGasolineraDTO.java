package gestionGasolinera.DTO;

import org.springframework.stereotype.Component;

@Component
public class RepostajeGasolineraDTO {

	//Constructor
	public RepostajeGasolineraDTO(int id, double litros, String tipoCombustible, double importeTotal) {
		super();
		this.id = id;
		this.litros = litros;
		this.tipoCombustible = tipoCombustible;
		this.importeTotal = importeTotal;
	}
	
	//Getters and Setters
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
	
	//Atributos
	private int id;
	private double litros;
	private String tipoCombustible;
	private double importeTotal;
}
