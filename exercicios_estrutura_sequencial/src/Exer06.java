import java.util.Locale;
import java.util.Scanner;

// Fa�a um programa que pe�a o raio de um circulo, calcule e mostre sua �rea;
public class Exer06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = scan.nextDouble();
		double area = pi * (raio * raio);
		
		System.out.printf("A �rea do circulo � de %.2f", area);
		
		scan.close();

	}

}
