
public class numero04 {

	public static void main(String[] args) {
		
		Numero01 opcao01 = new Numero01();
		Numero02 opcao02 = new Numero02();
		numero03 opcao03 = new numero03();
		menuNumero04 menu = new menuNumero04();
		
		int valor = 2;
		menu.mostraMenu();
		switch(valor) {
		case 1:
			Numero01 n01 = new Numero01();
			n01.execu();
			break;
		case 2:
			Numero02.main(null);
		case 3:
			//opcao 3
			default:
				System.out.println("Opção inválida");
		}

	}

}
