import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		// TODO Auto-generated method stub
// Aquí voy a poner mi código
	Proyecto9bis();
	}
	public static void Proyecto9bis() {
		Scanner sc = new Scanner(System.in);
		
		try
		{
		
			System.out.println("Ingrese varios números enteros, y un número negativo para finalizar");
			
			long acumulador = 0;
			int numeroA;
	
			
		do
		{
			numeroA = sc.nextInt();
		if (numeroA > 0)
		
		{
			acumulador = acumulador + numeroA;
		}
		} while ( numeroA>= 0); 
		    	
		    System.out.println("La suma es:" + acumulador);
		
		   
		
		}
		catch(Exception ex)
		{ 
			System.out.println("Ingresó un valor incorrecto");	
		}



	}

}

