package ejercicios.boletin3;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
	private List<Producto> producto;
	
	public CarritoCompra() {
		this.producto = new ArrayList<>();
	}
	public void agregarProducto(Producto p) {
		boolean encontrado = false;
		for(Producto prod : this.producto) {
			if(prod.getNombre().equals(p.getNombre()) && !encontrado) {
				prod.setCantidad(prod.getCantidad() + p.getCantidad());
				encontrado = true;
			}
		}
		if (!encontrado) {
			this.producto.add(p);
		}
	}
	public void eliminarProductoPorNombre(String nombre) {
		Producto eliminar = null;
		for(Producto p : this.producto) {
			if(p.getNombre().equals(nombre) && eliminar == null) {
				eliminar = p;
			}
		}
		if (eliminar != null) {
			this.producto.remove(eliminar);
		}
			
	}
	public Producto buscarProducto(String nombre) {
		Producto buscar = null;
		for(Producto p : this.producto) {
			if(p.getNombre().equals(nombre) && buscar == null) {
				buscar = p;
			}
		}
		if (buscar != null) {
			System.out.println("encontrado: " + buscar.getNombre() + " cantidad: " + buscar.getCantidad());
		
		} else {
			System.out.println("producto no encontrado.");
		}
		return buscar;
	}				
	public double calcularTotal() {
		double total = 0.0;
		for(Producto p : this.producto) {
			total += p.getPrecioUnitario();
		}
		return total;
	}
	public void mostrarCarrito() {
		System.out.println("Carrito de la compra");
		for(Producto p : this.producto) {
			System.out.println(p.getNombre() + ": " + p.getCantidad());
		}
	}
	public int contarProductosDistintos() {
		return this.producto.size();
	}	
}
