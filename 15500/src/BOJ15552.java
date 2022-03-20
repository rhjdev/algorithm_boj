import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ15552 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			int t = Integer.parseInt(br.readLine());
			do {
				st = new StringTokenizer(br.readLine());
				int a = 0;
				int b = 0;
				while(st.hasMoreTokens()) {
					a = Integer.parseInt(st.nextToken());
					b = Integer.parseInt(st.nextToken());
					bw.write((a + b) + "\n");
				}
				t--;
			} while(t > 0);
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
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
