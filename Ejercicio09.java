import java.util.Scanner;

//Realiza un programa que resuelva una ecuaci�n de segundo grado (del tipo ax2 + bx + c = 0).

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un valor para a: ");
		double a = teclado.nextDouble();
		System.out.println("Introduzca un valor para b: ");
		double b = teclado.nextDouble();
		System.out.println("Introduzca un valor para c: ");
		double c = teclado.nextDouble();
		
		if (a == 0){
			System.out.println("La ecuaci�n no tiene soluci�n real.");
		}else{
			System.out.println("x = " + (-b +- Raiz -b^2-4*a*c)/2*a ) ;
			}
		}

	}


