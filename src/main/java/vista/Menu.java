package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import modelos.Cliente;
import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;

public class Menu extends ClienteServicio{

	protected ClienteServicio clienteServicio;
	protected ArchivoServicio archivoServicio;
	protected ExportadorCsv exportadorCsv;
	protected ExportadorTxt exportadorTxt;
	protected String fileName = "Cliente";
	protected String fileName1 = "DBClientes.csv";
	protected Scanner sc;

	public Menu() {
		clienteServicio = new ClienteServicio();
		archivoServicio = new ArchivoServicio();
		exportadorCsv = new ExportadorCsv();
		exportadorTxt = new ExportadorTxt();
		sc = new Scanner(System.in);
	}

	public void iniciarMenu()  {
		
		int opcion;
		do {
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
		opcion = sc.nextInt();
		
		switch(opcion)  {
		case 1:
			listarCliente();			
			break;
		case 2:
			agregarCliente();
			break;
		case 3:
			editarCliente();
			break;	
		case 4:
			cargarDatos();
			break;
		case 5:
			importarDatos();
			ExportadorTxt txt = new ExportadorTxt();
			txt.limpiaPantalla();
			break;
		case 6:
			terminarPrograma();
			break;	
		default;
		System.out.println("¡Opción inválida!");
		break;
		}
	} while (opcion!=6);
	}

	private void listarCliente() {
		clienteServicio.listarCliente();
		System.out.println("--------Datos del Cliente--------");
		for(Cliente cliente : clienteServicio.getListaClientes())  {
			System.out.println("Run del Cliente: " + cliente.getRunCliente());
			System.out.println("Nombre del Cliente: " + cliente.getRunCliente());
			System.out.println("Apellido del Cliente: " + cliente.getRunCliente());
			System.out.println("Años como Cliente de nuestra pasteleria: " + cliente.getRunCliente());
			System.out.println("Categoría del Cliente: " + cliente.categoriaEnum());
		}
	}

	private void agregarCliente() {
		clienteServicio.agregarCliente();
		System.out.println("--------Crear Cliente--------");
		System.out.println("Ingrese el RUN del Cliente: ");
		String run =sc.next();
		System.out.println("Ingrese el Nombre del Cliente: ");
		String nombre = sc.next();
		System.out.println("Ingrese el Apellido del Cliente: ");
		String apellido = sc.next();
		System.out.println("Ingrese los años que lleva como Cliente de la pasteleria: ");
		int anios = sc.nextInt();
		
		Cliente cliente1 = new Cliente(run, nombre, apellido, anios);
		Cliente nuevoCliente;
		clienteServicio.agregarCliente(nuevoCliente);
		System.out.println("---------------------------------------");
	    System.out.println("Cliente agregado con éxito.");
	}

	private void editarCliente() {
		clienteServicio.editarCliente();
	}

	private void importarDatos() {
		clienteServicio.cargarDatos(fileName1);
	}

	private void exportarDatos() {
		System.out.println("Seleccione el formato para exportar el archivo: ");
		System.out.println("1. CSV ");
		System.out.println("2. TXT ");
		System.out.println("Mi opción es: ");
		int opcion = sc.nextInt();
		
		switch (opcion)  {
		case 1:
			exportadorCsv.exportarCliente(clienteServicio.listarClientes(), fileName);
			break;
		case 2;
		    ExportadorTxt.exportarCliente(clienteServicio.listarClientes(), fileName);
		    break;
		}
		}

	private void terminarPrograma() {
		System.out.println("¡Gracias por preferirnos! ");
		System.exit(0);
	}
}
