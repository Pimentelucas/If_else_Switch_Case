package laco.condicional.If;

import java.util.Scanner;

public class ComparadorSinal {

	public static void main(String[] args) {
		
		int A;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		A = leia.nextInt();
		
		if((A % 2) == 0 && A > 0 ) {
			System.out.println("O número é positivo e par");
		}else if((A % 2) == 0 && A < 0) {
			System.out.println("O número é negativo e par");
		}else if((A % 2) == 1 && A > 0) {
			System.out.println("O número é positivo e ímpar");
		}else {
			System.out.println("O número é negativo e ímpar");
		}
		
		leia.close();

	}

}
