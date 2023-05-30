import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2442 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i <= N; i++) {
			for(int j=N; j > i; j--) {
				bw.append(" ");
			}
			for(int j=0; j < 2*i-1; j++) {
				bw.append("*");
			}
			bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
