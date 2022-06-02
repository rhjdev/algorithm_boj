import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2525 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());	//현재 시각
			int A = Integer.parseInt(st.nextToken());	//시
			int B = Integer.parseInt(st.nextToken());	//분
			int C = Integer.parseInt(br.readLine());	//소요 시간
			
			B += C;
			
			while(B > 59) {
				A++;
				B -= 60;
			}
			
			while(A > 23) {
				A -= 24;
			}
			
			System.out.printf("%d %d", A, B);
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
