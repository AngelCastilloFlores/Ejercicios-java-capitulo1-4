//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

import java.util.Scanner;


public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int numero = teclado.nextInt();
		
		if ((numero % 2) == 0) { // si al dvidir el nº entre 2, el resto es 0
			System.out.println("El número que has introducido es par.");
		} else {
			System.out.println("El número que has introducido es impar.");
		}
		
		if ((numero % 5) == 0){ // si al dvidir el nº entre 5, el resto es 0
			System.out.println("El número introducido es multiplo de 5");
		} else {
			System.out.println("El número introducido no es multiplo de 5");
		}
	}

}
