package eCommerce;

import java.util.*;

public class ConversaoPortugol {
	/*
	 * ******************** ATIVIDADE SOLICITADA ******************* Fazer uma loja
	 * virtual Precisa de NOME-SLOGAN-PRODUTOS 4 Vetores - CODIGO (G01yy) - x =
	 * Grupo y = Numero do Produto - PRODUTO - Grupo Decide - VALOR - Grupo Decide -
	 * ESTOQUE - 10 de cada produto para todos os grupos (10 produtos, 100 produtos
	 * cada grupo) Loja deve Exibir produtos em vitrine Loja deve Exibir carrinho
	 * com os produtos escolhidos Após o pedido ser fechado Deve exibir Nota Fiscal
	 * 
	 * Nota Fiscal deve exibir NOME DA LOJA VALOR TOTAL DA COMPRA MOSTRA 9% IMPOSTO
	 * EM CIMA DO VALOR TOTAL OPÇÕES DE PAGAMENTO - 1 A VISTA COM 10% DESCONTO OPÇÃO
	 * 2 - NO CARTÃO COM ACRESCIMO DE 10% OPÇÃO 3 É EM DUAS VEZES COM 15% TOTAL DE
	 * ACRESCIMENTO - TEM QUE MOSTRA O VALOR DE CADA PARCELA MOSTRA A NOTA FISCAL
	 * [SIMULADO] FINAL Ao terminar, Deve retornar ao início do programa Alterar o
	 * estoque com produtos pedidos e funcionar novamente
	 * 
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double VALOR[] = new double[10];
		int ESTOQUE[] = new int[10];
		String PRODUTO[] = new String[10];
		String CODIGO[] = new String[10];

		String PRODUTOFINAL[] = new String[10];
		double VALORFINAL[] = new double[10];
		int QTDEFINAL[] = new int[10];

		String compra;
		char sn = 'S';
		int quantidade;
		double carrinho = 0.0;
		int qtdeCompra = 0;
		double valorFinal = 0.0;
		double imposto = 0.09;
		double pgtVista = 0.0;
		double pgtCartao = 0.0;
		double pgtParcelado = 0.0;
		double valorFECHADO;
		double custoImposto = 0.0;
		String y = "grupo1";
		int formaDePagamento;

		for (int x = 0; x < 10; x++) {
			CODIGO[x] = ("G1" + (x + 1));
		}
		for (int x = 0; x < 10; x++) {
			ESTOQUE[x] = 10;
		}
		VALOR[0] = 12.0;
		VALOR[1] = 15.0;
		VALOR[2] = 16.0;
		VALOR[3] = 13.0;
		VALOR[4] = 12.0;
		VALOR[5] = 13.0;
		VALOR[6] = 10.0;
		VALOR[7] = 10.0;
		VALOR[8] = 12.0;
		VALOR[9] = 11.0;
	

		PRODUTO[0] = "DONNUT NUTELLA ";
		PRODUTO[1] = "DONNUT NINHO";
		PRODUTO[2] = "DONNUT COCO";
		PRODUTO[3] = "DONNUT CHOCO";
		PRODUTO[4] = "DONNUT KIT KAT";
		PRODUTO[5] = "DONNUT CREME";
		PRODUTO[6] = "DONNUT CHURROS";
		PRODUTO[7] = "DONNUT GELEIA";
		PRODUTO[8] = "DONNUT MORANGO";
		PRODUTO[9] = "DONNUT FRUTAS";

		do{
			System.out.println("*** DONNUTIX ***");
			System.out.println("~ Seu Donnut, nosso Mix ~");
			System.out.println("Deseja fazer compras?");
			sn = leia.next().toUpperCase().charAt(0);
			if (sn == 'S') {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("*** DONNUTIX ***");
				System.out.println("~ Seu Donnut, nosso Mix ~");
				System.out.println("***** VITRINE ******");
				for (int x = 0; x < 10; x++) {
					System.out.printf("%s\t\t%s\t\t%.2f\t\t%d\n", CODIGO[x], PRODUTO[x], VALOR[x], ESTOQUE[x]);
				}
				/*INFORME O CODIGO
				 *xxx 
				 *faca{
						 *Informe quantidade
						 *confirma quantidade
						 * 	 if (sn == 's')
							 * 	if- qtde>0 && qtde <=estoque
							 * 		bota no carrinho
							 * 		retira qtde do estoque
							 * 		pergunta se quer comprar de novo
							 * 		
							 * 	else -qtde indisponivel
						*sn = 'S'
						*
				 *enquanto(sn=='S')
				 *
				 *
				 *
				 ************************PAULO**************************
				 *calcular valor e informar mostra formas de pagamento
				 *mostra carrinho
				 *qtde*preco
				 *valor final -
				 *calcula imposto = (valor final *imposto)
				 *pgt vista (desconto)
				 *pgt cartao (10%)
				 *pgt parcelado (15% - mostrar cada parcela)
				 */

			} else {
				System.out.println("Até Breve!");
			}
		}while(sn=='S');

	}
}
© 2021 GitHub, Inc.