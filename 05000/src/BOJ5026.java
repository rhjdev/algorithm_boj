import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5026 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i < N; i++) {
			String input = br.readLine();
			if(input.contains("+")) {
				StringTokenizer st = new StringTokenizer(input, "+");
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
				bw.append(String.valueOf(L+R) + "\n");
			} else if(input.equals("P=NP")) {
				bw.append("skipped\n");
			}
		}
		bw.flush(); bw.close(); br.close();
	}
}
