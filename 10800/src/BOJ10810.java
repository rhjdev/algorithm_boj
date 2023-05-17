import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10810 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N];
		for(int i=0; i < basket.length; i++) { //공이 들어있지 않은 바구니 기본값 0
			basket[i] = 0;
		}
		while(M > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			int k = Integer.parseInt(st.nextToken());
			for(int x=i; x <= j; x++) { //각 바구니마다 새 값이 들어오면 덮어쓰기
				basket[x] = k;
			}
			M--;
		}
		br.close();
		for(int i=0; i < basket.length; i++) {
			sb.append(basket[i] + " ");
		}
		System.out.printf("%s", sb);
	}
}
