package servicio;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.List;

import modelos.Cliente;

public class ExportadorCsv extends Exportador{

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) {
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName + ".csv")))  {
			for (Cliente cliente : listaClientes)  {
				writer.println(cliente.toString());
			}
			System.out.println("Archivo CSV exportado.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al exportar el archivo CSV: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

	
}
