import java.util.Scanner;

//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
//Cada pregunta acertada sumar� un punto. El programa mostrar� al final la calificaci�n obtenida.
//P�sale el mini cuestionario a tus compa�eros y p�deles que lo hagan para ver
//qu� tal andan de conocimientos en las diferentes asignaturas del curso

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int puntos = 0;
		int a;
		int b;
		int c;
		String respuesta;
		
		System.out.println("Cuestionario alumnado 1� DAW");
		System.out.println("----------------------------");
		System.out.println("A continuaci�n, responda a las siguientes preguntas con a / b / c: ");
		System.out.println("");
		System.out.println("");
		
		System.out.println("1) �Qu� lenguaje veremos en Programaci�n?");
		System.out.println("ADA");
		System.out.println("BASIC");
		System.out.println("JAVA");
		
		respuesta = teclado.toString();
		
		if (respuesta.equals("c")){
			puntos++;
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("2) �Con que etiqueta iniciamos un documento en HTML?");
		System.out.println("<head>");
		System.out.println("<html>");
		System.out.println("<hola>");
		
		respuesta = teclado.toString();
		
		if (respuesta.equals("b")){
			puntos++;
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("3) Con que comando podremos hacer una lectura de los archivos que hay en un directorio (en linux)");
		System.out.println("ls");
		System.out.println("cd");
		System.out.println("..");
		
		respuesta = teclado.toString();
		
		if (respuesta.equals("a")){
			puntos++;
		}

		System.out.println("");
		System.out.println("");
		
		 System.out.println("Ha obtenido " + puntos + " puntos.");
		
	}

}
