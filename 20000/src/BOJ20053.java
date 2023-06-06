import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ20053 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens() && (N-- > 0)) {
				int num = Integer.parseInt(st.nextToken());
				min = num < min ? num : min;
				max = num > max ? num : max;
			}
			bw.append(min + " " + max);
			if(T > 0) bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
