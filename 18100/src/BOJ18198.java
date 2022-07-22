import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ18198 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		br.close();
		
		int scoreA = 0;
		int scoreB = 0;
		for(int i=0; i < input.length; i++) {
			if(input[i] == 'A') {
				scoreA += input[i+1] - '0';
			} else if(input[i] == 'B') {
				scoreB += input[i+1] - '0';
			} else {
				continue;
			}
		}
		System.out.println(scoreA > scoreB ? "A" : "B");
	}
}
