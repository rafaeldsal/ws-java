import java.util.Locale;
import java.util.Scanner;

/* Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule
 * seu peso ideal, usando a seguinte fórmula: (72.7 * altura) - 58
 */
public class Exer12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal de acordo com a altura informada é de " + pesoIdeal);
		
		scan.close();

	}

}
