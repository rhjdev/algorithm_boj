import java.util.Scanner;

public class BOJ13985 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		int firstNum = input.charAt(0) - '0';
		int secondNum = input.charAt(4) - '0';
		int result = input.charAt(8) - '0';
		
		if(result == (firstNum + secondNum)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
