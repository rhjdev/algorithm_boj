import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ10826 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[10001]; //0 <= n < 10,000
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		for(int i=2; i < n+1; i++) {
			dp[i] = dp[i-1].add(dp[i-2]); //BigInteger 클래스에 정의된 메소드 통해 연산(add, subtract, multiply, divide 등)
		}
		br.close();
		System.out.printf("%d", dp[n]);
	}
}
