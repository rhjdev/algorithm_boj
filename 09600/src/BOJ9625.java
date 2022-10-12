import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9625 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int[][] dp = new int[46][2];
		dp[0][0] = 1; dp[0][1] = 0;
		dp[1][0] = 0; dp[1][1] = 1;
		/*
		 * 0: A (1, 0)
		 * 1: B (0, 1)
		 * 2: BA (1, 1)
		 * 3: BAB (1, 2)
		 * 4: BABBA (2, 3) 직전 회차의 B의 개수 => A의 개수
		 * 5: BABBABAB (3, 5) 직전 회차의 A+B => B의 개수
		 */
		for(int i=2; i <= K; i++) {
			dp[i][0] = dp[i-1][1];
			dp[i][1] = dp[i-1][0] + dp[i-1][1];
		}
		br.close();
		System.out.printf("%d %d\n", dp[K][0], dp[K][1]);
		/*
		String[] dp = new String[46];
		dp[0] = "A";
		dp[1] = "B";
		dp[2] = "BA";
		for(int i=3; i <= K; i++) {
			String str = "";
			for(int j=0; j < dp[i-1].length(); j++) {
				if(dp[i-1].charAt(j) == 'A') {
					str += "B";
				} else if(dp[i-1].charAt(j) == 'B') {
					str += "BA";
				}
			}
			dp[i] = str;
		}
		*/
	}
}
