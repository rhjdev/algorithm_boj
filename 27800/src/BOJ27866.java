import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ27866 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine()) - 1; //index 0부터 시작
		bw.append(s.charAt(i));
		bw.flush();
		bw.close();
		br.close();
	}
}
