import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		// TODO Auto-generated method stub
// Aqu� voy a poner mi c�digo
	Proyecto9();
	}
	public static void Proyecto9() {
		Scanner sc = new Scanner(System.in);
		
		long acumulador = 0;
		int numeroA;
		
		try
		{
			
			
			System.out.println("Ingrese varios n�meros enteros, y un n�mero negativo para finalizar");
			
			
	
			numeroA = sc.nextInt();
		
		  	
		    while ( numeroA>= 0) {
		    	acumulador = acumulador + numeroA;
		    	numeroA = sc.nextInt();
		    	
		}
		    System.out.println("La suma es:" + acumulador);
		   
		}
		catch(Exception ex)
		{ 
			System.out.println("Ingres� un valor incorrecto");	
		}

		    
		
		
		
		
	}
		

	}


