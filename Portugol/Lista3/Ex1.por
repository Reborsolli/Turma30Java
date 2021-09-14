programa
{
	
	funcao inicio()
	{ 
	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	 coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/
		const inteiro Hab = 20
		real  Sal = 0.00 
		inteiro Fil = 0
		real Mdsal = 0.00 
		real Tsal = 0.00 
		real Mfil = 0.0 
		real Tfil = 0.00
		real contadorSal100 = 0.0	
		real  PH100 = 0.0
		real Mxsal = 0.0
	
		para ( inteiro x = 1 ; x <= Hab ; x++ ){
			
			escreva (" Filhos")
			leia(Fil)
			escreva (" Sal " )
			leia (Sal)
				Tsal= Tsal + Sal 
				Tfil = Tfil + Fil 
		}
			se( Sal > Mxsal ) {
				Mxsal = Sal
		}
			se( Sal <  100.00 ){
				contadorSal100++
	
			}
		
		Mdsal = (Tsal / Hab) 
		Mfil = (Tfil / Hab )
		PH100 = (contadorSal100 / Hab) * 100
	
	
	escreva ("Med Sal R$" , Mdsal )
	escreva ( "Med fil:" , Mfil)
	escreva (" Max sal R$" , Mxsal)
	escreva ( " % - 100:" , PH100)

				
/*a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  */


		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 816; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */