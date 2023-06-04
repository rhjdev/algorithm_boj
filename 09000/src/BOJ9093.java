import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ9093 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				StringBuffer sb = new StringBuffer(st.nextToken());
				String reversed = sb.reverse().toString();
				bw.append(reversed);
				if(st.countTokens() > 0) bw.append(" ");
			}
			if(T > 0) bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
