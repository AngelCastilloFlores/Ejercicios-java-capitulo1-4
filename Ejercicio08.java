import java.util.Scanner;

//Amplia el ejercicio anterior para que diga la nota del boletín.


public class Ejercicio08 {
	

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
		
		if (operacion2 <= 5){
			System.out.println("Insuficiente");
		}else if
			(operacion2 > 5 && operacion2 <=5.99){
				System.out.println("Suficiente");
			}else if
			(operacion2 >=6 && operacion2 <=6.99){
				System.out.println("Bien");
			}else if
			(operacion2 >7 && operacion2 <=8.99){
				System.out.println("Notable");
			}else if
			(operacion2 >9 && operacion2 <=9.99){
				System.out.println("Notable Alto");
			}else if
			(operacion2 == 10){
				System.out.println("Sobresaliente");
			}
		}

	}


