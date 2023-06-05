package modelos;

public class Cliente {

	protected String runCliente;
	protected String nombreCliente;
	protected String apellidoCliente;
	protected int anioCliente;

	public Cliente(String runCliente, String nombreCliente, String apellidoCliente, int anioCliente) {
		super();
		this.runCliente = runCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.anioCliente = anioCliente;
	}

	public String getRunCliente() {
		return runCliente;
	}

	public void setRunCliente(String runCliente) {
		this.runCliente = runCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public int getAnioCliente() {
		return anioCliente;
	}

	public void setAnioCliente(int anioCliente) {
		this.anioCliente = anioCliente;
	}

	@Override
	public String toString() {
		return "Cliente [runCliente=" + runCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", anioCliente=" + anioCliente + "]";
	}

	public enum categoriaEnum {
		activo, inactivo
	}
}
