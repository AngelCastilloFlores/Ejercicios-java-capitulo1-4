import java.util.Scanner;

//Realiza un programa que pida una hora por teclado y que muestre luego
//buenos d�as, buenas tardes o buenas noches seg�n la hora. Se utilizar�n los
//tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. S�lo se tienen en
//cuenta las horas, los minutos no se deben introducir por teclado.


public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Introduzca cualqui�r hora: " );
		hora = teclado.nextInt();
		
		if (hora >=6 && hora <=12){
			System.out.println("Buenos d�as!!");
		}else if (hora >=13 && hora <= 20) {
			System.out.println("Buenas Tardes!");
		}else if (hora >= 21 && hora <= 23) {
			System.out.println("Buenas Noches!");
			
		}
			
		}

	}


