import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			int a = 0;
			int b = 0;
			while(st.hasMoreTokens()) {
				a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
				b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
			}
			System.out.println(a > b ? a : b);
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
