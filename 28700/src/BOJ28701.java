import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ28701 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int sumA = 0;
		int sumB = 0;
		for(int i=0; i <= N; i++) {
			sumA += i;
			sumB += (int) Math.pow(i, 3);
		}
		bw.append(sumA + "\n");
		bw.append((int) Math.pow(sumA, 2) + "\n");
		bw.append(sumB + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
