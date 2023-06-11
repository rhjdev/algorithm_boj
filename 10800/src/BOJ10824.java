import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10824 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		String AB = input[0].concat(input[1]);
		String CD = input[2].concat(input[3]);
		long sum = Long.parseLong(AB) + Long.parseLong(CD);
		bw.append(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
