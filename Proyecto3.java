package Proyecto3;

import java.util.Scanner;

public class Proyecto3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* Recomiendo usar nombres significativos para las variables.
		 * si el codigo del programa aumenta y son muchas lineas de codigo, 
		 * queda mas legible usar como nombre una referencia a lo que representa la variable.
		 * Por ejemplo si trabajo con fechas, en vez de numeroA, numeroB podrian llamarse diaA, mesA, etc 
		 */
		
		int numeroA;
		int numeroB;
		int numeroC;

	    int numeroAA;
		int numeroBB;
		int numeroCC;

		  System.out.println("2 Fechas formato ddmmaa:");

	  System.out.println("1° Fecha:");
		System.out.println("Ingrese el día:");
		numeroA = sc.nextInt();

		System.out.println("Ingrese el mes");
		numeroB = sc.nextInt();


		  System.out.println("Ingrese el año");
		numeroC = sc.nextInt();

		  System.out.println("2° Fecha:");
		System.out.println("Ingrese el día:");
		numeroAA = sc.nextInt();

		System.out.println("Ingrese el mes");
		numeroBB = sc.nextInt();


		  System.out.println("Ingrese el año");
		numeroCC = sc.nextInt();


		           if(numeroC<numeroCC) {
				System.out.println("La fecha más reciente es:" + numeroA numeroB numeroC);
			} else {
				//¿ que pasaria si numeroC fuera igual a numeroCC? ¿seria mas reciente la fecha 2?
		System.out.println("La fecha más reciente es:" + numeroAA numeroBB numeroCC);
		

	}

}


}
}

		
