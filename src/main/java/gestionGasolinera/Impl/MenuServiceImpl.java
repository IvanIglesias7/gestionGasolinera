package gestionGasolinera.Impl;

import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

	@Override
	public int mostrarMenu(Scanner opcionElegida) {

		int opcion;
		System.out.println("#################");
		System.out.println("##### MENU ######");
		System.out.println("#################");
		System.out.println("1. Repostaje normal");
		System.out.println("2. Repostaje factura");
		System.out.println("3. Ver todos los repostajes");
		System.out.println("4. Importe total combustible vendido");
		System.out.println("5. Llenado de deposito");
		System.out.println("6. Eliminar ultimo llenado de deposito");
		System.out.println("7. Ver todos los llenados de deposito");
		System.out.println("0. Cerrar menu.");
		System.out.println("[INFO] - Escriba el numero de la opcion deseada: ");
		opcion = opcionElegida.nextInt();
		return opcion;
	}

}
