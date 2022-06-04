import java.util.Scanner;

public class BOJ5554 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] sec = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		sc.close();
		
		int sum = 0;
		for(int i=0; i < sec.length; i++) {
			sum += sec[i];
		}
		
		int x = sum/60;
		int y = sum%60;
		
		System.out.println(x);
		System.out.println(y);
	}
}
