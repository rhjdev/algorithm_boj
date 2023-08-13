import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ9711 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*
		 * 90번째 피보나치 수는 int형의 범위를 초과 => BigInteger[] 타입으로 지정
		 * dp[2]부터는 바로 앞 두 피보나치 수의 합(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...)
		 */
		BigInteger[] dp = new BigInteger[10001];
		dp[0] = new BigInteger("0");
		dp[1] = new BigInteger("1");
		for(int i=2; i < dp.length; i++) {
			dp[i] = dp[i-1].add(dp[i-2]);
		}
		
		int T = Integer.parseInt(br.readLine());
		int count = 1;
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			BigInteger Q = new BigInteger(st.nextToken());
			bw.append("Case #" + count + ": " + (dp[P].remainder(Q)));
			if(T > 0) bw.append("\n");
			count++;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
