import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1463 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		/*
		 * 연산1. 1을 빼기
		 * 연산2. X가 2로 나누어 떨어지면 2로 나누기
		 * 연산3. X가 3으로 나누어 떨어지면 3으로 나누기
		 */
		int[] dp = new int[N+1]; //1보다 크거나 같은 N이므로 배열의 크기는 N+1 설정
		dp[1] = 0; //정수 X가 1인 경우는 해당되는 연산 없음 (0)
		if(N >= 2) dp[2] = 1;
		if(N >= 3) dp[3] = 1;
		for(int i=4; i < N+1; i++) {
			/*
			 * dp[10]에 연산2 먼저 적용한 경우 10, 5, 4, 2, 1 (4)
			 * dp[10]에 연산1 먼저 적용한 경우 10, 9, 3, 1 (3)
			 */
			dp[i] = dp[i-1] + 1; //2 또는 3으로 나누어 떨어지지 않는 경우 연산1 적용
			if(i % 3 == 0) dp[i] = Math.min(dp[i/3] + 1, dp[i]); //(연산3, 연산1) 중 최솟값 반환
			if(i % 2 == 0) dp[i] = Math.min(dp[i/2] + 1, dp[i]); //(연산2, 연산1) 중 최솟값 반환
		}
		br.close();
		System.out.printf("%d", dp[N]);
	}
}
