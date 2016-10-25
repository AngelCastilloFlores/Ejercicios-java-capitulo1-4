//Realiza un programa que resuelva una ecuaci�n de primer grado del tipo (ax+ b = 0).



import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.println("Por favor, introduzca un valor para a: ");
		double a = teclado.nextDouble();
		System.out.println("A continuaci�n, introduzca un valor para b: ");
		double b = teclado.nextDouble();
		
		if (a == 0){
			System.out.println("Esta ecuaci�n no tiene soluci�n real.");
		}else{
			System.out.println("x = " + (-b/a));
		}
	}
}
