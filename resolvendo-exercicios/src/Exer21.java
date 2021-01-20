/*Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao utilizar
 *  um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. 
 *  Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante 
 *  a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, calcular quantos litros seriam necess�rios. 
 *  Mostre o valor com 3 casas decimais ap�s o ponto.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exer21 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        int tempoGasto = scan.nextInt();
        double velocMedia = scan.nextDouble();
        
        double distPercorrida = tempoGasto * velocMedia;
        double litros = distPercorrida / 12;
        
        System.out.printf("%.3f%n", litros);
        
        scan.close();
    }
 
}