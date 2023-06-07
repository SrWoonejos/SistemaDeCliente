package servicio;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.List;
import modelos.Cliente;

//guardar archivo y guardar un submenu para que lo exporte en ambos formatos
public class ExportadorCsv extends Exportador{

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) {
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName + ".csv")))  {
			for (Cliente cliente : listaClientes)  {
				writer.println(cliente.getNombreCliente() + "," +
			                   cliente.getApellidoCliente() + "," +
						       cliente.getRunCliente()	+ "," +
			                   cliente.getAnioCliente());
			}
			
			System.out.println("Archivo CSV exportado.");
		} catch (IOException e) {
			System.out.println("Error al exportar el archivo CSV: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
//servicio, importar y exportar son lo 1ero a resolver
//clase servicio es una clase de implementacion y es general e instanciar con objeto en la clase main y asi se llaman agregar, elimiar y partir con als estructuras mas grales	

	public void exportarCliente(List<Cliente> listarClientes, String fileName) {	
	}
}

