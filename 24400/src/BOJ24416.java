import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ24416 {
	
	static int count = 0;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		fibonacciWithRecursion(N);
		sb.append(count).append(" ");
		count = 0; //호출 전 새롭게 초기화
		fibonacciWithDP(N);
		sb.append(count);
		br.close();
		System.out.printf("%s", sb);
	}
	
	public static int fibonacciWithRecursion(int N) {
		if(N == 1 || N == 2) {
			count++;
			return 1;
		} else {
			return (fibonacciWithRecursion(N-1) + fibonacciWithRecursion(N-2));
		}
	}
	
	public static int fibonacciWithDP(int N) {
		int[] dp = new int[N+1];
		dp[1] = dp[2] = 1;
		for(int i=3; i <= N; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			count++;
		}
		return dp[N];
	}
}
