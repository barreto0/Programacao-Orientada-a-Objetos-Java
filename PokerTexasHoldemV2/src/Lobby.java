import java.util.Scanner;

public class Lobby {

	public static void main(String[] args) {
		
		
		MesaV2 mesa = new MesaV2();
		//int numJogadores = 2;
		
		Scanner input = new Scanner(System.in);
		int numJogadores;
		System.out.println("Insira a quantidade de jogadores: ");
		numJogadores = Integer.parseInt(input.nextLine());
		input.close();
		
		if(numJogadores<2 || numJogadores>9) {
			System.out.println("Quantidade de jogadores inválida! Devem haver de 2 a 9 jogadores");
		}else {
			mesa.distribuir(numJogadores);
		}
		
		
		
		
		
		
		
	}

}
