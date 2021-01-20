import java.util.Locale;
import java.util.Scanner;

/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o Paulo
 * (50 quilos) deve pagar uma multa de R$4.00 por quilo excedente. Jo�o precisa que voc� fa�a um programa que leia 
 * a vari�vel peso (peso de peixes) e calcule o excesso a quantidade de quilos al�m do limitie e na vari�vel multa o valor da multa
 * que jo�o pagara. Imprima os dados do programa com as mensagens adequadas;
 */
public class Exer14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com quantos kilos de peixe foi pego: ");
		double pesoDePeixes = scan.nextDouble();
		
		if (pesoDePeixes> 50.0) {
			double excesso = pesoDePeixes - 50.0;
			double multa = excesso * 4.0;
			System.out.printf("Peixe pego em excesso(KG): %.2fKg%n", excesso);
			System.out.printf("Multa a pagar pelo excesso: R$%.2f", multa);
		} else {
			System.out.println("A pescaria essa vez foi de acordo com o regulamento. Tudo certo!");
		}
		scan.close();
	}

}
