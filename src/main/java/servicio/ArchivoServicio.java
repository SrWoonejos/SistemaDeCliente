package servicio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import modelos.Cliente;

public class ArchivoServicio extends Exportador{
	
	@Override
	public void exportar (String fileName, ClienteServicio clienteServicio, Scanner sc) {	
	}

	public void cargarDatos(String fileName)  {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))  {
			String line;
			while((line = reader.readLine()) != null)  {
				System.out.println(line);
			}
			System.out.println("Datos se cargaron correctamente desde el archivo. ");
		} catch (IOException e)  {
			System.out.println("¡Error! no se cargaron correctamente los datos desde el archivo: ");
		}	
		}
	}
