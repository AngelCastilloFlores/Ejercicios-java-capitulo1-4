//Escribe un programa que pida por teclado un d�a de la semana y que diga qu�
//asignatura toca a primera hora ese d�a.

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String dia;
		String lunes;
		String martes;
		String miercoles;
		String jueves;
		String viernes;
		
		System.out.println("Introduzca un d�a de la semana para saber que asginatura toca a 1�: ");
		dia = teclado.nextLine();
		
		if (dia.toUpperCase().equals("lunes")){
			System.out.println("SINF, Lunes a Primera hora.");
		} 
		
		if (dia.equals("martes")) {
			System.out.println("PROGRAMACI�N, Martes a Primera hora.");
		}
		
		if (dia.equals("miercoles")) {
			System.out.println("PROGRAMACI�N, Mi�rcoles a Primera hora.");
		}
		
		if (dia.equals("jueves")) {
			System.out.println("B.D, Jueves a Primera hora.");
		}
		
		if (dia.equals("viernes")) {
			System.out.println("L.M, Viernes a Primera hora.");
		}else{
		System.out.println("Por favor, introduzca un d�a de la semana de Lunes a Viernes.");
		}
		
		
	}

}
