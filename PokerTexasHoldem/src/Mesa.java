
public class Mesa{
	Carta cartasMesa[] = new Carta[5];

	Baralho baralho = new Baralho();

	
	public void jogo(int numJogadores) {
		Jogador jogadores[] = new Jogador[numJogadores];

		baralho.imprimeBaralho();

		int tam = 52;
		//distribui cartas para cada jogador
		for(int i =0; i<numJogadores;i++) {
			Jogador jogador = new Jogador();
			jogador.colocaCartas(baralho.cartas[tam-1] , baralho.cartas[tam-2]);
			jogadores[i] = jogador;
			tam = tam -2;
		}
		
		//printa mao dos jogadores
		for(int i = 0; i<numJogadores;i++) {
			System.out.println("Jogador: "+i+", carta 1: "+ jogadores[i].getNumeroCarta1() + " de " + jogadores[i].getNaipeCarta1() + ", carta 2: "+ jogadores[i].getNumeroCarta2()+" de "+jogadores[i].getNaipeCarta2());
		}
		
		//coloca cartas na mesa
		for(int i = 0; i<cartasMesa.length;i++){
			Carta carta = new Carta();
			carta.colocaDados(baralho.cartas[tam-1].getNaipe(), baralho.cartas[tam-1].getNumero());
			cartasMesa[i] = carta;
			tam--;
		}
		
		//printa cartas da mesa
		for(int i=0;i<cartasMesa.length;i++) {
			System.out.println("Cartas na mesa: "+cartasMesa[i].getNumero()+" de " + cartasMesa[i].getNaipe());
		}
		
		
		
		  //checa quais jogadores possuem um par na mão 
		for(int i=0;i<jogadores.length;i++) {
		  if(jogadores[i].getNumeroCarta1().equals(jogadores[i].getNumeroCarta2())) {
		  System.out.println("Jogador "+i+" tem um par na mão");
		  
		  	} 
		  }
		 
	}
		
}
