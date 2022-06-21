import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ8958 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i < N; i++) {
			String str = br.readLine();
			int score = 0;
			int sum = 0;
			
			for(int j=0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					score++;
					sum += score;
				} else {
					score = 0;
				}
			}
			bw.write(String.valueOf(sum) + "\n");
		}
		br.close(); bw.flush(); bw.close();
	}
}
