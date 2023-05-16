import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1316 {

	static int count = 0;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		for(int i=0; i < N; i++) {
			words[i] = br.readLine();
			checker(words[i]);
		}
		br.close();
		System.out.printf("%d", count);
	}
	
	static void checker(String str) {
		boolean[] alphabet = new boolean[26]; //알파벳별 사용 여부
		boolean check = true;
		for(int i=0; i < str.length(); i++) {
			int curr = str.charAt(i) - 'a';
			if(alphabet[curr]) {
				if(str.charAt(i) != str.charAt(i-1)) { //중복 글자가 직전 값과 연속하지 않은 경우 '그룹 단어'가 아님
					check = false;
					break;
				}
			} else {
				alphabet[curr] = true;
			}
		}
		if(check) count++; //'그룹 단어'에 한하여 count 증가
	}
}
