import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		for(int i = 0; i <= valor; i++) {
			
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
