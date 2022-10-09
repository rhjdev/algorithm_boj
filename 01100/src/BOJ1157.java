import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1157 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		int[] count = new int[26];
		for(int i=0; i < input.length(); i++) {
			int num = input.charAt(i) - 'A';
			count[num]++;
		}
		int max = 0;
		char result = '?';
		for(int i=0; i < count.length; i++) {
			if(max < count[i]) {
				max = count[i];
				result = (char) (i+'A');
			} else if(max == count[i]) {
				result = '?';
			}
		}
		br.close();
		System.out.printf("%s", result);
	}
}
