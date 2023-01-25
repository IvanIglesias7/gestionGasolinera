package gestionGasolinera.Controller;

import java.util.Calendar;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import gestionGasolinera.Impl.ConsultasService;
import gestionGasolinera.Impl.MenuService;
import gestionGasolinera.Impl.MenuServiceImpl;

@Controller
public class GestorGasolinera {

	public static void main(String[] args) {
		// Asignamos el contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		ConsultasService consulta = (ConsultasService) context.getBean(ConsultasService.class);

		// Variables
		MenuService menuS = new MenuServiceImpl();
		Scanner opcionElegida = new Scanner(System.in);
		Calendar fechaActual = Calendar.getInstance();
		Boolean cerrarMenu = false;
		int opcion;

		// El menú solo parará cuando se presione '0'.
		while (!cerrarMenu) {

			// Se muestra el menu
			opcion = menuS.mostrarMenu(opcionElegida);
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);

			switch (opcion) {
			case 0:
				cerrarMenu = true;
				System.out.println("Aplicación cerrada" + opcion);
				break;
			case 1:
				if (menuS.repostajeNormal(fechaActual, consulta)) {
					System.out.println("Nuevo repostaje normal se ha completado correctamente!");
				} else {
					System.out.println("Nuevo repostaje normal ha fallado!");
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				opcion = menuS.mostrarMenu(opcionElegida);
			}

		}

	}

}
