import java.util.Scanner;

//Escribe un programa en que dado un n�mero del 1 a 7 escriba el correspondiente nombre del d�a de la semana.


public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un n�mero del 1 - 7 para saber el d�a de la semana: ");
		numero = teclado.nextInt();
		
		switch (numero){
		case 1: 
			System.out.println("El n�mero 1 corresponde a Lunes.");
		break;
		
		case 2: 
			System.out.println("El n�mero 2 corresponde a Martes.");
			break;
			
		case 3: 
			System.out.println("El n�mero 3 corresponde a Mi�rcoles.");
			break;
			
		case 4: 
			System.out.println("El n�mero 4 corresponde a Jueves.");
			break;
			
		case 5: 
			System.out.println("El n�mero 5 corresponde a Viernes.");
			break;
			
		case 6:
			System.out.println("El n�mero 6 corresponde a Sabado.");
			break;
			
		case 7:
			System.out.println("El n�mero 7 corresponde a Domingo.");
			default:
				System.out.println("Por favor, introduzca un n�mero del 1 al 7.");
			}
			
		}

	}


