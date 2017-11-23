package arrays;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public double distancia (Punto otroPunto) {
			
		double totalDistancia = Math.sqrt(Math.pow(x - otroPunto.x, 2) + Math.pow(y - otroPunto.y, 2));
		return totalDistancia;
	}

}
