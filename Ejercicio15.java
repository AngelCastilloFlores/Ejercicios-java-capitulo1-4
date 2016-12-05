//Escribe un programa que pinte una pir�mide rellena con un car�cter introducido 
//por teclado que podr� ser una letra, un n�mero o un s�mbolo como *, +,  -, $, &, etc.
//El programa debe permitir al usuario mediante un men� elegir si el v�rtice de la pir�mide est� apuntando
//hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Este programa pinta una pir�mide.");
		System.out.print("Introduzca un car�cter de relleno: ");
		String r = teclado.next();
		System.out.println("Elija un tipo de pir�mide");
		System.out.println("1. Con el v�rtice hacia arriba");
		System.out.println("2. Con el v�rtice hacia abajo");
		System.out.println("3. Con el v�rtice hacia la izquierda");
		System.out.println("4. Con el v�rtice hacia la derecha");
		int opcion = teclado.nextInt();

		switch(opcion) {
			case 1:
        System.out.println("  " + r);
        System.out.println(" " + r + r + r);
        System.out.println(r + r + r + r + r);
        break;
			case 2:
        System.out.println(r + r + r + r + r);
        System.out.println(" " + r + r + r);
        System.out.println("  " + r);
        break;
			case 3:
        System.out.println("    " + r);
        System.out.println("  " + r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println("  " + r + " " + r);
        System.out.println("    " + r);
        break;
			case 4:
        System.out.println(r);
        System.out.println(r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println(r + " " + r);
        System.out.println(r);
        break;
      default:
			
		}

	}

}
