package laco.condicional.If;

import java.util.Scanner;

public class ComparadorSoma {

	public static void main(String[] args) {
		
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		A = leia.nextInt();
		
		System.out.println("Insira o segundo número: ");
		B = leia.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		C = leia.nextInt();
		
		if((A + B) > C) {
			System.out.println("A soma dos primeiros números é maior que o terceiro: ");
		}else if((A + B) < C) {
			System.out.println("A soma dos primeiros números é menor que o terceiro: ");
		}else{
			System.out.println("A soma dos primeiros números é igual ao terceiro: ");
		}
		
		leia.close();
	
	}

}
