
public class MesaV2 {

	String cartasMesa[] = new String[5];
	BaralhoV2 baralho = new BaralhoV2();
	
	
	/*
	public void distribuir(int numJogadores, JogadorV2 jogador[]) {
		int tam = 52;
		for(int i = 0;i<numJogadores;i++) {
			jogador[i].colocaCarta(baralho.baralhoConvertido[tam-1], baralho.baralhoConvertido[tam-2]);
			
			System.out.println(baralho.baralhoConvertido[tam-1]);
			//jogador[i].cartasJogador[1] = baralho.baralhoConvertido[tam-2];
			tam--;
		}
		
	}
	*/
	
	public void distribuir(int numJogadores) {
		
		
		JogadorV2 jogadores[] = new JogadorV2[numJogadores];
		int tam = 52;
		
		
		for(int i = 0; i<numJogadores;i++) {
			JogadorV2 jogador = new JogadorV2();
			jogador.colocaCarta(baralho.baralhoConvertido[tam-1], baralho.baralhoConvertido[tam-2]);
			jogadores[i] = jogador;
			tam=tam-2;
		}
		for(int i = 0; i<jogadores.length;i++) {
			System.out.println("Jogador "+ i +", carta 1: " + jogadores[i].getCarta1() + " "+ ", carta 2: "+ jogadores[i].getCarta2());
		}
		for(int i= 0;i<cartasMesa.length;i++) {
			cartasMesa[i] = baralho.baralhoConvertido[(tam-(numJogadores*2))-1];
			tam--;
			
		}
		for(int i = 0; i<cartasMesa.length;i++) {
			//System.out.println(cartasMesa[i]);
			System.out.println("Cartas na mesa: "+ cartasMesa[i]);
		}
		
	}
	
	
	
	
}
