import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ13752 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			for(int j=0; j < k; j++) {
				bw.append("=");
			}
			if(i != n-1) bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
