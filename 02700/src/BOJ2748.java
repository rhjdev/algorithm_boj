import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2748 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		/*
		 * 재귀함수 대신 dp 사용 이유
		 * : 메모이제이션(memoization). 이전에 계산된 값을 저장해 동일한 계산의 반복 수행 제거하므로 실행 속도면에서 보다 효율적임.
		 */
		long[] dp = new long[n+1]; //90번째 피보나치 수는 int형의 범위를 초과
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2; i < n+1; i++) { //dp[2]부터는 바로 앞 두 피보나치 수의 합(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...)
			dp[i] = dp[i-1] + dp[i-2];
		}
		br.close();
		System.out.printf("%d", dp[n]);
	}
}
