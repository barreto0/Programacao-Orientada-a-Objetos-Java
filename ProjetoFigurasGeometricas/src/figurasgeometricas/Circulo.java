package figurasgeometricas;

public class Circulo implements FiguraGeometrica {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}