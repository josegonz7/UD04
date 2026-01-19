package ejercicios;


import java.util.Random;

public class Tarea1 {

	public class FuncionesArrayInt {
		
	    /*
	     * generaArrayInt: Genera un array de tamaño
		n con números aleatorios cuyo intervalo
 		(mínimo y máximo) se indica como parámetro.
	     */
		
	    public static int[] generaArrayInt(int n, int minimo, int maximo) {
	        Random rand = new Random();
	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            array[i] = rand.nextInt(maximo - minimo + 1) + minimo;
	        }
	        return array;
	    }
	    
	    /*
	     * minimoArrayInt: Devuelve el mínimo del
	     *  array que se pasa como parámetro.
	     */
	    
	    public static int minimoArrayInt(int[] array) {
	        if (array.length == 0) throw new IllegalArgumentException("Array vacío");
	        int minimo = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < minimo) minimo = array[i];
	        }
	        return minimo;
	    }
	    
	    /*
	     * maximoArrayInt: Devuelve el máximo del 
	     * array que se pasa como parámetro.
	     */
	    
	    public static int maximoArrayInt(int[] array) {
	        if (array.length == 0) throw new IllegalArgumentException("Array vacío");
	        int maximo = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > maximo) maximo = array[i];
	        }
	        return maximo;
	    }
	    
	    /*
	     * mediaArrayInt: Devuelve la media del
	     *  array que se pasa como parámetro.
	     */
	    
	    public static double mediaArrayInt(int[] array) {
	        if (array.length == 0) throw new IllegalArgumentException("Array vacío");
	        int suma = 0;
	        for (int num : array) suma += num;
	        return (double) suma / array.length;
	    }
	}

}

