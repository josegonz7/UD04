package ejemplosArrays;

public class Quicksort {
	public static void main(String[] args) {
		int[] tabla = { 14, 88, 5, 42, 71, 29, 63 };

	}

	public static int ordernar(int[] tabla, int min, int max) {
		// cogemos el 42 como pivote
		
		int pivote = tabla [(min + max)/2];
		
		for(int i=0, j = tabla.length-1; i<=tabla.length-1, i!=j; i++, j--) {
			if (i>pivote && i>pivote) {
				int aux = tabla [j];
				tabla[j] = tabla [i];
				tabla[i] = aux;
			} else if (i == j+1) {
				tabla [i] = pivote;
			}
		}
		ordernar(tabla, 0, pivote-1);
		ordernar(tabla, pivote + 1, tabla.length-1);
	}
}
