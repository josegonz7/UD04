package ejemplos;

import java.util.Scanner;

public class Diapositiva21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el tamaño de la tabla ");
		int tam = sc.nextInt();
		
		int [] numeros = new int [tam];
		
		for (int i =0; i<=numeros.length-1; i ++) {
			System.out.println("introduce el elemento " + i + ": ");
			int n = sc.nextInt();
			
			numeros[i] =n;
		}
		
		double sumPositivos = 0;
		int contPositivos= 0;
		double sumNegativos = 0;
		int contNegativos = 0;
		int contCeros = 0;
		
		for(int elem : numeros) {
			if (elem > 0) {
				sumPositivos += elem;
				contPositivos++;
			}
			else if (elem < 0) {
				sumNegativos += elem;
				contNegativos++;
			}
			else {
				contCeros++;
			}
	
		}
		
		if(contPositivos == 0) {
			contPositivos = 1;
		}
		if(contNegativos == 0) {
			contNegativos = 1;
		}
		
		System.out.printf("Media positivos: %.2f \n", sumPositivos/contPositivos);
		System.out.printf("Media negativos: %.2f \n", sumNegativos/contNegativos);
		System.out.println("Nº de ceros: " + contCeros);
		
		sc.close();
	}
}
