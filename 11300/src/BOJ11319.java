import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11319 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		
		for(int i=0; i < S; i++) {
			int consonant = 0;
			int vowel = 0;
			
			String input = br.readLine().replaceAll("\\s", ""); //문자 사이 공백 모두 제거
			
			for(int j=0; j < input.length(); j++) {
				if(input.charAt(j) == 'A' || input.charAt(j) == 'a' || input.charAt(j) == 'E' || input.charAt(j) == 'e' || input.charAt(j) == 'I' || input.charAt(j) == 'i' || input.charAt(j) == 'O' || input.charAt(j) == 'o' || input.charAt(j) == 'U' || input.charAt(j) == 'u') {
					vowel++;
				} else {
					consonant++;
				}
			}
			System.out.printf("%d %d\n", consonant, vowel);
		}
		br.close();
	}
}
