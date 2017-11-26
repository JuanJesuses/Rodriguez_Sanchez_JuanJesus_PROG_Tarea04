package arrays;

import utilidades.Entrada;
import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		
		int numeroTriangulos; // Variable para dar tamaño al array de triángulos.
		Triangulo[] arrayDeTriangulos; // Declaración del array del triángulos.
		double perimetroMedio = 0; // Variable para almacenar la media de los perímetros.
		double perimetroMayor = 0, perimetroMenor = 0; // Variables para almacenar los perímetros mayor y menor.
		int numPerimetroMayor = 0, numPerimetroMenor = 0; //Variables para almacenar el número de perímetros mayores o iguales y menores que la media.
		
		System.out.println("Introduce el número de triágulos que quieres crear: ");
		numeroTriangulos = Entrada.entero();
		arrayDeTriangulos = new Triangulo[numeroTriangulos];
		
		/*
		 * Bucle para crear los vértices de los triángulos y crear
		 * el array con dichos vértices generados aleatoriamente.
		 */
		for(int i=0; i<arrayDeTriangulos.length; i++) {
			Punto verticeA = new Punto((double) Math.random()*100, (double) Math.random()*100);
			Punto verticeB = new Punto((double) Math.random()*100, (double) Math.random()*100);
			Punto verticeC = new Punto((double) Math.random()*100, (double) Math.random()*100);
			arrayDeTriangulos[i]= new Triangulo (verticeA, verticeB, verticeC);
		}
		
		/*
		 * Almacenamos en la variable perímetroMedio todos los perímetros.
		 */
		for(int i=0; i<arrayDeTriangulos.length; i++) {
			System.out.printf("%.2f\n", arrayDeTriangulos[i].perimetro());
			perimetroMedio = perimetroMedio + arrayDeTriangulos[i].perimetro();
		}
		
		/*
		 * Calculamos el perímetro medio y lo guardamos en la variable perímetroMedio.
		 */
		perimetroMedio=(int)perimetroMedio/numeroTriangulos;
		System.out.printf("El perímetro medio de los triángulos es: %.2f\n", perimetroMedio);
		
		/*
		 * Almacenamos los perímetros mayores o iguales que la media y los menores o iguales
		 * en sus respectivas variables.
		 */
		for(int i=0; i<arrayDeTriangulos.length; i++) {
			if(arrayDeTriangulos[i].perimetro()>=perimetroMedio) {
				numPerimetroMayor++;
			}else {
				numPerimetroMenor++;
			}
		}
		System.out.printf("El número de triángulos con un perímetro mayor o igual a la media es de %d triángulos\n", numPerimetroMayor);
		System.out.printf("El número de triángulos con un perímetro menor que la media es de %d triángulos\n", numPerimetroMenor);
		
		/*
		 * Recorremos el array para saber cual es el menor y el mayor
		 * de los perímetros y los almacenamos en sus respectivas variables.
		 */
		perimetroMayor = arrayDeTriangulos[0].perimetro();
		perimetroMenor = arrayDeTriangulos[0].perimetro();
		for(int i=0; i<arrayDeTriangulos.length; i++) {
			if(perimetroMayor < arrayDeTriangulos[i].perimetro()) {
				perimetroMayor=arrayDeTriangulos[i].perimetro();
			}else if(perimetroMenor > arrayDeTriangulos[i].perimetro()){
				perimetroMenor=arrayDeTriangulos[i].perimetro();
			}
		}
		
		System.out.printf("El triángulo de mayor perímetro mide: %.2f\n", perimetroMayor);
		System.out.printf("El triángulo de menor perímetro mide: %.2f\n", perimetroMenor);
	}

}
