package ejemplos;

import java.util.Arrays;

public class Diapositiva25 {

   public static void main(String[] args) {
      int t[] = rellenaPares(10, 100); 
      
      System.out.println(Arrays.toString(t)); 
   }

   
   static int[] rellenaPares(int tamano, int fin) {
      int tablaOrdenada[] = new int[tamano];

      int i = 0; 
      
      while (i < tablaOrdenada.length) {
         int num = (int)(Math.random()*fin + 1);
         if (num % 2 == 0) { 
            tablaOrdenada[i] = num;  
            i++; 
         } 
      }

      Arrays.sort(tablaOrdenada);
      return (tablaOrdenada);
   }
}
