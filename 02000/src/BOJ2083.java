import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2083 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			if(name.equals("#") && age == 0 && weight == 0) break;
			bw.append(name);
			if(age > 17 || weight >= 80) {
				bw.append(" Senior\n");
			} else {
				bw.append(" Junior\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
