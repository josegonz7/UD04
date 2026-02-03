package ejercicios.aa;

import java.util.Arrays;

public class Actividad19 {
	public static void main(String[] args) {
		int[] array = {1,1,1,1,1,2,2,2,3,3};
		
		System.out.println(modificaArray(array, 10, 3));
	}
	public static void modificaArray(int[] array, int valor, int distancia) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < valor) {
				array[i] -= distancia;
			}
			else if (array[i] > valor) {
				array[i] += distancia;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
