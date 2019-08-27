
public class numero03 {

	public static void main(String[] args) {

		double[] numeros = new double[] {10,19,22,23,30,38,47,50};
		
		double soma = 0;
		for(double i : numeros) {
			soma += i;
		}
		System.out.println("A soma é " +soma);
		
		double media = 0;
		media = soma/ numeros.length;
		
		System.out.println("A media :"+media);
		
		
		double mediana = 0;
		
		
		System.out.println(numeros.length);
		System.out.println(numeros[(numeros.length-1)/2]);
		System.out.println(numeros[((numeros.length-2)/2)+1]);
		
		if (numeros.length % 2 == 0) {
			mediana = ((numeros[(numeros.length-1)/2]) + (numeros[((numeros.length-2)/2)+1]))/2;
			System.out.println(mediana);
			
		}else {
			
			mediana = numeros[(numeros.length-1)/2];
			System.out.println(mediana);

		}	
	}
}
