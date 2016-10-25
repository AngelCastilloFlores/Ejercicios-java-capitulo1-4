//Realiza un programa que resuelva una ecuación de primer grado del tipo (ax+ b = 0).



import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.println("Por favor, introduzca un valor para a: ");
		double a = teclado.nextDouble();
		System.out.println("A continuación, introduzca un valor para b: ");
		double b = teclado.nextDouble();
		
		if (a == 0){
			System.out.println("Esta ecuación no tiene solución real.");
		}else{
			System.out.println("x = " + (-b/a));
		}
	}
}
