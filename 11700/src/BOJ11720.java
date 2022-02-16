import java.util.Scanner;

public class BOJ11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		String num = sc.next();
		sc.close();

		int sum = 0;
		
		for(int i=0; i < index; i++) {
			sum += num.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
