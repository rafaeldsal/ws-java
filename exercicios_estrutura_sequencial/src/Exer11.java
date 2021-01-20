import java.util.Locale;
import java.util.Scanner;

/* Faça um programa que peça dois numero inteiro e um real, calcule e mostre
 * a. o produto do dobro do primeiro com metade do segundo;
 * b. a soma do triplo do primeiro com o terceiro;
 * c. o terceiro elevado ao cubo;
 */
public class Exer11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		double valor3 = scan.nextDouble();
		
		int produto = (valor1 * 2) + (valor2 / 2);
		int somaTriplo = (int) ((int) (valor1 * 3) + valor3);
		double cubo = Math.pow(valor3, 3);
		
		System.out.println("A) Produto do dobro do primeiro com metade do segundo = " + produto);
		System.out.println("B) A soma do triplo do primeiro com o terceiro = " + somaTriplo);
		System.out.println("C) O terceiro elevado ao cubo = " + cubo);
		
		scan.close();

	} 

}
