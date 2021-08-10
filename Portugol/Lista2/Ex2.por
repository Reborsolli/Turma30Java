programa
{
	
	funcao inicio()
	{/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/
		
		real  Hr= 0 , Salario , SalHE , He 
		inteiro Cod
		
		escreva ("Digite deu codigo")
		leia (Cod)
		escreva ("Horas de Trabalho")
		leia ( Hr)

		se ( Hr <=50){

			Salario = Hr * 10
		escreva ("\n Funcionario : ", Cod , "\nHoras Trabalhadas :" , Hr ,  " \nSalario R$:" , Salario )}
			senao {
				
				He = Hr - 50 
				SalHE = (He *20) + 500

			

			escreva (" Funcionario : ", Cod , "\nHoras Trabalhadas 50hrs \n Horas extras:" , He ,  " \nSalario R$:" , SalHE) 
		
	}}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */