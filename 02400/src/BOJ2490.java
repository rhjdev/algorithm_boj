import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2490 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = {"D", "C", "B", "A", "E"};
		StringTokenizer st;
		for(int i=0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			bw.append(arr[sum]);
			if(i < 2) bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
