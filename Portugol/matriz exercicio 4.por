programa
{
	
	funcao inicio ()
	{ 

		inteiro matriz[3][3],l,c
		inteiro matS = 0
		inteiro matrizD
			
		para (l=0; l<3; l++)
		{
			para (c=0; c<3; c++)
			{
				escreva ("Insira um valor: ")
				leia (matriz[l][c]) 
				matS = matriz[l][c] + matS
			}
		}
		escreva ("\n Soma dos valores da matriz: ",matS )
		matrizD = matriz [0][0] + matriz [1][1] + matriz [2][2]
		escreva ("\n Soma diagonal principal: " ,matrizD)
				
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */