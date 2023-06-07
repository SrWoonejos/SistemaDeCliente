package servicio;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.List;
import modelos.Cliente;


public class ExportadorTxt extends Exportador{

	@Override
	public void exportar(String fileName, List<Cliente> listaCliente) {
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName + ".txt")))  {
			for (Cliente cliente : listaCliente)  {
				writer.println(cliente.toString());
			}
			System.out.println("Archivo TXT exportado.");
		} catch (IOException e) {
			System.out.println("Error al exportar el archivo TXT: " + e.getMessage());
			e.printStackTrace();
		}
	
		
	}

	//public static void exportarCliente(List<Cliente> listarClientes, String fileName) {
		// TODO Auto-generated method stub
		
	}

	//public static void exportarCliente(List<Cliente> listarClientes, String fileName) {
		// TODO Auto-generated method stub
		
	}

	
}
