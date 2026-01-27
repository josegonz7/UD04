package ejercicios.hotel;

public class Reserva {
	private int numeroHabitacion;
	private String nombreCliente;
	private String fechaEntrada;
	private int noches;
	
	public Reserva(int numeroHabitacion, String nombreCliente, String fechaEntrada, int noches) {
		this.numeroHabitacion = numeroHabitacion;
		this.nombreCliente = nombreCliente;
		this.fechaEntrada = fechaEntrada;
		this.noches = noches;
	}
	
	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public int getNoches() {
		return noches;
	}

	public void setNoches(int noches) {
		this.noches = noches;
	}
	public double calcularPrecio(int precioPorNoche) {
		return this.noches * precioPorNoche;
	}
	public void mostrarInfo() {
		System.out.println("Fecha entrada: " + this.fechaEntrada);
		System.out.println("Noches: " + this.noches);
		System.out.println("Nombre clientes" + this.nombreCliente);
		System.out.println("Numero habitacion" + this.numeroHabitacion);
	}
}
