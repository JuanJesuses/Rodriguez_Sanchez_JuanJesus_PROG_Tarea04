package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;
/*
 * Programa que pide una matrícula española y, si es correcta, la
 * muestra por pantalla, en caso de no serlo, la vuelve a pedir.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Pattern patron=Pattern.compile("([0-9]{4})([A-Z&&[^AEIOU]]{3})");// Declaramos la expresión variable a validar
		Matcher emparejador;
		String matricula;
		
		System.out.println("Introduce la matrícula de un vehículo español: ");
		
		do {
			matricula = Entrada.cadena();
			emparejador = patron.matcher(matricula);
			
			if(emparejador.matches()) {
				System.out.println("La matrícula introducida es correcta.");
				System.out.println("Su identificación es: " + emparejador.group(1) + " " + emparejador.group(2));
			}else {
				System.out.println("La matrícula no es correcta. Por favor vuelve a intentarlo: ");
			}
		}while(!emparejador.matches());
	}

}
