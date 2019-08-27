import java.util.Random;

public class BaralhoV2 {
	private CartaV2 cartas[] = new CartaV2[52];
	int contadorCarta = 0; 
	public int qtd=1;
	String baralhoConvertido[] = new String[52];
	
	
	CartaV2 saque = new CartaV2();
	CartaV2 baralhoSacado[] = new CartaV2[cartas.length-qtd];
	
	public BaralhoV2() {
		gerarBaralho();
		converteBaralho();
		embaralharConvertido();
	}
	
	public void gerarBaralho() {
		String naipe[] = {"ESPADAS","COPAS","OUROS","PAUS"};
		String numeros[] = {"ÁS","2","3","4","5","6","7","8","9","10","VALETE","DAMA","REI"};
          
        
        for(int i = 0; i<naipe.length;i++) {
        	for(int j = 0; j<numeros.length;j++) {
        		
        		CartaV2 carta = new CartaV2();
        		carta.colocaDados(naipe[i], numeros[j]);
        		cartas[contadorCarta]= carta;
        		
        		contadorCarta++;
        	}
        }
        
	}
	
	public void converteBaralho() {
		
		for(int i= 0; i<baralhoConvertido.length;i++) {
			String cartaConvertida = cartas[i].getNumero()+" de "+cartas[i].getNaipe();
			baralhoConvertido[i] = cartaConvertida;
		}
	}
	
	public void imprimeBaralhoConvertido() {
		for(int i = 0; i<baralhoConvertido.length;i++) {
			System.out.println(baralhoConvertido[i]);
		}
		System.out.println("O baralho tem: "+ baralhoConvertido.length +" cartas");
		 
	}
	 
	public void embaralharConvertido() {
		Random mexer = new Random();
		int aleatorio = 0;
		
		for(int i=0;i<baralhoConvertido.length;i++) {
			aleatorio = mexer.nextInt(baralhoConvertido.length);
			String copo = baralhoConvertido[i];
			baralhoConvertido[i] = baralhoConvertido[aleatorio];
			baralhoConvertido[aleatorio] = copo;
			
			//System.out.println(aleatorio);
				
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
			CartaV2 copo = cartas[i];
			cartas[i] = cartas[aleatorio];
			cartas[aleatorio] = copo;
			
			//System.out.println(aleatorio);
				
		}	
	}    
	
}
