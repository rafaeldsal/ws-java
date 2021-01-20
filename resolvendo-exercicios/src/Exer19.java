import java.util.Locale;
import java.util.Scanner;

/* Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
* A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
* A mensagem "Reprovado", se a m�dia for menor do que sete;
  A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.*/
public class Exer19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distin��o");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		scan.close();
	}

}
