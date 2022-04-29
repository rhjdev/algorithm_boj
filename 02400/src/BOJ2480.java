import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2480 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			int a = 0;
			int b = 0;
			int c = 0;
			while(st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());
			}
			
			int same = 0;
			int count = 0;
			int max = 0;
			if(a == b && b == c && c == a) {
				same = a;
				count = 3;
			} else if(a == b || b == c) {
				same = b;
				count = 2;
			} else if(c == a) {
				same = c;
				count = 2;
			} else {
				max = Math.max(a, Math.max(b, c));
			}
			
			int prize = 0;
			switch(count) {
				case 2: prize = 1000 + (same * 100); break;
				case 3: prize = 10000 + (same * 1000); break;
				default: prize = max * 100; break;
			}
			
			bw.write(String.valueOf(prize));
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
