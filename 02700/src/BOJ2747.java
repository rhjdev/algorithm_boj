import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2747 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2; i < n+1; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		br.close();
		System.out.printf("%d", dp[n]);
	}
}
