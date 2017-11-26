package arrays;

public class Triangulo {
	
	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;
	
	/*
	 * Se crea el constructor de la clase triángulo con parámetros para definir
	 * sus coordenadas
	 */
	public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
		this.puntoA = new Punto (puntoA.getX(), puntoA.getY());
		this.puntoB = new Punto (puntoB.getX(), puntoB.getY());
		this.puntoC = new Punto (puntoC.getX(), puntoC.getY());
	}

	@Override
	public String toString() {
		return "Triangulo [puntoA=" + puntoA + ", puntoB=" + puntoB + ", puntoC=" + puntoC + "]";
	}
	
	/*
	 * Método perímetro que devuelve el perímetro del triángulo.
	 */
	public double perimetro() {
		double perimetro = puntoA.distancia(puntoB) + puntoA.distancia(puntoC) + puntoB.distancia(puntoC);
		return perimetro;
	}


}
