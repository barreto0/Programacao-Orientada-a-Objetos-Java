
public class Jogador extends Carta{

	Carta cartasJogador[] = new Carta[2];

	public void colocaCartas(Carta carta1 , Carta carta2) {
		cartasJogador[0] = carta1;
		cartasJogador[1] = carta2;
	}
	public Carta getCarta1() {
		return this.cartasJogador[0];
	}
	public Carta getCarta2() {
		return this.cartasJogador[1];
	}
	
	public String getNaipeCarta1() {
		return this.cartasJogador[0].getNaipe();
	}
	public String getNumeroCarta1() {
		return this.cartasJogador[0].getNumero();
	}
	public String getNaipeCarta2() {
		return this.cartasJogador[1].getNaipe();
	}
	public String getNumeroCarta2() {
		return this.cartasJogador[1].getNumero();
	}
	
	
}
