package Proyecto7;
// Ejercicio 7

import java.util.Scanner;

public class Proyecto7 {

	public static void main(String[] args) {
/* 
 * 
 * Propongo lo siguiente, que pasaria si en vez de la suma y la multiplicacion por 2:
 * 			numeroA++;
			numeroC = numeroA * 2;
	pusiera: 
	        numeroA = numeroA +2; 
   ¿ No seria mas simple?		 
   
   No entiendo porque hay dos while anidados. Creo que es mejor pensar una solucion usando solo uno.
 */
		
		int numeroA = 0;
		int numeroB = 2;
		int numeroC = numeroA * numeroB;

		while (numeroC < 102) {
			System.out.println(numeroC);
			numeroA++;
			numeroC = numeroA * 2;

			while (numeroC < 102) {
				System.out.println(numeroC);
				numeroA++;
				numeroC = numeroA * 2;
			}

		}
	}
}