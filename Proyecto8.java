package Proyecto8;

import java.util.Scanner;

public class Proyecto8 {
	// Ejercicio Nro. 6

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short mes;

		try {
			System.out.println("Ingrese un mes");
			mes = (short) sc.nextInt();
			if ((mes < 1) || (mes > 12)) {
				System.out.println(" No es un mes v�lido");
			} else {

				switch (mes)

				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:

					System.out.println("El mes tiene 31 d�as");
					break;
				case 2:
					System.out.println("El mes tiene 28 d�as");
					break;
				case 4:
				case 6:
				case 9:
				case 11:

					System.out.println("El mes tiene 30 d�as");
					break;

				default:
					System.out.println(" No es un mes v�lido, ingrese un n�mero entre 1 y 12");

				}
			}
		}

		catch (Exception ex) {
			System.out.println("Ingres� un valor incorrecto");

		}

	}

}
