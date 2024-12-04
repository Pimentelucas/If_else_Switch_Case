package lacocondicionalswitch;

import java.util.Scanner;

public class Lanchonete {
	
	public static void main(String[] args) {
		int codigo, quantidade;
        Scanner leia = new Scanner(System.in);

        System.out.println("# ## ### #### #########   Menu de Produtos   ########## #### ### ## #");
        System.out.println("\n-- Digite 1 para comprar Cachorro Quente (R$ 10.00) --");
        System.out.println("-- Digite 2 para comprar X-Salada (R$ 15.00) --");
        System.out.println("-- Digite 3 para comprar X-Bacon (R$ 18.00) --");
        System.out.println("-- Digite 4 para comprar Bauru (R$ 12.00) --");
        System.out.println("-- Digite 5 para comprar Refrigerante (R$ 8.00) --");
        System.out.println("-- Digite 6 para comprar Suco de Laranja (R$ 13.00) --");
        System.out.print("Digite o código do produto: ");
        codigo = leia.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        quantidade = leia.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Produto: Cachorro Quente");
                System.out.printf("Valor: R$ %.2f%n", quantidade * 10.00);
                break;
            case 2:
                System.out.println("Produto: X-Salada");
                System.out.printf("Valor: R$ %.2f%n", quantidade * 15.00);
                break;
            case 3:
                System.out.println("Produto: X-Bacon");
                System.out.printf("Valor: R$ %.2f%n", quantidade * 18.00);
                break;
            case 4:
                System.out.println("Produto: Bauru");
                System.out.printf("Valor: R$ %.2f%n", quantidade * 12.00);
                break;
            case 5:
                System.out.println("Produto: Refrigerante");
                System.out.printf("Valor: R$ %.2f%n", quantidade * 8.00);
                break;
            case 6:
                System.out.println("Produto: Suco de Laranja");
                System.out.printf("Valor: R$ %.2f%n", quantidade * 13.00);
                break;
            default:
                System.out.println("Código inválido! Por favor, escolha um número entre 1 e 6.");
        }

        leia.close();
	}

}
