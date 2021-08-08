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
		VALOR[0] = 10.0;
		VALOR[1] = 10.0;
		VALOR[2] = 10.0;
		VALOR[3] = 10.0;
		VALOR[4] = 10.0;
		VALOR[5] = 10.0;
		VALOR[6] = 10.0;
		VALOR[7] = 10.0;
		VALOR[8] = 10.0;
		VALOR[9] = 10.0;

		PRODUTO[0] = "DONNUT A";
		PRODUTO[1] = "DONNUT B";
		PRODUTO[2] = "DONNUT C";
		PRODUTO[3] = "DONNUT D";
		PRODUTO[4] = "DONNUT E";
		PRODUTO[5] = "DONNUT F";
		PRODUTO[6] = "DONNUT G";
		PRODUTO[7] = "DONNUT H";
		PRODUTO[8] = "DONNUT I";
		PRODUTO[9] = "DONNUT J";

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
				System.out.println("Informe o código: ");
				compra = leia.next();
				for (int x=0; x< 10; x++) {
					if(compra.equals(PRODUTO[x])) {
						System.out.println("Qual a quantidade? ");
						quantidade = leia.nextInt();
						System.out.println("Confirma a quantidade? ");
						sn = leia.next().toUpperCase().charAt(0);
						if(sn=='S') {
							if(quantidade>0 && quantidade<=ESTOQUE[x]) {
								carrinho = quantidade*VALOR[x];
								System.out.printf("\nCarrinho atual: %d", quantidade, " x ", PRODUTO[x], "\tValor Unitário: %f", VALOR[x], "\tTotal: %f", carrinho,"\n");
								
								qtdeCompra+=quantidade;
								valorFinal+=carrinho;
								ESTOQUE[x]= ESTOQUE[x]- quantidade;
								PRODUTOFINAL[x]=PRODUTO[x];
								
								if(PRODUTO[x].equals(PRODUTOFINAL[x])) {
									VALORFINAL[x]+=carrinho;
									QTDEFINAL[x]+=quantidade;
								}
							}else {
								System.out.printf("\nESTOQUE INDISPONÍVEL! \n VERIFIQUE A LISTA. \n APERTE ENTER PARA CONTINUAR.");
								y = leia.next();
							}
						}else {
							System.out.printf("\nVERIFIQUE O ESTOQUE NOVAMENTE, PARA ISSO APERTE ENTER PARA RECOMEÇAR.");
							y = leia.next();
						}
					} 
					/* Renata e flavio*/
					System.out.printf("SALDO RESTANTE : %s  " ,PRODUTO[x] , " \t %s" , ESTOQUE[x] ); /* LINHA 153 portugol*/
					
								/*LIMPA*/
					
							System.out.printf(" SUA COMPRA DE %d" , qtdeCompra ," DONNUTS, VALOR ATUAL R$  %d" ,valorFinal );
							System.out.printf("\n***CARRINHO***\n\n");
						
					for (int x = 0; x<10 ; x++){
						if (PRODUTOFINAL[x]!= ""){
							System.out.printf( " %d",QTDEFINAL[x] ," %s" ,PRODUTOFINAL[x], "\t R$ %f" , VALORFINAL[x]);
						}
					}
				
					
				}
				/*Falta traduzir da linha 153 a 166
				
				 *INFORME O CODIGO
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