package Proyecto6;

//Ejercicio Nro. 6

import java.util.Scanner;

public class Proyecto6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroA;
		
		try
		{
		
		System.out.println("Ingrese un N� que representa un mes del a�o, por ejemplo 1 es enero, 2 es febrero");

		numeroA = sc.nextInt();
if ((numeroA <1) || (numeroA >12))
{
	System.out.println(" No es un mes v�lido");	
}else {

		if((numeroA == 4) || (numeroA == 6) ||(numeroA == 9)||(numeroA == 11)) {
			
			System.out.println("Este mes tiene 30 d�as");
		
		} else {
			if(numeroA==2) {
				System.out.println("Este mes tiene 28 d�as" );	
				
			} else {
				System.out.println("Este mes tiene 31 d�as");	
			}
		}}}
		
		catch(Exception ex)
		{ 
			System.out.println("Ingres� un valor incorrecto");	

		}
	}
}



