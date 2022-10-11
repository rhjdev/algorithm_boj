import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ14916 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[100001];
		Arrays.fill(dp, Integer.MAX_VALUE); //최소 개수를 구하는 문제이기에 정수 최대값으로 배열 일괄 초기화
		dp[2] = dp[5] = 1; //2원, 5원 각 1개
		dp[4] = 2; //2원 * 2개
		for(int i=6; i <= N; i++) { //dp[6]부터 시작
			dp[i] = Math.min(dp[i-2], dp[i-5]) + 1;
		}
		br.close();
		System.out.printf("%d", dp[N] == Integer.MAX_VALUE ? -1 : dp[N]); //dp[1], dp[3] 포함 거슬러 줄 수 없는 금액은 -1로 표기
	}
}
