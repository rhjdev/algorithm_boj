import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10808 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s = br.readLine();
			
			char[] carr = s.toCharArray();
			int[] count = new int[26];
			
			for(char ch : carr) {
				int index = ch - 'a';
				count[index]++;
			}
			
			for(int result : count) {
				System.out.print(result + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
