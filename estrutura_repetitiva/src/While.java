import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final mostrar a soma dos n�meros lidos
public class While {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = scan.nextInt();
		}
		System.out.println(soma);
		scan.close();
	}
}
