import java.util.Scanner;

//Vamos a ampliar uno de los ejercicios de la relación anterior para considerar 
//las horas extras. 
//Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas
//ordinarias(40primeras horas de trabajo) se pagan a 12 euros la hora.
//A partir de la hora 41, se pagan a 16 euros lahora.

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horasTrabajadas;
		int operacion;
		int operacion2;
		int horasExtras;
		
		System.out.println("Introduzca las horas trabajadas para calcular el salario del empleado: ");
		horasTrabajadas = teclado.nextInt();
	
		
		if (horasTrabajadas<= 40){
			
			operacion = (horasTrabajadas * 12);
			
			System.out.println("El salario semanal será de: " + operacion);
		}else if
			(horasTrabajadas >= 41)
			System.out.println("Introduzca las horas extras: ");
		horasExtras = teclado.nextInt();
		
		operacion2 = (horasExtras *  16) + 480;
		
		System.out.println("El salario semanal será de: " + operacion2);
			
		}

	}


