package gestionGasolinera.Impl;

import java.util.Calendar;
import java.util.Scanner;


public interface MenuService {

	public int mostrarMenu(Scanner opcionElegida);
	
	public boolean repostajeNormal(Calendar fch_actual, ConsultasService consultas);
}
