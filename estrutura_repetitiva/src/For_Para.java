import java.util.Scanner;

/*Fazer um programa que l� um valor
inteiro N e depois N n�meros inteiros.
Ao final, mostra a soma dos N n�meros
lidos*/
public class For_Para {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		int num1 = scan.nextInt();
		
		for(int i = 0; i < num1; i++) {
			int num2 = scan.nextInt();
			soma += num2;
		}
		
		System.out.println(soma);
		scan.close();
	}

}
