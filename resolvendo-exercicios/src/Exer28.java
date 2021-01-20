import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valorDentroIntervalo = 0, valorForaIntervalo = 0;
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			int X = scan.nextInt();
			
			if (X >= 10 && X <= 20) {
				valorDentroIntervalo += 1;
			} else {
				valorForaIntervalo += 1;
			}
		}
		
		System.out.println(valorDentroIntervalo + " in");
		System.out.println(valorForaIntervalo + " out");
		
		scan.close();
	}

}
