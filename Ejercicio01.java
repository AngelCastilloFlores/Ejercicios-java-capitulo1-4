//Escribe un programa que pida por teclado un día de la semana y que diga qué
//asignatura toca a primera hora ese día.

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
		
		System.out.println("Introduzca un día de la semana para saber que asginatura toca a 1ª: ");
		dia = teclado.nextLine();
		
		if (dia.toUpperCase().equals("lunes")){
			System.out.println("SINF, Lunes a Primera hora.");
		} 
		
		if (dia.equals("martes")) {
			System.out.println("PROGRAMACIÓN, Martes a Primera hora.");
		}
		
		if (dia.equals("miercoles")) {
			System.out.println("PROGRAMACIÓN, Miércoles a Primera hora.");
		}
		
		if (dia.equals("jueves")) {
			System.out.println("B.D, Jueves a Primera hora.");
		}
		
		if (dia.equals("viernes")) {
			System.out.println("L.M, Viernes a Primera hora.");
		}else{
		System.out.println("Por favor, introduzca un día de la semana de Lunes a Viernes.");
		}
		
		
	}

}
