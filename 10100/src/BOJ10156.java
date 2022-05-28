import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10156 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken()); //개당 가격
			int N = Integer.parseInt(st.nextToken()); //구매하려는 개수
			int M = Integer.parseInt(st.nextToken()); //보유 금액
			
			int result = 0;
			if(!(M >= K*N)) {
				result = K*N-M;
			}
			
			bw.write(String.valueOf(result));
			bw.flush();
			bw.close();
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
