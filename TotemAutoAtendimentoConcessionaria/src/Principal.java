import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Admin adm = new Admin();
		List<Pessoas> usuarios = new ArrayList<Pessoas>();
		usuarios.add(adm);
		//List<Veiculo> veiculos = new ArrayList<Veiculo>();
		ListaVeiculos listaVeiculos = new ListaVeiculos();
		ListaVeiculos carrinho = new ListaVeiculos();
		
		
		
		  Veiculo carroTeste = new Carro(); 
		  carroTeste.setDados("Peugeot", "106","TU9", "gasolina", "prata","fosca" ,"2000", 5000);
		  listaVeiculos.add(carroTeste);
		  
		  Veiculo carroTeste2 = new Carro(); 
		  carroTeste2.setDados("Renault", "Clio","K4M", "gasolina", "vermelho","metálica" ,"2006", 8000);
		  listaVeiculos.add(carroTeste2);
		  
		  Veiculo carroTeste3 = new Carro(); 
		  carroTeste3.setDados("Volkswagen", "Gol","EA111", "flex", "branco","fosca" ,"2010", 12000);
		  listaVeiculos.add(carroTeste3);
		  
		  Veiculo carroTeste4 = new Carro(); 
		  carroTeste4.setDados("Ford", "Fiesta","ZETEC", "gasolina", "preto","fosca" ,"2001", 6000);
		  listaVeiculos.add(carroTeste4);
		  
		  Veiculo carroTeste5 = new Carro(); 
		  carroTeste5.setDados("Citroen", "Zx","XUJ28", "gasolina", "azul","metálica" ,"2005", 5500);
		  listaVeiculos.add(carroTeste5);
		 
		
		/*
		 * newUser.setLogin("a"); newUser.setSenha("a"); newUser.setGrauAcesso("1");
		 * usuarios.add(newUser);
		 */
		
	    Scanner input = new Scanner(System.in);
		int opcao = -1;
		
		do {
			
			System.out.println("ARRAY DE PESSOAS "+Arrays.toString(usuarios.toArray()));
			
			System.out.println("\n");
			System.out.println("1 - Cadastrar Veículo (Área Restrita) ");
			System.out.println("2 - Iniciar Processo de Compra");
			System.out.println("3 - Acompanhar Pedido");
			System.out.println("4 - Listar Veículos Cadastrados");
			System.out.println("5 - Listar Compras (Área Restrita)");
			System.out.println("10 - Cadastrar Usuário (Área Restrita)");
			System.out.println("0 - Sair \n");
			System.out.println("\n");

			opcao = Integer.parseInt(input.nextLine());
			switch (opcao) {
			case 1:
				
				System.out.println("Login: ");
				Scanner loginUser = new Scanner(System.in);
				String loginValida = loginUser.nextLine();
				System.out.println("Senha: ");
				Scanner senhaUser = new Scanner(System.in);
				String senhaValida = senhaUser.nextLine();
				Pessoas validaUser = new Usuario();
				validaUser.setLogin(loginValida);
				validaUser.setSenha(senhaValida);
				validaUser.setGrauAcesso("1");
				
				//if(newUser.toString().equals(validaUser.toString())) {

				try {
					validaUser.validaAcesso(validaUser, usuarios);
					
					System.out.println("Tipo do Veículo: ");
					System.out.println("1 - Carro \n2 - Moto \n3 - Caminhão \n4 - Barco\n ");
					Scanner input2 = new Scanner(System.in);
					int escolheTipoVeiculo = Integer.parseInt(input2.nextLine());
					if(escolheTipoVeiculo == 1) { //carro
						Veiculo carro = new Carro();
						
						System.out.println("Fabricante ");
						Scanner input3 = new Scanner(System.in);
						String fabricante = input3.nextLine();
						
						System.out.println("Nome do Modelo: ");
						Scanner input4 = new Scanner(System.in);
						String nome = input4.nextLine();
						
						System.out.println("Motor: ");
						Scanner input5 = new Scanner(System.in);
						String motor = input5.nextLine();
						
						
						System.out.println("Combustível: ");
						Scanner input6 = new Scanner(System.in);
						String combustivel = input6.nextLine();
						
						System.out.println("Cor: ");
						Scanner input7 = new Scanner(System.in);
						String cor = input7.nextLine();
						
						System.out.println("Tipo de Cor disponível (metálica/fosca): ");
						Scanner input11 = new Scanner(System.in);
						String tipoCorDisponivel = input11.nextLine();
						
						System.out.println("Ano: ");
						Scanner input9 = new Scanner(System.in);
						String ano = input9.nextLine();
						
						System.out.println("Valor em reais: ");
						Scanner input10 = new Scanner(System.in);
						int valor = Integer.parseInt(input10.nextLine());
						
					
						//carro.setDados("Peugeot", "106", "TU9", "gasolina", "prata","metálica" ,"2000", 5000);
						carro.setDados( fabricante,  nome,  motor,  combustivel,  cor, tipoCorDisponivel ,ano,  valor);
						
						
						  try { 
							carro.validaDuplicata(carro, listaVeiculos.getArray());
							listaVeiculos.add(carro);
							carro.sumarioDoCadastro(carro);
							
						  }catch(DuplicataException ex){
						  
						  }

						
					}else {
						if(escolheTipoVeiculo == 2) //moto
						{
							Veiculo moto = new Moto();
							
							System.out.println("Fabricante ");
							Scanner input3 = new Scanner(System.in);
							String fabricante = input3.nextLine();
							
							System.out.println("Nome do Modelo: ");
							Scanner input4 = new Scanner(System.in);
							String nome = input4.nextLine();
							
							System.out.println("Motor: ");
							Scanner input5 = new Scanner(System.in);
							String motor = input5.nextLine();
							
							
							System.out.println("Combustível: ");
							Scanner input6 = new Scanner(System.in);
							String combustivel = input6.nextLine();
							
							System.out.println("Cor: ");
							Scanner input7 = new Scanner(System.in);
							String cor = input7.nextLine();
							
							System.out.println("Tipo de Cor disponível (metálica/fosca): ");
							Scanner input11 = new Scanner(System.in);
							String tipoCorDisponivel = input11.nextLine();
							
							System.out.println("Ano: ");
							Scanner input9 = new Scanner(System.in);
							String ano = input9.nextLine();
							
							System.out.println("Valor em reais: ");
							Scanner input10 = new Scanner(System.in);
							int valor = Integer.parseInt(input10.nextLine());
							
						
							moto.setDados("Royal Enfield", "bullet 500", "500cc MonoCil", "gasolina", "Army Green","fosca" ,"2019", 20000);
							//moto.setDados( fabricante,  nome,  motor,  combustivel,  cor, tipoCorDisponivel ,ano,  valor);
							
							
							  try { 
								moto.validaDuplicata(moto, listaVeiculos.getArray());
								listaVeiculos.add(moto);
								moto.sumarioDoCadastro(moto);
								
							  }catch(DuplicataException ex){
							  
							  }
							
							
							
							
							
						}else {
							if(escolheTipoVeiculo == 3) //caminhão
							{
								
							}else {
								if(escolheTipoVeiculo == 4)
								{
									System.out.println("testeBarco");
								}else {
									if(escolheTipoVeiculo != 1 || escolheTipoVeiculo != 2 || escolheTipoVeiculo != 3 || escolheTipoVeiculo != 4) {
										System.out.println("Insira uma opção válida");
									}
								}
							}
						}
					}
					
					

				}catch(AcessoNegadoException ex) {
					
				}
			
				break;
			case 2:
				System.out.println("Qual seu nome?: ");
				Scanner nomeClienteNovo = new Scanner(System.in);
				String nomeCadastroCliente = nomeClienteNovo.nextLine();
				System.out.println("Qual seu CPF?: ");
				Scanner cpfClienteNovo = new Scanner(System.in);
				String cpfClienteCadastro = cpfClienteNovo.nextLine();
				Pessoas newCliente = new Cliente();

				newCliente.setNome(nomeCadastroCliente);
				newCliente.setCpf(cpfClienteCadastro);
				usuarios.add(newCliente);
				
				String opFim = "n";
				do {
					System.out.println("Escolha um de nossos veículos inserindo o número correspondente: ");
					for(int i = 0; i<listaVeiculos.size();i++) {
						System.out.println(listaVeiculos.print(i));

					}				
					Scanner inputCliente = new Scanner(System.in);
					int escolheCarro = -1;
					escolheCarro = Integer.parseInt(inputCliente.nextLine());
					
					listaVeiculos.get(escolheCarro);
					
					System.out.println("Deseja cor METÁLICA (digite metálica) ou FOSCA (acréssimo de 3% no valor do veículo, digite fosca)? ");
					Scanner selecionaCor = new Scanner(System.in);
					String tipoCor = selecionaCor.nextLine();
					try {
						listaVeiculos.get(escolheCarro).validaTipoCor(listaVeiculos.get(escolheCarro), tipoCor);
						
						System.out.println("Adicionar "+listaVeiculos.print(escolheCarro)+" ao carrinho? Cores foscas aumetam o preço em 3%");
						System.out.println("S/N ");
						Scanner inputOP = new Scanner(System.in);
						String op = inputOP.nextLine();
						
						if(op.equals("s") || op.equals("S")) {
							
							
							if(tipoCor.equals("fosca")) {
								double novoValor = listaVeiculos.get(escolheCarro).getValor()* 1.03;
								listaVeiculos.get(escolheCarro).setValor(novoValor);
							}
							
							
							
							carrinho.add(listaVeiculos.get(escolheCarro));
							
							
							for(int i = 0; i<carrinho.size();i++) {
							System.out.println(carrinho.print(i) + "ADICIONADO AO CARRINHO");
							
							}
							
							System.out.println("Finalizar pedido?");
							System.out.println("S/N ");
							Scanner inputFim = new Scanner(System.in);
							opFim = inputFim.nextLine();
							
							if(opFim.equals("s")|| opFim.equals("S")) {
							
								Pedido pedido = new Pedido();
								pedido.setNomeCliente(nomeCadastroCliente);
								pedido.setCpfCliente(cpfClienteCadastro);
								
								pedido.setCarrosPedidos(listaVeiculos.get(escolheCarro));
								
								int randomNum = (int)(Math.random()*((100-1)+1))+1;
								pedido.setNumeroPedido(randomNum);
								System.out.println(pedido.sumarioPedido(pedido));
								newCliente.setPedido(pedido);
							}
							
							
							
						}
						
						
					}catch(TipoCorException ex) {
						
					}
				}while(opFim.equals("n") || opFim.equals("N"));
				
				
						
				break;
			case 3:
				System.out.println("Insira o número do pedido: ");
				
				Scanner inputPedido = new Scanner(System.in);
				int numPedido = Integer.parseInt(inputPedido.nextLine());
				
				for(int i=0; i<usuarios.size();i++) {
					if(usuarios.get(i).getPedido() != null) {
						int num = usuarios.get(i).getPedido().getNumeroPedido();
						if(num == numPedido) {
							System.out.println(usuarios.get(i).getPedido().sumarioPedido(usuarios.get(i).getPedido()));
							System.out.println("Veículos encomendados: ");
							for(int j =0;j<usuarios.get(i).getPedido().getQtd();j++) {
								System.out.println(usuarios.get(i).getPedido().printCarrosPedidos(j));
							}
						}
					}
					
					
					
				}
				
				
				break;
			case 4:
				
				for(int i = 0; i<listaVeiculos.size();i++) {
					  System.out.println(listaVeiculos.print(i));
					  
					  }
				
				
				break;
			case 5:
				System.out.println("Login: ");
				Scanner loginLista = new Scanner(System.in);
				String login5 = loginLista.nextLine();
				System.out.println("Senha: ");
				Scanner senhaLista = new Scanner(System.in);
				String senha5 = senhaLista.nextLine();
				Pessoas valida5 = new Usuario();
				valida5.setLogin(login5);
				valida5.setSenha(senha5);
				valida5.setGrauAcesso("1");
				
				try {
					valida5.validaAcesso(valida5, usuarios);
					for(int i=0; i<usuarios.size();i++) {
						if(usuarios.get(i).getPedido() != null) {
							
								System.out.println(usuarios.get(i).getPedido().sumarioPedido(usuarios.get(i).getPedido()));
								System.out.println("Veículos encomendados: ");
								for(int j =0;j<usuarios.get(i).getPedido().getQtd();j++) {
									System.out.println(usuarios.get(i).getPedido().printCarrosPedidos(j));
								}
							
						}
						
						
						
					}
					
					
				}catch(AcessoNegadoException ex) {
					
				}
				
				
				
				
				break;
				
			case 0:
				System.out.println("Saindo...");
				break;
			case 10:
				System.out.println("Login: ");
				Scanner loginADM = new Scanner(System.in);
				String login = loginADM.nextLine();
				System.out.println("Senha: ");
				Scanner senhaADM = new Scanner(System.in);
				String senha = senhaADM.nextLine();
				Pessoas validaAdm = new Admin();
				validaAdm.setLogin(login);
				validaAdm.setSenha(senha);
				
				try {
					adm.validaAcesso(validaAdm, usuarios);
					System.out.println("Insira o login do usuário");
					Scanner loginNovo = new Scanner(System.in);
					String loginCadastro = loginNovo.nextLine();
					
					System.out.println("Insira a senha do usuário: ");
					Scanner senhaNovo = new Scanner(System.in);
					String senhaCadastro = senhaNovo.nextLine();
					
					System.out.println("Insira o Grau de Acesso do usuário: ");
					Scanner grauAcesso = new Scanner(System.in);
					String grauAcessoCadastro = grauAcesso.nextLine();
					
					Pessoas newUser = new Usuario();
					
					
					  newUser.setLogin(loginCadastro); 
					  newUser.setSenha(senhaCadastro);
					  newUser.setGrauAcesso(grauAcessoCadastro); 
					  usuarios.add(newUser);
					 
					System.out.println(Arrays.toString(usuarios.toArray()));
					
				}catch(AcessoNegadoException ex){
					
				}

				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}

		} while (opcao != 0);

		input.close();


	
	}
}
