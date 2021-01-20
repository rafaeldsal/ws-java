import java.util.Locale;
import java.util.Scanner;

/* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
 * utilizando as seguintes formulas:
 * a. Para homens: (72.7 * h) - 58;
 * b. Para mulheres: (62.1 * h) - 44.7
 */
public class Exer13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double altura = scan.nextDouble();
		double pesoIdealM = 72.7 * altura - 58;
		double pesoIdealF = 62.1 * altura - 44.7;
		
		System.out.printf("Peso ideal Homens: %.2f%n", pesoIdealM);
		System.out.printf("Peso ideal Mulheres: %.2f%n", pesoIdealF);
		
		scan.close();
	}

}
