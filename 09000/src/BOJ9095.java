import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9095 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[11]; //N은 양수이며 11보다 작음
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		/*
		 * dp[1] = 1 (1)
		 * dp[2] = 1+1, 2 (2)
		 * dp[3] = 1+1+1, 1+2, 2+1, 3 (4)
		 * dp[4] = 1+1+1+1, 1+1+2, 1+2+1, 1+3, 2+1+1, 2+2, 3+1 (7)
		 * => 7 = 4+2+1
		 * dp[5] = 1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+1+3, 1+2+1+1, 1+2+2, 1+3+1, 2+1+1+1, 2+1+2, 2+2+1, 2+3, 3+1+1, 3+2 (13)
		 * => 13 = 7+4+2
		 */
		
		for(int i=4; i < 11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		for(int i=0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.printf("%d\n", dp[N]);
		}
		br.close();
	}
}
