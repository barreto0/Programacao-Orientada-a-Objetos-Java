import java.util.Scanner;

import figurasgeometricas.FiguraGeometrica;
import figurasgeometricas.Quadrado;
import figurasgeometricas.Trapezio;
import figurasgeometricas.Triangulo;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		FiguraGeometrica figura = null;
		Calculador cal = new Calculador();

		Scanner input = new Scanner(System.in);
		int opcao = -1;
		do {
			System.out.println("Escolha uma opção de cálculo:");
			System.out.println("1-Quadrado, 2-Triangulo, 3-Trapezio, 0-Sair");
			opcao = Integer.parseInt(input.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("Digite o lado do quadrado:");
				double valorDigitado = Double.parseDouble(input.nextLine());
				figura = new Quadrado(valorDigitado);
				break;
			case 2:
				System.out.println("Digite a base e a altura do triangulo:");
				double valorDigitadoBase = Double.parseDouble(input.nextLine());
				double valorDigitadoAltura = Double.parseDouble(input.nextLine());
				figura = new Triangulo(valorDigitadoBase, valorDigitadoAltura);
				break;
			case 3:
				System.out.println("Digite a base maior, a base menor e a altura do trapezio:");
				double valorDigitadoBaseMaior = Double.parseDouble(input.nextLine());
				double valorDigitadoBaseMenor = Double.parseDouble(input.nextLine());
				double valorDigitadoAltura2 = Double.parseDouble(input.nextLine());
				figura = new Trapezio(valorDigitadoBaseMaior, valorDigitadoBaseMenor, valorDigitadoAltura2);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}

			if (opcao != 0) {
				System.out.println("A Area da figura eh: " + cal.calcularArea(figura));
			}

		} while (opcao != 0);

		input.close();

	}

}