import java.util.Scanner;

public class P411_TelaDeAraña {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, ele;
		long suma;
		boolean cont = true;

		while (true) {
			x = sc.nextInt();
			if ( x == 0) {
				break;
			}
			
			suma = 0;
			ele = 0;
			cont = true;
			while (cont ) {
				y = sc.nextInt();
				if (y == 0) {
					cont = false;
				} else  {
					suma = suma + y;
					if (suma <= x ) {
						ele++;
					}		
				}
			}
			
			System.out.println(ele);
			
			
		}
		
	}

}
