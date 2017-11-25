package arrays;

import utilidades.Entrada;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		int numeroTriangulos;
		Triangulo[] arrayDeTriangulos;
		
		
		System.out.println("Introduce el número de triágulos que quieres crear: ");
		numeroTriangulos = Entrada.entero();
		arrayDeTriangulos = new Triangulo[numeroTriangulos];
		
		
		for(int i=0; i<arrayDeTriangulos.length-1; i++) {
			Punto verticeA = new Punto((int) Math.random()*100, (int) Math.random()*100);
			Punto verticeB = new Punto((int) Math.random()*100, (int) Math.random()*100);
			Punto verticeC = new Punto((int) Math.random()*100, (int) Math.random()*100);
			arrayDeTriangulos[i]= new Triangulo (verticeA, verticeB, verticeC);
		}
		
	}

}
