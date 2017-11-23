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


}
