package arrays;

public class Triangulo {
	
	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;
	
	public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
		this.puntoA = new Punto (puntoA.getX(), puntoA.getY());
		this.puntoB = new Punto (puntoB.getX(), puntoB.getY());
		this.puntoC = new Punto (puntoC.getX(), puntoC.getY());
	}

	@Override
	public String toString() {
		return "Triangulo [puntoA=" + puntoA + ", puntoB=" + puntoB + ", puntoC=" + puntoC + "]";
	}
	
	public double perimetro() {
		double perimetro = puntoA.distancia(puntoB) + puntoA.distancia(puntoC) + puntoC.distancia(puntoC);
		return perimetro;
	}


}
