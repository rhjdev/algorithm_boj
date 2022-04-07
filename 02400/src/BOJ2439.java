import java.util.Scanner;

public class BOJ2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n; j++) {
				if(j > (n - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
