import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ7567 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		br.close();
		
		int height = 10;
		for(int i=1; i < input.length; i++) {
			if(input[i] == input[i-1]) {
				height += 5;
			} else {
				height += 10;
			}
		}
		System.out.println(height);
	}
}
