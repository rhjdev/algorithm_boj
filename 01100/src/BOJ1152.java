import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine()/*.trim()*/;
		sc.close();
		/*
		String[] arr = input.split(" "); //split()은 공백 입력 시 빈 문자열로 인식
		System.out.println(arr.length); //1
		*/
		StringTokenizer st = new StringTokenizer(input);
		System.out.println(st.countTokens());
	}
}
