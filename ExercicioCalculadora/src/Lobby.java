public class Lobby {
	public static void main(String args[]) {
		
		/*
		Calculadora calc = new Calculadora();
		
		double resSoma = calc.soma(25, 75);
		System.out.println("A soma �: "+resSoma);
		
		double resSubtrair = calc.subtrair(10.9, 300);
		System.out.println("A subtra��o �: "+resSubtrair);
		
		double resMulti = calc.multiplicacao(55, 785.8);
		System.out.println("A Multiplica��o �: "+resMulti);
		
		double resDiv = calc.divisao(89.7, 12.8954);
		System.out.println("A divis�o �: "+resDiv);
		*/
		
		CalculadoraCientifica calc = new CalculadoraCientifica();
		
			double resSoma = calc.soma(25, 88);
			System.out.println("A soma �: "+resSoma);
		
			double resPot = calc.potencia(2, 8);
			System.out.println("A pot�ncia �: "+resPot);
		
			double resRaiz = calc.raiz(9);
			System.out.println("A raiz �: "+resRaiz);
		
			}
	
}
