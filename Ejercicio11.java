import java.util.Scanner;

//Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la media noche.

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int hora;
		int minutos;
		int horaUsuario;
		
		System.out.println("Introduzca por teclado una hora, sin minutos (00) ó (13):");
		hora = teclado.nextInt();
		
		System.out.println("A continuación, introduzca los minutos que desee de 0 a 60: ");
		minutos = teclado.nextInt();
		
		int segundosTranscurridos = (hora * 3600) + (minutos * 60);
	    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
	    
	    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minutos, segundosHastaMedianoche);
			
		}
		
	}

