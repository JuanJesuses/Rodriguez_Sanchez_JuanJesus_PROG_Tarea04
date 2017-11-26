package arrays;

public class Punto {
	
	private double x;
	private double y;
	/*
	 * Constructor de la clase puntos que admite dos parámetros
	 * para crear coordenadas
	 */
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
	/*
	 * El método distancia, devuelve la distancia entre
	 * dos puntos de coordenadas
	 */
	public double distancia (Punto otroPunto) {
			
		double totalDistancia = Math.sqrt(Math.pow(x - otroPunto.x, 2) + Math.pow(y - otroPunto.y, 2));
		return totalDistancia;
	}

}
