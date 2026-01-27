package ejercicios.boletin3;

import ejercicios.boletin3.CarritoCompra;
import ejercicios.boletin3.Producto;

public class Main {

	public static void main(String[] args) {

		CarritoCompra carrito = new CarritoCompra();

		Producto p1 = new Producto("pan", 1.00, 2);
		Producto p2 = new Producto("leche", 0.90, 3);
		Producto p3 = new Producto("huevos", 2.50, 1);
		Producto p4 = new Producto("pan", 1.00, 1);

		carrito.agregarProducto(p1);
		carrito.agregarProducto(p2);
		carrito.agregarProducto(p3);
		carrito.agregarProducto(p4);
		carrito.agregarProducto(p2);

		carrito.mostrarCarrito();

		System.out.println("------------------------------------------");
		
		System.out.println("producto buscado: leche");
		carrito.buscarProducto("leche");
	
		System.out.println("--------------------------------------");
		
		System.out.println("quitamos los huevos");
		carrito.eliminarProductoPorNombre("huevos");
		carrito.mostrarCarrito();

		System.out.println("-----------------------------------");
		
		double total = carrito.calcularTotal();
		System.out.println("total del carrito: " + total + "€");
	}

}
