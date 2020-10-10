package Proyecto2;

//Ejercicio Número 2

import java.util.Scanner;

public class Proyecto2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroA;
		int numeroB;
		try
		{

		System.out.println("Ingrese un N° entero");
		numeroA = sc.nextInt();

		System.out.println("Ingrese un N° entero");
		numeroB = sc.nextInt();
		
		if(numeroA<numeroB) {
			System.out.println("El mayor es el N°:" + numeroB);
		} else {
			if(numeroA>numeroB) {
				System.out.println("El mayor es el N°:" + numeroA);	
			} else {
				System.out.println("Los números son iguales");	
			}
		}
		}

		catch(Exception ex)
		{ 
			System.out.println("Ingresó un valor incorrecto");	
		}


	}

}



