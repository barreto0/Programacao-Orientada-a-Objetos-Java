import java.util.Scanner;

public class Quadrado implements FiguraGeometrica {
	
	private double lado;
	private double altura;
	private double area;
	
	
	public void getParametros() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lado: ");
		double a;
		a = input.nextDouble();
		lado = a;
		
		System.out.println("Altura: ");
		double b;
		b = input.nextDouble();
		altura = b;
		
		
	}
	
	public double area() {
		if(lado == altura) {
			double resultado = Math.pow(lado, 2);
			area = resultado;
			return area;
			
		}else {
			area = lado*altura;
			return area;
			
		}
	}
	
	
	
}
