import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ15439 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		bw.append(N*(N-1) + ""); //상의 개수 N * (하의 개수 N - 상하의 색상이 같은 경우 1)
		bw.flush();
		bw.close();
		br.close();
	}
}
