package Proyecto1;

//Ejercicio Número 1


	
	import java.util.Scanner;

	
	public class Proyecto1 {
	
		public static void main(String[] args){
			
	Scanner sc = new Scanner(System.in);
	int numeroA;
	int numeroB;
	int resultado;
	
	try
	{

	System.out.println("Ingrese el primer N° entero");
	numeroA = sc.nextInt();

	System.out.println("Ingrese el segundo N° entero");
	numeroB = sc.nextInt();

	resultado = numeroA + numeroB;
	System.out.println("La suma es:" + resultado);
	
	resultado = numeroA - numeroB;
	System.out.println("La resta es:" + resultado);
	
	resultado = numeroA * numeroB;
	System.out.println("El producto es:" + resultado);
	
	if (numeroB !=0)
	{
		
	resultado = numeroA / numeroB;
	System.out.println("La división es:" + resultado);
	
	
	
	System.out.println("El resto es:" + (numeroA % numeroB) );
	}  
	
	else
	{	
		System.out.println("No se puede dividir por cero");
	}
	}
	catch(Exception ex)
	{ 
		System.out.println("Ingresó un valor incorrecto");	
	}
		}
	}

