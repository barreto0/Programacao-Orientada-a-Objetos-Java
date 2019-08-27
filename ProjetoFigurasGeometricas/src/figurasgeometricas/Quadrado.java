package figurasgeometricas;

public class Quadrado implements FiguraGeometrica {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

}