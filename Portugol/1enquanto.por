programa
{
/*
 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
 * no final o total do somatório, a média e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver 
 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário 
 * fornecer um valor negativo.

 */
	
	funcao inicio()
	{
		real valor = 0.00
		real totalSoma = 0.00
		real media = 0.00
		inteiro totalValores = 0
			
			leia (valor)
	enquanto (valor > 0) {
			leia (valor)
			totalSoma = totalSoma + valor
			totalValores++

	se (valor  < 0)
						{
			escreva ("\n O total da soma dos valores é de: ")
			media = totalSoma / totalValores
			escreva ("\n Media de valores é igual a: ", media)
	}
						}

						}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */