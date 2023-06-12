import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2869 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		bw.append(calculate(A,B,V) + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int calculate(int up, int down, int height) {
		int days = (height - down) / (up - down);
		if((height - down) % (up - down) != 0) days++;
		return days;
	}
}
