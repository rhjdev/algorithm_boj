import java.util.Scanner;

public class BOJ10872 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int result = factorial(N);
		System.out.println(result);
		
	}
	
	public static int factorial(int N) {
		
		/* 0! == 1 */
		if(N == 0) return 1;
		return N * factorial(N - 1);
		
	}

}
