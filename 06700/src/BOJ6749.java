import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ6749 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		bw.append(M + (M-Y) + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
