import java.util.Locale;
import java.util.Scanner;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem alguma).*/

public class Exer25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		while (x != 0 || y != 0) {
			
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			} else if(x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			} else {
				System.out.println("Quarto Quadrante");
			}
			
			x = scan.nextDouble();
			y = scan.nextDouble();
			
		}
		
		scan.close();
		
	}

}
