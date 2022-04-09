import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1546 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		try {
			/* 시험 과목 개수 n
			 * 원래 점수 scores */
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			double[] scores = new double[n];
			for(int i=0; i < n; i++) {
				scores[i] = Double.parseDouble(st.nextToken());
			}
			
			/* 최고 점수 m */
			double m = 0;
			
			Arrays.sort(scores);
			
			for(double score : scores) {
				m = scores[n - 1];
			}
			
			/* 조작된 평균 점수 avg */
			double sum = 0;
			for(int i=0; i < scores.length; i++) {
				sum += ((scores[i] / m) * 100);
			}
			
			double avg = sum / scores.length;
			System.out.println(avg);
		} catch (NumberFormatException e) {
			e.printStackTrace();
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
