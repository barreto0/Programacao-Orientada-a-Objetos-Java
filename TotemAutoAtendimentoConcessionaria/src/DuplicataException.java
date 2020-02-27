
public class DuplicataException extends Exception {
	public DuplicataException(Veiculo veiculo) {

		System.out.println("VEÍCULO JÁ CADASTRADO");
		veiculo.sumarioDoCadastro(veiculo);
	}
}
