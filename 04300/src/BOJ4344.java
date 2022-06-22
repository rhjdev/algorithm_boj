import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		for(int i=0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] scores = new int[N];
			int sum = 0;
			for(int j=0; j < scores.length; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				sum += scores[j];
			}
			double avg = sum / N;
			int cnt = 0;
			for(int j=0; j < scores.length; j++) {
				if(scores[j] > avg) {
					cnt++;
				}
			}
			double result = ((double)cnt / N) * 100;
			System.out.printf("%.3f%%\n", result);
		}
	}
}
