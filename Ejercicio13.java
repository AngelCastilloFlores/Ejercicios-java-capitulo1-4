import java.util.Scanner;

//Escribe un programa que ordene tres n�meros enteros introducidos por teclado.

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int aux;
		
		System.out.println("Este programa ordenar� 3 n�meros enteros que usted introduzca.");
		System.out.println("");
		System.out.println("Por favor, vaya introduciendo los tres n�meros y pulsando INTRO:");
		
	    int a = teclado.nextInt();
	    int b = teclado.nextInt();
	    int c = teclado.nextInt();
		
		if (a > b){
			aux = a;
			a = b;
			b = aux;
		}
		
		if (b > c){
			aux = b;
			b = c;
			c = aux;
		}
		
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		
		System.out.println("Los n�meros introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");


	}

}
