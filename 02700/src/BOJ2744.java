import java.util.Scanner;

public class BOJ2744 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		String result = "";
		char code;
		for(int i=0; i < word.length(); i++) {
			code = word.charAt(i);
			if(65 <= code && code <= 90) {
				result += String.valueOf(code).toLowerCase();
			} else if(97 <= code && code <= 122) {
				result += String.valueOf(code).toUpperCase();
			} else {
				result += (char)code;
			}
		}
		System.out.println(result);
	}
}
