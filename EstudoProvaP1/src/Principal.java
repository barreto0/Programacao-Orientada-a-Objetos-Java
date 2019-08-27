import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		Aluno alunos[] = new Aluno[5];
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<alunos.length;i++) {
			Aluno aluno = new Aluno();

			String nomeV = entrada.nextLine();
			aluno.setNome(nomeV);
			
			double notaV = entrada.nextDouble();
			aluno.setNota(notaV);
			alunos[i] = aluno;
			
			
		}
		entrada.close();
		
		
		
		
		
	}

}
