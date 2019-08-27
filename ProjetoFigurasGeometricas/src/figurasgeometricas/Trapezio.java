package figurasgeometricas;

public class Trapezio implements FiguraGeometrica {

	private double baseMenor;
	private double baseMaior;
	private double altura;

	public Trapezio(double baseMaior, double baseMenor, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	public double calcularArea() {
		double valorCalculado = ((baseMaior + baseMenor) / 2) * altura;
		return valorCalculado;
	}

}