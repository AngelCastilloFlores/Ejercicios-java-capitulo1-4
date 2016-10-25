import java.util.Scanner;

//Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String horoscopo = "";
		
		System.out.println("Introduzca el día en que nació: ");
		int dia = teclado.nextInt();
		System.out.println("A continuación, introduzca el mes en que nació: ");
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


