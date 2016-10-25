import java.util.Scanner;

//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.


public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un número del 1 - 7 para saber el día de la semana: ");
		numero = teclado.nextInt();
		
		switch (numero){
		case 1: 
			System.out.println("El número 1 corresponde a Lunes.");
		break;
		
		case 2: 
			System.out.println("El número 2 corresponde a Martes.");
			break;
			
		case 3: 
			System.out.println("El número 3 corresponde a Miércoles.");
			break;
			
		case 4: 
			System.out.println("El número 4 corresponde a Jueves.");
			break;
			
		case 5: 
			System.out.println("El número 5 corresponde a Viernes.");
			break;
			
		case 6:
			System.out.println("El número 6 corresponde a Sabado.");
			break;
			
		case 7:
			System.out.println("El número 7 corresponde a Domingo.");
			default:
				System.out.println("Por favor, introduzca un número del 1 al 7.");
			}
			
		}

	}


