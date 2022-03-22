import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ11021 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			int i = 1;
			do {
				st = new StringTokenizer(br.readLine());
				
				int a = 0;
				int b = 0;
				while(st.hasMoreTokens()) {
					a = Integer.parseInt(st.nextToken());
					b = Integer.parseInt(st.nextToken());
				}
				sb.append("Case #" + i + ": ").append(a + b).append("\n");
				i++;
				t--;
			} while(t > 0);
			System.out.println(sb);
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
