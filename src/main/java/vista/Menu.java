package vista;

import java.util.InputMismatchException;
import java.util.Scanner;
import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;

public class Menu {
	protected ClienteServicio clienteservicio;
	protected ArchivoServicio archivoServicio;
	protected ExportadorCsv exportadorCsv;
	protected ExportadorTxt exportadorTxt;
	private String fileName = "Cliente";
	private String fileName1 = "DBClientes.csv";
	private Scanner sc;

	public Menu() {
		clienteservicio = new ClienteServicio();
		archivoServicio = new ArchivoServicio();
		exportadorCsv = new ExportadorCsv();
		exportadorTxt = new ExportadorTxt();
	
	}

	public <sc> void iniciarMenu()  {
		
		System.out.println("----¡Bienvenido(a) a nuestra pastelería “Bon Bon Jovi!”----");
		System.out.println("-------MENÚ-------");
		System.out.println("1. Listar Cliente");
		System.out.println("2. Agregar Cliente");
		System.out.println("3. Editar Cliente");
		System.out.println("4. Cargar Datos");
		System.out.println("5. Exportar Datos");		
		System.out.println("6. Salir");	
		System.out.println("-------------------");	
		System.out.println("Ingrese una opción: ");	
		
		try (Scanner sc = new Scanner(System.in)) {
			try {	
				int opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error");
				sc.nextLine();
			}
		}
		ClienteServicio clServ = new ClienteServicio();
		int opcion;
		switch(opcion)  {
		case 1:
			opcion(clienteservicio.listarCliente());
			
			break;
		case 2:
			opcion2();
			break;
		case 3:
			opcion3();
			break;	
		case 4:
			opcion4();
			break;
		case 5:
			ExportadorTxt txt = new ExportadorTxt();
			txt.limpiaPantalla();
			break;
		case 6:
			boolean terminar = true;
			break;	
		default;
		System.out.println("¡Opción inválida!");
		break;
		}
	}

	private void opcion1() {
		System.out.println("1. Listar Cliente: ");
		
	}

	private void opcion2() {
		System.out.println("2. Agregar Cliente: ");
	}

	private void opcion3() {
		System.out.println("3. Editar Cliente: ");
	}

	private void opcion4() {
		System.out.println("4. Importar Datos: ");
	}

	private void opcion5() {
		System.out.println("5. Exportar Datos: ");
	}

	private void opcion6() {
		System.out.println("6. Salir ");
	}
}
