import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ17219 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, String> password = new HashMap<>(); //address, password
		for(int i=0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			password.put(st.nextToken(), st.nextToken());
		}
		for(int i=0; i < M; i++) {
			bw.append(password.get(br.readLine())).append("\n");
		}
		bw.flush(); bw.close(); br.close();
	}
}
