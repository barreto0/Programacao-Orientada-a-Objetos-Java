import java.util.Scanner;

public class consultorio {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int opcao = -1;
		do {
			System.out.println("Escolha a opção");
			System.out.println("1 - Cadastrar, 2 - Consultar - 0 Sair");
			opcao= Integer.parseInt(input.nextLine()); //Converte String para int
			switch(opcao) {
			case 1:
				
				break;
				
			case 2:
				break;
				
			case 0:
				System.out.println("saindo...");
				break;
				
				default:
					System.out.println("Opção Inválida");
				break;
			}
		}while(opcao !=0);
		input.close(); //Libera o recurso do console
		
	}

}

	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		
		//tipo animal, "new" instancia o objeto, chama o construtor da classe
		//nome de classe começa com letra maiuscula
		
		
		animal cachorro = new animal();
		
		cachorro.somNatural = "Woof";
		cachorro.falar();
		cachorro.falar("Alô galera de Caubói");
		
		animal gato = new animal();
		gato.somNatural = "Meow";
		gato.falar();
		gato.falar("Alô galera de peão");
		
		animal papagaio = new animal();
		papagaio.somNatural = "Screeech";
		papagaio.falar();
		papagaio.falar("É na sola da bota");
		
		animal rato = new animal();
		rato.somNatural = "meek";
		rato.falar();
		rato.falar("É na palma da bota");
		
	
	}

*/
	