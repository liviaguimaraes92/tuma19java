import java.util.Scanner;

public class troca {

	public static void main(String[] args) {
	
		
			Scanner leia = new Scanner(System.in);
			
			int a,b,troca;
			
			System.out.println("Digite o valor de a: ");
			a = leia.nextInt();
			System.out.println("Digite o valor de b: ");
			b = leia.nextInt();
			
			troca = a;
			a=b;
			b=troca;
			
			System.out.printf("A = %d\nB=%d\n",a,b);
	}

}
