package servicio;
import java.util.List;
import modelos.Cliente;

public abstract class Exportador {

	public abstract void exportar(String fileName,List<Cliente> listaCliente);
	
}
