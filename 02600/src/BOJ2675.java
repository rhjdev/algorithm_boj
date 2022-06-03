import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken()); 	//반복 횟수
			String S = st.nextToken(); 					//반복될 문자열
			
			for(int j=0; j < S.length(); j++) {
				for(int k=0; k < R; k++) {
					bw.append(String.valueOf(S.charAt(j)));
				}
			}
			bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
