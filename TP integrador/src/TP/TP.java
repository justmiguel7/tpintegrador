package TP;

import java.util.Scanner;

public class TP {
	
	static int [] A = { 1, 2, 3};
	static int [] B = { 1, 2, 3};
	static int [] C = { 1, 2, 3};
	static String [] letras = {"A", "B", "C"};
	static int [] numeros = { 1, 2, 3}; 
	static String [] ocupado = {"A2", "B1", "B3", "C2", "C3"};
	static String asiento = null, letra = null;
	static boolean libre = false;
	static int precioA = 500, precioB = 700, precioC= 1000, preciodeventa = 0, precioTotal = 0;
	
	public static void Ing() {
		Scanner datos = new Scanner(System.in);
		
		while (!libre) {
			
			System.out.println("Ingrese la letra de la fila donde desea sentarse: ");
			letra = datos.next();
			
			for (int i = 0; i < A.length; i++) {
				if (letras[i].equalsIgnoreCase(letra)){
					System.out.println("ingrese el numero del asiento donde desea sentarse: ");
					int numero = datos.nextInt();
					
					for (int j = 0; j < A.length; j++) {
						if (numeros [j] == numero) {
							
							asiento = letra + numero;
							System.out.println(asiento);
							System.out.println("La fila y numero es: " +asiento);
							
						}
					}
					
				}
				
			}
			
			libre = true;
			for (int i = 0; i < ocupado.length; i++) {
				
				if (ocupado[i].equalsIgnoreCase(asiento)) {
				System.out.println("el asiento esta ocupado lol lol looool");
				libre = false;
				}
				
				}
			
			}
			
		}
		
	public static void Precio() {
		 if (letra.equalsIgnoreCase("A")) {
		        preciodeventa = precioA;
		    } else if (letra.equalsIgnoreCase("B")) {
		        preciodeventa = precioB;
		    } else if (letra.equalsIgnoreCase("C")) {
		        preciodeventa = precioC;
		    } else {
		        System.out.println("La letra de la fila no es válida.");
		    }
		        
		System.out.println("el precio de tu fila es: "+preciodeventa);
		
		precioTotal= preciodeventa+precioTotal;
		
		System.out.println("Precio total: " + precioTotal);
		
	}
	public static void main (String[]ars) {
		while (!libre) {
		Ing();
		Precio();
	}
	}
}
