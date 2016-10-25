import java.util.Scanner;

//Realiza un programa que calcule la media de las tres notas.

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float operacion;
		float operacion2;
		
		System.out.println("Introduzca la nota del examen 1: ");
		nota1 = teclado.nextFloat();
		System.out.println("Introduzca la nota del examen 2: ");
		nota2 = teclado.nextFloat();
		System.out.println("Introduzca la nota del examen 3: ");
		nota3 = teclado.nextFloat();
		
		operacion = (nota1 + nota2 + nota3);
		operacion2 = ( operacion / 3);
		
		System.out.println("La media de las tres notas es de: " + operacion2);

	}

}
