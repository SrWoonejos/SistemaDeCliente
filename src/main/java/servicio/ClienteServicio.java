package servicio;
import java.util.List;
import modelos.Cliente;
import java.util.ArrayList;

public class ClienteServicio {
	
protected List<Cliente> listaClientes;
	
	public ClienteServicio()  {
	}
	
	public void agregarCliente(Cliente cliente)  {
		listaClientes.add(cliente);
	}
	
	public void edictarCliente(Cliente cliente)  {
	}
	
	public List<Cliente> listarClientes()  {
		for (Cliente cliente : listaClientes)  {
			System.out.println(cliente.toString());
		}
		return listaClientes;
	}
	public List<Cliente> getListaClientes()  {
		return listaClientes;
	}
	public void exportarCliente(Exportador exportador, String fileName)  {
	}

	public Object listarCliente() {
		return null;
	}
}
