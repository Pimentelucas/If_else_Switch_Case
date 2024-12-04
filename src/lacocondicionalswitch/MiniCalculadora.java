package lacocondicionalswitch;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		int opcao, A, B, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		A = leia.nextInt();
		System.out.println("Insira o segundo número: ");
		B = leia.nextInt();
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para soma--");
		System.out.println("--Digite 2 para subtração--");
		System.out.println("--Digite 3 para multiplicação--");
		System.out.println("--Digite 4 para divisão--");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			resultado = A + B;
			System.out.println("O resultado é: " + resultado);	
			break;
		case 2:
			resultado = A - B;
			System.out.println("O resultado é: " + resultado);
			break;
		case 3:
			resultado = A * B;
			System.out.println("O resultado é: " + resultado);
			break;
		case 4:
			resultado = A / B;
			System.out.println("O resultado é: " + resultado);
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

}
