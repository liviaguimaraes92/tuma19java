programa 
{
	funcao inicio ()
	{	

	inteiro matriz[3][3]
	real media = 0.0
	inteiro maiorNumero =0
	inteiro contador =0
	
	para (inteiro x=0; x<10; x++)
	{
		escreva("Digite o número do vetor: ",x+1, ": ")
		leia (matriz[3][3])
		media = media + (matriz[3][3])
		se (maiorNumero < (matriz[3][3])) {
			media = media + (matriz[3][3])
			maiorNumero = (matriz[3][3])
			contador = 1
			}
		senao se (maiorNumero < (matriz[3][3]))
		{
			contador++
		}
		}
	media = media/10
	para (inteiro x=0; x<10; x++){
		escreva ((matriz[3][3]), " l ")
	}
	escreva("\nMedia: ",media,"\n Maior número: maiorNumero, \nVezes que o maior número saiu: ", contador)
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */