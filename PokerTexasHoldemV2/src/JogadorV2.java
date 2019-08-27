
public class JogadorV2 {

	private String cartasJogador[] = new String[2];
	
	public void colocaCarta(String carta1,String carta2){
		cartasJogador[0] = carta1;
		cartasJogador[1] = carta2;
	}
	
	public String getCarta1() {
		return this.cartasJogador[0];
	}
	
	public String getCarta2() {
		return this.cartasJogador[1];
	}
	
	
}
