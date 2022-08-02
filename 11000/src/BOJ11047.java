import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11047 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken()); //합계
		int[] coins = new int[N];
		for(int i=0; i < N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for(int i=coins.length-1; i >= 0; i--) { //상대 가치가 큰 coins의 마지막 index부터 적용
			if(coins[i] <= K) { //단, 동전 단위 coins[i]가 현재 금액 K원보다 작거나 같은 경우에 한함
				count += (K / coins[i]);
				K %= coins[i];
			}
		}
		br.close();
		System.out.printf("%d", count);
	}
}
