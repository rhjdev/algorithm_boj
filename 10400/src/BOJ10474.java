import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10474 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken()); //분자
			int D = Integer.parseInt(st.nextToken()); //분모
			
			if(N == 0 && D == 0) {
				return;
			}
			
			int W = (N / D); //정수
			N -= (W * D);
			
			System.out.printf("%d %d / %d\n", W, N, D);
		}
	}
}
