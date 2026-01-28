package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Boletin1 {
	public static void main(String[] args) {
		System.out.println(fibonacci(3));
	}
	
	/*
	 * generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
	 * intervalo (mínimo y máximo) se indica como parámetro.
	 */

	public static int[] generaArrayInt(int tam, int min, int max) {
		int[] array = new int[tam];
		Random r = new Random();
		for (int i = 0; i < tam; i++) {
			array[i] = r.nextInt(max - min + 1) + min;
		}
		return array;
	}

	/*
	 * minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
	 */
	public static int minimoArrayInt(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}

	/*
	 * maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
	 */
	public static int maximoArrayInt(int[] array) {
		int maximo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}

	/*
	 * mediaArrayInt: Devuelve la media del array que se pasa como parámetro
	 */
	public static double mediaArrayInt(int[] array) {
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma / array.length;
	}

	public static double mediaArrayInt2(int[] array) {
		double media = 0.0;
		for (int elem : array) {
			media += elem;
		}
		return media / array.length;
	}

	public static void voltea(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		for (int i = copia.length - 1; i >= 0; i--) {
			original[i] = copia[copia.length - 1 - i];
		}
	}

	public static void desplazaUnoDerechaArrayInt(int[] original) {
		int[] derecha = Arrays.copyOf(original, original.length);
		for (int i = 0; i < original.length - 1; i++) {
			original[i + 1] = derecha[i];
		}
		original[0] = derecha[derecha.length - 1];
	}

	public static void desplazaDerechaArrayInt(int[] original, int nposiciones) {
		for (int i = 0; i < nposiciones; i++) {
			desplazaUnoDerechaArrayInt(original);
		}
	}

	public static int[] fibonacci(int n) {
		if (n < 2) {
			throw new IllegalArgumentException("el numero debe ser mayor o igual a 2");
		}
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci;
	}
	public static int[] calculaModaint(int[] array) {
		int moda = array[0];
		int repeticionesMax = 0;
		
		for (int e: array) {
			int repeticiones = 0;
			for(int f: array) {
				if (e == f) {
					repeticiones++;
				}
			}
			if (repeticiones > repeticionesMax) {
				moda = e;
				repeticionesMax = repeticiones;
			}
		}
		return moda;
	}
}