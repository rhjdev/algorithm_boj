import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10988 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean isPalindrome = true; //팰린드롬(palindrome) : 회문. 거꾸로 읽어도 제대로 읽은 것과 같은 문장/낱말/숫자/문자열.
		int lastIndex = input.length()-1; //뒤에서부터 탐색하기 위한 index
		for(int i=0; i < input.length(); i++) {
			if(input.charAt(i) != input.charAt(lastIndex)) {
				isPalindrome = false;
				break;
			} else {
				lastIndex--;
				continue;
			}
		}
		br.close();
		System.out.printf("%d", isPalindrome == true ? 1 : 0);
	}
}
