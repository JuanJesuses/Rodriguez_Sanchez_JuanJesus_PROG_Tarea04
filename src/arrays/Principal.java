package arrays;

import utilidades.Entrada;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		int numeroTriangulos;
		Triangulo[] arrayDeTriangulos;
		double perimetro=0, perimetroMedio=0;
		
		
		System.out.println("Introduce el número de triágulos que quieres crear: ");
		numeroTriangulos = Entrada.entero();
		arrayDeTriangulos = new Triangulo[numeroTriangulos];
		
		
		for(int i=0; i<arrayDeTriangulos.length; i++) {
			Punto verticeA = new Punto((double) Math.random()*100, (double) Math.random()*100);
			Punto verticeB = new Punto((double) Math.random()*100, (double) Math.random()*100);
			Punto verticeC = new Punto((double) Math.random()*100, (double) Math.random()*100);
			arrayDeTriangulos[i]= new Triangulo (verticeA, verticeB, verticeC);
		}
		
		for(int i=0; i<arrayDeTriangulos.length; i++) {
			perimetro = perimetro + arrayDeTriangulos[i].perimetro();
			System.out.println(perimetro);
		}
		
		perimetroMedio=(int)perimetro/numeroTriangulos;
		System.out.printf("El perímetro medio de los triángulos es: %.2f", perimetroMedio);
		
	}

}
