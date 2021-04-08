programa
{
	inclua biblioteca Calendario 	
	funcao ano_atual(){}
	funcao inicio()
	{
		cadeia nome
		inteiro anoDeNascimento
		
		
		escreva("Bem vindo!\n")
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("digite o ano de seu nascimento: ")
		leia(anoDeNascimento)
		limpa()
		escreva("Olá ",nome,"\n Sua idade aproximada é ",(Calendario.ano_atual()-anoDeNascimento)," anos")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */