package DesafioIntegrador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioIntegrador {
	Scanner datos = new Scanner(System.in);

	public static void main(String []ars) {
		Scanner datos = new Scanner(System.in);

		int NumIngr = 0, intentos = 0;
		int numeroSecreto = (int) (Math.random() * 100);
		
		System.out.println("tenes 10 intentos para adivinar el numero aleatorio\n");
		
		for(int i = 0; i < 10; i++) {
			intentos++;
			
			try {
		System.out.println("Ingresa un numero del 1 al 100: ");
		NumIngr = datos.nextInt();
		if (NumIngr > 100 || NumIngr < 1) {
			throw new ArithmeticException();
			}
			}catch(InputMismatchException e) {
				System.out.println("Error: Debés ingresar un dato valido.");
				break;
			}catch (ArithmeticException e){
				System.out.println("Error: El valor es menor a 1 o mayor a 100");
				break;
			}
		
		
		
		if (NumIngr < numeroSecreto ) {
			System.out.println("El numero ingresado es menor al numero secreto");
			System.out.println("Intentalo devuelta\n");
		}
		else if (NumIngr > numeroSecreto){
			System.out.println("El numero ingresado es mayor al numero secreto ");
			System.out.println("Intentalo devuelta\n");
		}
		else {
			System.out.println("El numero es igual al numero secreto, ganaste salamin con patas c:\n");
			System.out.println("intentos: "+intentos);
			
			i=10;
			break;
			}
	
		}
	}
}

