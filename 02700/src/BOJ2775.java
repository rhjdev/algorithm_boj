import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2775 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int k = Integer.parseInt(br.readLine()); //k층
			int n = Integer.parseInt(br.readLine()); //n호
			/*
			 * [k][n] = [k-1][n] + [k][n-1]
			 * 0층 : 1, 2, 3...
			 * 1층 : 1, 3, 6...
			 * 2층 : 1, 4, 10...
			 * 3층 : 1, 5, 15...
			 */
			int[][] dp = new int[k+1][n+1];
			for(int i=0; i < k+1; i++) { //0층부터 시작
				for(int j=1; j <= n; j++) { //1호부터 존재
					if(i > 0) {
						dp[i][j] = dp[i-1][j] + dp[i][j-1];
					} else {
						dp[i][j] = j;
					}
				}
			}
			bw.append(dp[k][n] + "\n");
		}
		bw.flush();
		br.close();
	}
}
