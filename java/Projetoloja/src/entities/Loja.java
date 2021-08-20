package entities;

public class Loja {
	public void mostraCabecalhoLoja() {
		System.out.println();
		System.out.println("\t\t    * DONNUTIX *");
		System.out.println("\t\t~ Seu Donnut, nosso Mix ~\n");
		System.out.println("\t\t    *** MENU ***\n");
		System.out.println("CODIGO \t VALOR \t ESTOQUE \t NOME");

	}

	public void mostraCabecalhoNF() {
		System.out.println();
		System.out.println("\t\t    * DONNUTIX *");
		System.out.println("\t\t~ Seu Donnut, nosso Mix ~\n");
	}

	public void menuPagamento() {
		System.out.print("\nM�todos de pagamento: ");
		System.out.print("\n1 - � vista com 10% de desconto.");
		System.out.print("\n2 - No cart�o de cr�dito em 1x (10% de acr�scimo.)");
		System.out.print("\n3 - No cart�o de cr�dito em 2x (15% de acr�scimo.");
		System.out.print("\nInforme a forma de pagamento desejada [1/2/3]: ");
	}

	public void formaDePagamento(char formaDePagamento, double somaValorTotal) {
		if (formaDePagamento == '1') {
			System.out.printf("\nValor total da nota fiscal: R$ %.2f", somaValorTotal);
			System.out.printf("\nImpostos sobre a nota: R$ %.2f", (somaValorTotal * 9) / 100);
			System.out.printf("\nValor do desconto: R$%.2f", (somaValorTotal * 10) / 100);
			double valorFECHADO = somaValorTotal - (somaValorTotal * 10) / 100;
			System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
			System.out.print("\nObrigado pela prefer�ncia!\n");

		} // Pagamento no cart�o 1x 10% de acrescimo
		else if (formaDePagamento == '2') {
			System.out.printf("\nValor total da nota fiscal: R$%.2f", somaValorTotal);
			System.out.printf("\nImpostos sobre a nota: R$%.2f", (somaValorTotal * 9) / 100);
			System.out.printf("\nValor do acr�scimo: R$%.2f", (somaValorTotal * 10) / 100);
			double valorFECHADO = somaValorTotal + (somaValorTotal * 10) / 100;
			System.out.printf("\nValor total a pagar: R$%.2f", somaValorTotal);
			System.out.print("\nObrigado pela prefer�ncia!\n");

		} // Pagamento parcelado em 2x 15% de acrescimo
		else if (formaDePagamento == '3') {

			System.out.printf("\nValor total da nota fiscal: R$%.2f", somaValorTotal);
			System.out.printf("\nImpostos sobre a nota: R$%.2f", (somaValorTotal * 9) / 100);
			System.out.printf("\nValor do acr�scimo: R$%.2f", (somaValorTotal * 15) / 100);
			double valorFECHADO = somaValorTotal + (somaValorTotal * 15) / 100;
			System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
			System.out.printf("\nSer�o 2 parcelas de : R$%.2f", valorFECHADO / 2);
			System.out.print("\nObrigado pela prefer�ncia!\n");

		} else {
			System.out.printf("\nMETODO N�O IDENTIFICADO");
			System.out.printf("\nDeseja retornar?");
			
		}

	}
}
