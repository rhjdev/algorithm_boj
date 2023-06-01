import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BOJ2338 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		bw.append(A.add(B) + "\n");
		bw.append(A.subtract(B) + "\n");
		bw.append(A.multiply(B) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
