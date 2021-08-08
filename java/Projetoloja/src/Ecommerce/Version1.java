
package Ecommerce;



public class Version1 {
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
		char formaDePagamento;
		int carrinhoVazio = 0; //ESSA VARIÁVEL VAMOS UTILIZAR PARA INFORMAR QUE O CARRINHO AINDA ESTA VAZIO
		double auxNota = 0.0;

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

		PRODUTO[0] = "DONNUT NUTELLA";		
		PRODUTO[1] = "DONNUT NINHO";	
		PRODUTO[2] = "DONNUT COCO";		
		PRODUTO[3] = "DONNUT CHOCO"	;	
		PRODUTO[4] = "DONNUT KIT KAT";		
		PRODUTO[5] = "DONNUT CREME";
		PRODUTO[6] = "DONNUT CHURROS";		
		PRODUTO[7] = "DONNUT GELEIA";		
		PRODUTO[8] = "DONNUT MORANGO";		
		PRODUTO[9] = "DONNUT FRUTAS";

		do{
			System.out.println("\t\t    *** DONNUTIX ***");
			System.out.println("\t\t~ Seu Donnut, nosso Mix ~");
			System.out.println("Deseja fazer compras? Digite S para sim ou digite N para não.");
			sn = leia.next().toUpperCase().charAt(0);
			if (sn == 'S') {
				do {
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("\t\t    *** DONNUTIX ***");
					System.out.println("\t\t~ Seu Donnut, nosso Mix ~\n");
					System.out.println("\t\t    ***** MENU ******\n");
					for (int x = 0; x < 10; x++) {
						System.out.printf("%s\t\t%s\t\t%.2f\t\t%d\n", CODIGO[x], PRODUTO[x], VALOR[x], ESTOQUE[x]);
					}
					
					System.out.print("\n\t\t    *** CARRINHO ***\n"); //ESCREVE O CARRINHO DE COMPRA
					for(int x = 0; x < 10; x++) {
						if(PRODUTOFINAL[x] != null) {
							System.out.printf("%d x %s \t %f \n",QTDEFINAL[x],PRODUTOFINAL[x],VALORFINAL[x]);
						}
						else{
							 carrinhoVazio += 1;
						}
						if(carrinhoVazio == 10) {
							System.out.print("CARRINHO VAZIO.\n \n \n ");
						}
					}
					
					System.out.print("\nInforme o código do donnuts que deseja comprar: ");
					compra = leia.next().toUpperCase();
					for (int x=0; x< 10; x++) {
						if(compra.equals(PRODUTO[x]) || compra.equals(CODIGO[x])) {
							System.out.println("\nQual a quantidade? ");
							quantidade = leia.nextInt();
							System.out.println("\nConfirma a quantidade? ");
							sn = leia.next().toUpperCase().charAt(0);
							if(sn=='S') {
								if(quantidade>0 && quantidade<=ESTOQUE[x]) {
									carrinho = quantidade*VALOR[x];
									
									/*
									 * escreva ("CARRINHO ATUAL: ", quantidade,"  x  ", PRODUTO[x],"\t Valor Unitário: R$", VALOR[x], "\t TOTAL: R$",carrinho,"\n")
									 */
									System.out.printf("\n\nCOMPRA ATUAL: %d x %s \t VALOR UNITÁRIO: R$ %.2f \t TOTAL ACUMULADO: R$ %.2f \n", quantidade, PRODUTO[x], VALOR[x], carrinho);
									
									qtdeCompra+=quantidade;
									valorFinal+=carrinho;
									ESTOQUE[x]= ESTOQUE[x]- quantidade;
									PRODUTOFINAL[x]=PRODUTO[x];
									
									if(PRODUTO[x].equals(PRODUTOFINAL[x])) {
										VALORFINAL[x]+=carrinho;
										QTDEFINAL[x]+=quantidade;
									}
								}else {
									System.out.printf("\nESTOQUE INDISPONÍVEL! \n VERIFIQUE A LISTA. \n APERTE ENTER PARA CONTINUAR.\n");
									y = leia.next();
								}
							}
							else {
								System.out.printf("\nVERIFIQUE O ESTOQUE NOVAMENTE, PARA ISSO APERTE ENTER PARA RECOMEÇAR.\n");
								y = leia.next();
							}
							//System.out.printf("\nSALDO RESTANTE: %s  ", PRODUTO[x], " \t %d" , ESTOQUE[x] ); /* LINHA 153 portugol*/					
						} 
						
						
					}
					
					System.out.printf("\nSUA COMPRA DE %d DONNUTS, VALOR ATUAL R$  %.2f \n" , qtdeCompra,valorFinal );
					System.out.printf("\n\t\t    *** CARRINHO ***\n");
				
					for (int x1 = 0; x1<10 ; x1++){ //tive que mudar de X para X1 porque estava dando bug (by: Ester)
						if (PRODUTOFINAL[x1]!= null){
							System.out.printf("%d x %s \t R$ %.2f \n",QTDEFINAL[x1],PRODUTOFINAL[x1], VALORFINAL[x1]);
						}
					}
					
					System.out.print("\nDeseja continuar comprando? Digite S para sim ou N para não.");
					sn = leia.next().toUpperCase().charAt(0);
					
				}while(sn == 'S');
				 
				leia.next();
				System.out.print("\nMétodos de pagamento: ");
				System.out.print("\n1 - À vista com 10% de desconto.");
				System.out.print("\n2 - No cartão de crédito em 1x (10% de acréscimo.)");
				System.out.print("\n3 - No cartão de crédito em 2x (15% de acréscimo.");
				System.out.print("\nInforme a forma de pagamento desejada [1/2/3]: ");
				formaDePagamento = leia.next().charAt(0);


				if (formaDePagamento == '1') { 
					System.out.print("\n*******DONNUTIX*******\n\n");    
					System.out.print("****NOTA FISCAL****");
					for (int x = 0; x < 10; x++) {                        
						if (PRODUTOFINAL[x] != null) {
							System.out.printf("\n%d - %s - R$%.2f \n", QTDEFINAL[x], PRODUTOFINAL[x], VALORFINAL[x]);
						}
					}
					System.out.printf("\nValor total da nota fiscal: R$ %.2f", valorFinal);
					System.out.printf("\nImpostos sobre a nota: R$ %.2f", valorFinal * 0.09);
					System.out.printf("\nValor do desconto: R$%.2f",  valorFinal * 0.1  );
					valorFECHADO = valorFinal - valorFinal * 0.10;
					System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
					System.out.print("\nObrigado pela preferência!");
				}
				else if (formaDePagamento == '2') { 
					System.out.print("\n*******DONNUTIX*******\n\n");     
					System.out.print("****NOTA FISCAL****");
					for (int x = 0; x < 10; x++) {                         
						if (PRODUTOFINAL[x] != null) {
							System.out.printf("\n%d - %s - R$%.2f \n", QTDEFINAL[x], PRODUTOFINAL[x], VALORFINAL[x]);
						}
					}
					System.out.printf("\nValor total da nota fiscal: R$%.2f", valorFinal);
					System.out.printf("\nImpostos sobre a nota: R$%.2f", valorFinal*0.09);
					System.out.printf("\nValor do acréscimo: R$%.2f", valorFinal *0.10);
					valorFECHADO = valorFinal + valorFinal * 0.10;
					System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
					System.out.print("\nObrigado pela preferência!");
				}
				else if (formaDePagamento == '3') { 
					System.out.print("\n*******DONNUTIX*******\n\n");     
					System.out.print("****NOTA FISCAL****");
					for (int x = 0; x < 10; x++) {                         
						if (PRODUTOFINAL[x] != null) {
							System.out.printf("\n%d - %s - R$%.2f \n", QTDEFINAL[x], PRODUTOFINAL[x], VALORFINAL[x]);
						}
					}
					System.out.printf("\nValor total da nota fiscal: R$%.2f", valorFinal);
					System.out.printf("\nImpostos sobre a nota: R$%.2f",  valorFinal *0.09);
					System.out.printf("\nValor do acréscimo: R$%.2f",  valorFinal *0.15);
					valorFECHADO = valorFinal +valorFinal*0.15;
					System.out.printf("\nValor total a pagar: R$%.2f", valorFECHADO);
					System.out.printf("\nSerão 2 parcelas de : R$%.2f" , valorFECHADO / 2 );
					System.out.print("\nObrigado pela preferência!");
				}
				
				else { // caso o usuário não informe uma forma de pagamento válida (ele irá pra pergunta se quer continuar comprando)
					System.out.println("\nVocê informou uma forma de pagamento inválida.");
				}
				
				/*
				System.out.printf("\nDeseja continuar comprando? [S/N]");
				sn = leia.next().toUpperCase().charAt(0);
				*/

			} else {
				System.out.println("Até Breve!");
			}
			
		}while(sn=='S');
		
	}
}


