import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10813 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			/* 총 바구니 갯수 n, 바꿀 횟수 m */
			int n = 0;
			int m = 0;
			while(st.hasMoreTokens()) {
				n = Integer.parseInt(st.nextToken());
				m = Integer.parseInt(st.nextToken());
			}
			
			int[] baskets = new int[n];
			for(int i=0; i < n; i++) {
				baskets[i] = i + 1;
			}
			
			/* i번과 j번 바구니간 공 교환 */
			int i = 0;
			int j = 0;
			int tmp = 0;
			while(m > 0) {
				st = new StringTokenizer(br.readLine());
				i = Integer.parseInt(st.nextToken()) - 1;
				j = Integer.parseInt(st.nextToken()) - 1;
				
				tmp = baskets[i];
				baskets[i] = baskets[j];
				baskets[j] = tmp;
				
				m--;
			}
			
			for(int result : baskets) {
				System.out.print(result + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
