package lista4objetos;

import java.util.Scanner;

public class ClasseCliente {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Cliente cliente1 = new Cliente();

        System.out.println("Nome do Cliente: ");
        cliente1.nome = leia.next();
        System.out.println("CPF do cliente: ");
        cliente1.cpf = leia.next();
        System.out.println("Qual sua idade: ");
        cliente1.idade = leia.nextInt();
        System.out.println("Digite seu email: ");
        cliente1.email = leia.next();
        System.out.println("Forma de Pagamento: 1- Cart�o de Cr�dito 2- Cart�o de D�bito 3- Dinheiro: ");
        cliente1.formaDePagamento = leia.next();

        System.out.printf("Dados do Cliente:\n%s \n%s \n%d \n%s \n%s", cliente1.nome, cliente1.cpf, cliente1.idade, cliente1.email, cliente1.pagamento());
               

    }

}