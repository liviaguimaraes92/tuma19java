programa {
	
	inclua  biblioteca Util

	
		caracter numero
		inteiro contadorTalao=0
		cadeia cpf
		real limite = 1000.0
		real emprestimoEmpresa, limiteEstudantil
		logico status
		caracter opcao, continuar, opcaoMovimentacao
		cadeia tipo
		real saldo = 0.00, valorMovimento = 0.00, saldoFinal = 0.00
		real usarLimite
		caracter movimento

	funcao inicio ()

{

	faca 
	{
		limpa ()
		escreva ("[BANCO 4U]\n")
		escreva  ("[O SEU LUGAR É AQUI]\n\n\n")
		escreva ("1- CONTA POUPANÇA \n2- CONTA CORRENTE \n3 CONTA ESPECIAL \n4 - CONTA EMPRESA \n5 CONTA ESTUDANTIL \n6 SAIR \n\n")

		escreva ("DIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
		leia (opcao)

		se (opcao == '1') {

			inteiro diaAniversario
			tipo = "POUPANÇA"
			cabecalho (tipo)
			escreva ("Digite o dia do seu aniversário: ")
			leia(diaAniversario)

			para (inteiro x=1; x<=10; x++) {
			
				escreva ("Saldo Atual: R$ ",saldo, "\n")
				escreva ("MOVIMENTO - D-débito ou C_Crédito: ")
				leia (movimento)
	
				se (movimento == 'D') {
					
					escreva ("Valor movimento R$ ")
					leia (valorMovimento)
					saldo = saldo - valorMovimento

				} 

				senao se (movimento == 'C') {
					
					escreva ("Valor movimento R$ ")
					leia (valorMovimento)
					saldo = saldo + valorMovimento
				} 

				senao {
					escreva ("Não foi possível identificar sua arfimação. Tente novamente: ") 
				}

				escreva ("Continua S/N: ")
				leia (continuar)


				se (continuar == 'N') {

					escreva ("Movimentação realida com sucesso! \n")
					escreva ("Seu saldo agora é de: R$ ", saldo, "\n")
					escreva ("Obrigado por ultilizar nossos serviços! Volte sempre! \n")

					pare
				} 

				senao se (continuar == 'S') {
		
					escreva ("Ok, vamos tentar novamente!")

				} 
	
				senao { 

					escreva ("Não foi possível identificar sua afirmação. Tente novamente: ")

				}

				Util.aguarde(2000)
				limpa ()
			} 

		}
		senao se (opcao == '2') {

			tipo = "CORRENTE"
			cabecalho (tipo)
			Util.aguarde (2000)
		} 


		senao se (opcao == '3') { // livia
				para (inteiro x=1; x<=10; x++) {
			
				escreva ("Saldo Atual: R$ ",saldo, "\n")
				escreva ("Seu limite é de: R$ ",limite, "\n")
				escreva ("MOVIMENTO - D-débito ou C_Crédito: ")
				leia (movimento)
	
				se (movimento == 'D') {
					
					escreva ("Valor movimento R$ ")
					leia (valorMovimento)
					saldo = saldo - valorMovimento 
					se (saldo <= 0.00) {
						se ((limite*-1) <= saldo) {
							 limite = limite + saldo
							 saldo = 0.00
						}
						senao {
							escreva ("Limite insuficiente")
							saldo = valorMovimento - saldo
						}
						 
					}

				} 

				senao se (movimento == 'C') {
					
					escreva ("Valor movimento R$ ")
					leia (valorMovimento)
					se (limite < 1000){
						limite = limite + valorMovimento
						se (limite > 1000) {
							saldo = saldo + limite - 1000
							limite = 1000
							 
						}
					}
					senao {
						saldo = saldo + valorMovimento
					}
				} 

				senao {
					escreva ("Não foi possível identificar sua arfimação. Tente novamente: ") 
				}

				escreva ("Continua S/N: ")
				leia (continuar)


				se (continuar == 'N') {

					escreva ("Movimentação realida com sucesso! \n")
					escreva ("Seu saldo agora é de: R$ ", saldo, "\n")
					escreva ("Obrigado por ultilizar nossos serviços! Volte sempre! \n")

					pare
				} 

				senao se (continuar == 'S') {
		
					escreva ("Ok, vamos tentar novamente!")

				} 
	
				senao { 

					escreva ("Não foi possível identificar sua afirmação. Tente novamente: ")

				}

				Util.aguarde(2000)
				limpa ()
			
				
			}
							
			Util.aguarde(2000)
		 	

			escreva ("\n CONTA [ESPECIAL]")
			Util.aguarde (2000)
		} // livia

		senao se (opcao == '4' ) {

			escreva ("\n CONTA [EMPRESA]")
		} 

		senao se (opcao == '5' ) {

			escreva ("\n CONTA [ESTUDANTIL]")
		} 

		senao se (opcao == '6' ) {

			escreva ("\n Obrigade por utilizar nossos serviços! \n")
			Util.aguarde (2000)
		}

	} enquanto (opcao != '6')
		
			escreva ("FIM DO PROGRAMA!")
}

	funcao cabecalho (cadeia tipo) {
			caracter aux
			limpa ()
			escreva ("[BANCO 4U]\n")
			escreva("O SEU LUGAR É AQUI]\n\n\n")
			escreva ("Digite o número da conta" )
			leia (numero)
			escreva ("Informe seu CPF: ")
			leia (cpf)
			escreva ("1 - Ativo ou 2 - Inativo: ")
			leia (aux)

	se (aux == '1') {
		status = verdadeiro
} 

	senao {
		status = falso
}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */