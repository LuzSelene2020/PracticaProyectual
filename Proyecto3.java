package Proyecto3;

import java.util.Scanner;

public class Proyecto3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroA;
		int numeroB;
		int numeroC;

	    int numeroAA;
		int numeroBB;
		int numeroCC;

		  System.out.println("2 Fechas formato ddmmaa:");

	  System.out.println("1� Fecha:");
		System.out.println("Ingrese el d�a:");
		numeroA = sc.nextInt();

		System.out.println("Ingrese el mes");
		numeroB = sc.nextInt();


		  System.out.println("Ingrese el a�o");
		numeroC = sc.nextInt();

		  System.out.println("2� Fecha:");
		System.out.println("Ingrese el d�a:");
		numeroAA = sc.nextInt();

		System.out.println("Ingrese el mes");
		numeroBB = sc.nextInt();


		  System.out.println("Ingrese el a�o");
		numeroCC = sc.nextInt();


		           if(numeroC<numeroCC) {
				System.out.println("La fecha m�s reciente es:" + numeroA numeroB numeroC);
			} else {
				
		System.out.println("La fecha m�s reciente es:" + numeroAA numeroBB numeroCC);
		

	}

}


}
}

		
