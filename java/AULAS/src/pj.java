programa
{
//CODIGO INICIAL - ESTRUTURA BASICA 	                                                                            29/07  �s  18:15
//CODIGO REFORMULADO - ESTRUTURA DE CARRINHO, TOTALIZADOR DE COMPRA, TOTALIZADOR DE VALORES, RECURSIVIDADE DA LOJA  30/07  �s  12:50
//CARRINHO ADICIONADO - NOTA FISCAL FINALIZADA - FORMAS DE PAGAMENTO - IMPOSTOS - RECURSIVIDADE DO CODIGO           30/07  �s  18:15
//ADI��O DE COMENT�RIOS PARA EXPLICA��O DO C�DIGO.													 01/08  �s  02:26
//Corre��o do valor do imposto e do bug do Estoque Inv�lido												 01/08  �s  23:07
inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		/*		******************** ATIVIDADE SOLICITADA *******************
		 * Fazer uma loja virtual
		 * Precisa de NOME-SLOGAN-PRODUTOS
		 * 4 Vetores - CODIGO (G01yy) - x = Grupo y = Numero do Produto
		 * 		   - PRODUTO - Grupo Decide
		 * 		   - VALOR - Grupo Decide
		 * 		   - ESTOQUE - 10 de cada produto para todos os grupos (10 produtos, 100 produtos cada grupo)
		 * Loja deve Exibir produtos em vitrine
		 * Loja deve Exibir carrinho com os produtos escolhidos
		 * Ap�s o pedido ser fechado Deve exibir Nota Fiscal
		 * 
		 * Nota Fiscal deve exibir
		 * NOME DA LOJA
			VALOR TOTAL DA COMPRA
			MOSTRA 9% IMPOSTO EM CIMA DO VALOR TOTAL
			OP��ES DE PAGAMENTO - 1 A VISTA COM 10% DESCONTO
			OP��O 2 - NO CART�O COM ACRESCIMO DE 10%
			OP��O 3 � EM DUAS VEZES COM 15% TOTAL DE ACRESCIMENTO - TEM QUE MOSTRA O VALOR DE CADA PARCELA
			MOSTRA A NOTA FISCAL [SIMULADO] FINAL
			Ao terminar, Deve retornar ao in�cio do programa
			Alterar o estoque com produtos pedidos e funcionar novamente
		 * 
		 */

			//*****VETORES DA LOJA*******
	real VALOR [10]       //Vetor dos pre�os dos produtos na loja
	inteiro ESTOQUE [10]  //Vetor do estoque dos produtos (devem ser 10 segundo pedido na tarefa)
	cadeia PRODUTO[10]    //Vetor dos produtos exibidos na loja
	cadeia CODIGO[10]     //Vetor dos codigos dos produtos exibidos na loja
			
			//******VETORES DO CARRINHO DE COMPRAS******
	cadeia PRODUTOFINAL[10] //Vetor do produto no carrinho
	real VALORFINAL[10] //Vetor para guardar os pre�os dos produtos no carrinho
	inteiro QTDEFINAL[10] //Vetor para guardar as quantidades de cada produto comprado
			
			// VARIAVEIS PARA LEITURA
	cadeia compra 				//Leitura do pedido do cliente
	caracter sn = 'S' 			//Variavel para Continuar ou Sair da compra
	inteiro quantidade 			//Quantidade de produtos pedidos
	real carrinho = 0.0 		//Variavel do pre�o para calcular e colocar no carrinho
	inteiro qtdeCompra =0 		//Variavel de quantidade comprada para finalizar o pedido
	real valorFinal =0.0		//Variavel para calculo do pre�o final com v�rios produtos
	real imposto = 0.09 		//Imposto sugerido pela atividade para cria��o da nota fiscal
	real pgtVista = 0.0 		//Forma de Pagamento (1) - 10% de desconto
	real pgtCartao = 0.0 		//Forma de Pagamento (2) - 10% de acr�scimo
	real pgtParcelado =0.0 		//Forma de Pagamento(3) - Parcelado com 15% a mais (tem de aparecer cada parcela)
	real valorFECHADO 			//Vari�vel para calcular o pre�o final com altera��es de imposto e desconto/acrescimo de formas de pagamento
	real custoImposto =0.0
	cadeia y="grupo1" 			//Vari�vel coringa para a �ltima tela aguardar um input, pode ser qualquer coisa desde que seja lida
	inteiro formaDePagamento
	
	para(inteiro x=0;x<10;x++){   //La�o de Repeti��o para calcular o C�digo dos produtos
		CODIGO[x]=("g1"+ (x +1)) //Grupo 1 - g1 ou G1 O c�digo deve ser simples pois o produto pode ser pedido por ele
	}
	para(inteiro x=0;x<10;x++){	//La�o de Repeti��o para calcular o Estoque dos produtos
		ESTOQUE[x]=(10)		//Estoque definido em 10 pode ser alterado a qualquer momento
	}


					//*** INSER��O DOS PRODUTOS NO VETOR DE PRODUTOS
	PRODUTO[0] = "DONNUT NUTELLA"			
	PRODUTO[1] = "DONNUT NINHO"			
	PRODUTO[2] = "DONNUT COCO"			
	PRODUTO[3] = "DONNUT CHOCO"			
	PRODUTO[4] = "DONNUT KIT KAT"			
	PRODUTO[5] = "DONNUT CREME"			
	PRODUTO[6] = "DONNUT CHURROS"			
	PRODUTO[7] = "DONNUT GELEIA"			
	PRODUTO[8] = "DONNUT MORANGO"			
	PRODUTO[9] = "DONNUT FRUTAS"			
					
					
					//*** INSER��O DOS VALORES NO VETOR DE PRE�OS
	VALOR[0] = 12.00
	VALOR[1] = 15.00
	VALOR[2] = 16.00
	VALOR[3] = 13.00
	VALOR[4] = 12.00
	VALOR[5] = 13.00
	VALOR[6] = 10.00
	VALOR[7] = 10.00
	VALOR[8] = 12.00
	VALOR[9] = 11.00



				//******************** INICIO DO CODIGO ***********************
	
	faca{	// Ciclo Fa�a Repete o C�digo desde o come�o enquanto sn == 's' ou 'S' (Essa variavel � lida a cada ciclo)
		escreva("*******DONNUTIX*******\n\n")			//NOME DA LOJA
		escreva("**Seu Donnut, Nosso mix**\n\n\n")		//SLOGAN DA LOJA
		escreva("DESEJA FAZER COMPRAS? [S ou N]\n")		
		leia(sn)									//sn de leitura, se 's' inicia o programa, 'n' ou qualquer outra coisa finaliza o programa
		se(sn=='s' ou sn=='S'){						// Ciclo condicional, finaliza o programa se sn != 's'
						faca{
								limpa()										// Limpeza de console para melhor usabilidade
								escreva("*******DONNUTIX*******\n\n")				//NOME DA LOJA
								escreva("**Seu Donnut, Nosso mix**\n\n\n")			//SLOGAN DA LOJA
								escreva("COD\tSABORES DONNUT'S\tVALOR\t\tESTOQUE\n\n")	//CABE�ALHO DE VENDA
								
												//*************LA�O DE REPETI��O PARA FAZER A VITRINE***************
								para(inteiro x=0;x<10;x++){
									escreva(CODIGO[x], "\t", PRODUTO[x],"\t\tR$ ",VALOR[x],"\t\t",ESTOQUE[x],"\n")
								}				// ***************FIM DO LA�O DE REPETI��O DA VITRINE***************
								escreva("\n***CARRINHO***\n\n")//Escreve Carrinho na Tela 
									para(inteiro x=0;x<10;x++){ //LA�O DE REPETI��O PARA IMPRIMIR OS PRODUTOS NO CARRINHO. X DEVE SER < QUE O NUMERO DE PRODUTOS PARA N�O DAR ERRO
									se(PRODUTOFINAL[x]!= ""){ //VERIFICA��O PARA ELIMINAR VARIAVEIS NULAS DO VETOR
									escreva(QTDEFINAL[x], " x  ", PRODUTOFINAL[x],"\t R$",VALORFINAL[x],"\n") //ESCREVE OS PRODUTOS DO CARRINHO NA TELA
							}
						}
								escreva("\n \t       Quais Donnut's deseja comprar? (escreva o c�digo do produto) \n")  //Pergunta para o cliente
								leia(compra)															   //Resposta do Cliente
								para(inteiro x=0;x<10;x++){		//Inicio do la�o de repeti��o, verifica qual produto foi pedido x deve ser < que o numero de produtos no vetor
									se(compra==PRODUTO[x] ou compra == CODIGO[x]){  //Valida��o se o pedido do cliente � v�lido, Valida C�digo ou nome do produto
										escreva("\nCONFIRMA PRODUTO: \n", CODIGO[x], "\t", PRODUTO[x],"\t",VALOR[x],"R$ \t\t \n\n") //Confirma��o para inser��o do produto no carrinho
										escreva("CERTO?? [S ou N] \n")			//Pergunta ao cliente
										leia(sn)								//Leitura para continuar a compra, se sn != ele pergunta se quer continuar a compra
										se(sn=='s' ou sn=='S'){					//Desvio Condicional para validar a quantidade da compra
											escreva("\nQual a quantidade? \n")		//Pergunta ao cliente
											leia(quantidade)					//Leitura da quantidade
											se(quantidade>0 e quantidade<=ESTOQUE[x]){	
												carrinho = quantidade*VALOR[x]	//Coloca no Carrinho a quantidade para exibi��o
												escreva ("CARRINHO ATUAL: ", quantidade,"  x  ", PRODUTO[x],"\t Valor Unit�rio: R$", VALOR[x], "\t TOTAL: R$",carrinho,"\n") //Exibi��o do carrinho para valida��o do cliente
												escreva("\nCONFIRMA?? [S ou N]\n")		//Confirma��o do cliente
												leia(sn)							//Leitura de sn
												se(sn=='s' ou sn=='S'){				//Desvio condicional para Valida��o do estoque
																				//Se pedido � v�lido, faz as altera��es
												qtdeCompra+=quantidade				//Coloca a quantidade de compras = quantidade que estava no carrinho
												valorFinal+=carrinho				//Valor final da compra soma com o que foi colocado no carrinho
												ESTOQUE[x]= ESTOQUE[x]-quantidade		//Retira a quantidade solicitada de produtos do estoque
												PRODUTOFINAL[x]=PRODUTO[x]			//Coloca o produto pedido no vetor do carrinho
												se(PRODUTO[x]==PRODUTOFINAL[x]){		//Condicional para validar se o produto j� est� no carrinho
												VALORFINAL[x]+=carrinho				//Se j� estiver, soma o valor atual do carrinho para mostrar atualizado
												QTDEFINAL[x]+=quantidade				//Se j� estiver soma a quantidade do carrinho para mostrar atualizado
													}
												}
											}senao{
												escreva("ESTOQUE INDISPON�VEL! \nVERIFIQUE A LISTA E INFORME UMA QUANTIDADE V�LIDA\nAPERTE ENTER PARA CONTINUAR\n\n") //Caso pedido seja inv�lido, quebra o Desvio, n�o faz as altera��es futuras e retorna para a tela de compra
												leia(y)
												
											
										}
									}escreva("\nSALDO RESTANTE: ", PRODUTO[x],"\t",ESTOQUE[x],"\n")			//Exibe a quantidade atualizada do estoque do produto pedido
								}
									
							}
								limpa() 																//Limpa a tela para melhor usabilidade
								escreva("\nSUA COMPRA DE ",qtdeCompra," DONNUTS, VALOR ATUAL R$",valorFinal,"  \n")	//Exibe o pedido atual do cliente (quantidade de Donnuts e Valor)
								escreva("\n***CARRINHO***\n\n") 											//Exibe o carrinho atual do cliente
									para(inteiro x=0;x<10;x++){											//Faz o ciclo do carrinho (� o mesmo que exibe o carrinho na tela)
									se(PRODUTOFINAL[x]!= ""){
									escreva(QTDEFINAL[x], " x ", PRODUTOFINAL[x],"\t R$",VALORFINAL[x],"\n")
							}
						}
								escreva("\nDESEJA CONTINUAR COMPRANDO?? [S ou N] \n")			//Valida se o cliente quer continuar
								leia(sn)												//Se sn for != de 's' sai do la�o Fa�a-Enquanto
						
						}enquanto(sn=='s' ou sn =='S')									//Fim do segundo la�o Fa�a-Enquanto
				
				limpa()																	//Limpeza de tela para melhorar usabilidade
				

				escreva("*******DONNUTIX*******\n\n")						//Nome da Loja para Nota Fiscal
				
				para(inteiro x=0;x<10;x++){												//La�o para exibir os produtos pedidos na nota
					se(PRODUTOFINAL[x]!= ""){											//condicional para exibir APENAS os produtos no Vetor de produtos no carrinho
						escreva(QTDEFINAL[x], " ", PRODUTOFINAL[x],"\t R$",VALORFINAL[x],"\n")	//Escreve os produtos do carrinho na tela
					}
				}
				
				escreva("M�todos de pagamento: ")
				escreva("\n1 - � vista com 10% de desconto -")
				escreva("\n2 - No cart�o de cr�dito em 1x (10% de acr�scimo)")
				escreva("\n3 - No cart�o de cr�dito em 2x (15% de acr�scimo)")
				escreva("\nPor favor, informe a forma de pagamento [1/2/3]: ")
			
			leia (formaDePagamento)
			se(formaDePagamento == 1){
				limpa()
				escreva("*******DONNUTIX*******\n\n")	
				escreva("*** NOTA FISCAL *** \n\n")
				para(inteiro x=0;x<10;x++){												//La�o para exibir os produtos pedidos na nota
					se(PRODUTOFINAL[x]!= ""){											//condicional para exibir APENAS os produtos no Vetor de produtos no carrinho
						escreva(QTDEFINAL[x], " ", PRODUTOFINAL[x],"\t R$",VALORFINAL[x],"\n")	//Escreve os produtos do carrinho na tela
					}
				}
				escreva("\nValor total do produto: R$", valorFinal)
				escreva("\nImpostos sobre nota: R$", Mat.arredondar((valorFinal*0.09), 2))
				escreva("\nValor do desconto: R$", Mat.arredondar(valorFinal*0.1,2))
				valorFECHADO = valorFinal - valorFinal*0.1
				escreva("\nValor Total a pagar: R$" , Mat.arredondar(valorFECHADO,2))
				escreva("\n\nObrigado pela prefer�ncia!")
				escreva("\n\nDESEJA CONTINUAR COMPRANDO??[S/N]: ")			//Valida se o cliente quer continuar
				leia(sn)	
				
			}
			se(formaDePagamento == 2){
				limpa()
				escreva("*******DONNUTIX*******\n\n")	
				escreva("*** NOTA FISCAL *** \n\n")
				para(inteiro x=0;x<10;x++){												//La�o para exibir os produtos pedidos na nota
					se(PRODUTOFINAL[x]!= ""){											//condicional para exibir APENAS os produtos no Vetor de produtos no carrinho
						escreva(QTDEFINAL[x], " ", PRODUTOFINAL[x],"\t R$",VALORFINAL[x],"\n")	//Escreve os produtos do carrinho na tela
					}
				}
				escreva("\nValor total do produto: R$",valorFinal)
				escreva("\nImpostos sobre a nota: R$",Mat.arredondar((valorFinal*0.09), 2))
				escreva("\nValor do acr�scimo: R$", Mat.arredondar(valorFinal*0.1,2))
				valorFECHADO = valorFinal + valorFinal*0.1
				escreva("\nValor Total a pagar: R$" , Mat.arredondar(valorFECHADO,2))
				escreva("\n\nObrigado pela prefer�ncia!")
				escreva("\n\nDESEJA CONTINUAR COMPRANDO??[S/N]: ")			//Valida se o cliente quer continuar
				leia(sn)	
				
			}
			se(formaDePagamento == 3){
				limpa()
				escreva("*******DONNUTIX*******\n\n")	
				escreva("*** NOTA FISCAL *** \n\n")
				para(inteiro x=0;x<10;x++){												//La�o para exibir os produtos pedidos na nota
					se(PRODUTOFINAL[x]!= ""){											//condicional para exibir APENAS os produtos no Vetor de produtos no carrinho
						escreva(QTDEFINAL[x], " ", PRODUTOFINAL[x],"\t R$",VALORFINAL[x],"\n")	//Escreve os produtos do carrinho na tela
					}
				}
				escreva("\nValor total do produto: R$", valorFinal)
				escreva("\nImpostos sobre a nota: R$",Mat.arredondar((valorFinal*0.09), 2))
				escreva("\nValor do acr�scimo: R$", Mat.arredondar((valorFinal*0.15),2))
				valorFECHADO = valorFinal + valorFinal*0.15
				escreva("\nValor total da parcela: Duas parcelas de R$", Mat.arredondar((valorFECHADO/2),2))
				escreva("\nValor Total a pagar: R$" , Mat.arredondar(valorFECHADO,2))
				escreva("\n\nObrigado pela prefer�ncia!")
				escreva("\n\nDESEJA CONTINUAR COMPRANDO??[S/N]: ")			//Valida se o cliente quer continuar
				leia(sn)	
				
			}
				leia(y)											//L� vari�vel coringa para cliente finalizar a compra ou retornar e fazer mais compras
				quantidade=0					//Redefine a quantidade de produtos no carrinho
				carrinho=0.0					//Redefine o pre�o dos produtos no carrinho
				para(inteiro x=0;x<10;x++){		//La�o de repeti��o para varrer e limpar os vetores do carrinho
					QTDEFINAL[x] = 0			//Limpa o vetor de quantidade
					PRODUTOFINAL[x] = ""		//Limpa o vetor dos produtos e insere um espa�o vazio no lugar
					VALORFINAL[x] = 0.0			//Limpa o vetor dos valores
					valorFinal=0.0				//Limpa a vari�vel de Valor
					qtdeCompra=0				//Limpa a vari�vel de quantidade comprada para finalizar o pedido
				}
				limpa()						//Limpa a Tela para melhor usabilidade
				sn='s'						//Define sn para 's' para que o la�o n�o acabe ap�s um pedido
				
				
			}senao{							//Fim da condicional Se, Se o cliente n�o quiser fazer compras, ele vem para c�
				limpa()						//Limpa a Tela para melhor usabilidade
			escreva("ATE LOGO")					//Mensagem de encerramento do programa
		}
	}enquanto(sn=='s' ou sn=='S')						//Fim do La�o Fa�a-Enquanto, Se o cliente n�o quiser fazer compras ele encerra o la�o
}
}