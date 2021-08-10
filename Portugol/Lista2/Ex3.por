programa
{
	
	funcao inicio()
	{
	/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/ 


	inteiro n1, n2 , n3 , n4 , q1, q2 , q3, q4

		escreva("N1")
		leia(n1)
		escreva("N2")
		leia(n2)
		escreva("N3")
		leia(n3)
		escreva("N4")
		leia(n4)

		q1 = n1*n1
		q2 =n2*n2
		q3= n3*n3
		q4 = n4 * n4 

		se (q1+q2+q3 > 1000){

		 	escreva (" O quadrado N3 é :" , q3)
		}
		senao 
		escreva ( "O quadrdo de N1 : " , q1 , "\nO quadrdo de N2:" ,q2 ,"\nO quadrdo de N3:" , q3, "\nO quadrdo de N4:", q4) 
		 	

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */