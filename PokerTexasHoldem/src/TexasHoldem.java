import java.util.Scanner;

public class TexasHoldem {
	public static void main(String args[]) {
		
		/*
		 * Carta c1 = new Carta(); c1.colocaDados("Ouro", "10");
		 * 
		 * Carta c2 = new Carta(); c2.colocaDados("Ouro", "2");
		 */
		
		//System.out.println(c1.compareTo(c2));
		
		
		Mesa mesa = new Mesa();

		
		Scanner input = new Scanner(System.in);
		int numJogadores;
		System.out.println("Insira a quantidade de jogadores: ");
		numJogadores = Integer.parseInt(input.nextLine());
		input.close();
		
		if(numJogadores<2 || numJogadores>9) {
			System.out.println("Quantidade de jogadores inválida! Devem haver de 2 a 9 jogadores");
		}else {
			mesa.jogo(numJogadores);
		}
		
		
		
		
	}
}	
		
		
		
		
	

