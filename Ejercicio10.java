import java.util.Scanner;

//Escribe un programa que nos diga el hor�scopo a partir del d�a y el mes de nacimiento.
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String horoscopo = "";
		
		System.out.println("Introduzca el d�a en que naci�: ");
		int dia = teclado.nextInt();
		System.out.println("A continuaci�n, introduzca el mes en que naci�: ");
		int mes = teclado.nextInt();
		
		switch (mes){
		case 1: 
			if (dia < 21){
				horoscopo = "capricornio";
			}else{
				horoscopo = "Acuario";
				}
				break;
			
				
				
			}
		}
		
		
	}


