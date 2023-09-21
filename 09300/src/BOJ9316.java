import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9316 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i <= N; i++) {
			bw.append("Hello World, Judge " + i + "!");
			if(i < N) bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
