//HERANÇA, O EXTENDS DIZ QUE A CLASSE HERDA OS METODOS DA CLASSE ESPECIFICADA
public class CalculadoraCientifica extends Calculadora {
	
	public double potencia(double x, double y) {
		return Math.pow(x,  y);
	}
	
	public double raiz(double x) {
		return Math.sqrt(x);
	}
	
}
