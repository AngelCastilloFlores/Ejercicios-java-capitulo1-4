//Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
//Aplica la fórmula:  t =√2h/g siendo g = 9.81m/s^2

import java.util.Scanner;

public class Ejercicio06 {
	
	static double g = 9.81;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la altura en metros, h: ");
		double h = teclado.nextDouble();
		
		double s = Math.sqrt(2*h/g);
		
		System.out.println("El tiempo que tardará en caer un objeto desde una altura de " + h );
		System.out.println(" es de: t = " + s);

	}

}
