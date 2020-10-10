package proyecto4;

// Ejercicios Número 4 y 5


import java.util.Scanner;

public class Proyecto4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroA;
		int numeroB;
		int numeroC;
		float numerox;
		
		try {
		
System.out.println("Ingrese números del 0 al 10:");

System.out.println("Ingrese la primer nota:");
		numeroA = sc.nextInt();

System.out.println("Ingrese la segunda nota:");
		numeroB = sc.nextInt();

System.out.println("Ingrese la tercer nota:");
		numeroC = sc.nextInt();
		if((numeroA < 1) || (numeroA >10) ||(numeroB < 1) || (numeroB >10)||(numeroC <1) || (numeroC >10)) {
		
		
			System.out.println(" No es válido");	
		}else {

		
		
numerox = (numeroA+numeroB+numeroC)/3;



if(numeroA < 4 ||numeroB <4||numeroC < 4) {
	




System.out.println("Desaprobado el promedio es:"+ numerox);

	
	} else {
	
		System.out.println("Aprobado el promedio es:"+ numerox);


	} 
{
if(numeroA>3 && numeroB >3 && numeroC ==10 || numerox >= 8 )   {
	
	System.out.println("Promocionó");

} else {
	
	System.out.println("No mpromocionó, el promedio es:"+ numerox);
	}
}
		
		}}

catch(Exception ex)
{ 
	System.out.println("Ingresó un valor incorrecto");

}}}



