import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2953 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int winner = 0;
		int max = Integer.MIN_VALUE;
		for(int i=1; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			if(sum > max) {
				max = sum;
				winner = i;
			}
		}
		bw.append(winner + " " + max);
		bw.flush();
		bw.close();
		br.close();
	}
}
