//no texas holdem o baralho tem 52 cartas pois não se joga com os coringas
import java.util.Random;

public class Baralho {
	Carta cartas[] = new Carta[52];
	int contadorCarta = 0; 
	
	
	public Baralho() {
		gerarBaralho();
		embaralhar();
	}
	
	public void gerarBaralho() {
		String naipe[] = {"ESPADAS","COPAS","OUROS","PAUS"};
		String numeros[] = {"ÁS","2","3","4","5","6","7","8","9","10","VALETE","DAMA","REI"};
          
        
        for(int i = 0; i<naipe.length;i++) {
        	for(int j = 0; j<numeros.length;j++) {
        		
        		Carta carta = new Carta();
        		carta.colocaDados(naipe[i], numeros[j]);
        		cartas[contadorCarta]= carta;
        		
        		contadorCarta++;
        	}
        }
        
	}
	 
	public void imprimeBaralho() {
		for(int l = 0; l<cartas.length;l++) {
			System.out.println(cartas[l].getNumero()+" de "+cartas[l].getNaipe());
		}
		System.out.println("O baralho tem: "+ cartas.length +" cartas");
		 
	}
	
	public void embaralhar() {
		Random mexer = new Random();
		int aleatorio = 0;
		
		for(int i=0;i<cartas.length;i++) {
			aleatorio = mexer.nextInt(cartas.length);
			Carta copo = cartas[i];
			cartas[i] = cartas[aleatorio];
			cartas[aleatorio] = copo;
			
			//System.out.println(aleatorio);
			//System.out.println("Esse � o copo "+copo);	
		}	
	}    

}
