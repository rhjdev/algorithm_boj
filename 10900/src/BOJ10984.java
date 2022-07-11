import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10984 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); //학기 수
		
		while(T > 0) {
			int N = Integer.parseInt(br.readLine()); //과목 수
			int sumC = 0;
			double sumG = 0.0;
			for(int i=0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int C = Integer.parseInt(st.nextToken()); //학점
				double G = Double.parseDouble(st.nextToken()); //성적
				sumC += C;
				sumG += C * G;
			}
			sb.append(sumC + " " + Math.round(10*sumG/sumC)/10.0 + "\n");
			T--;
		}
		System.out.println(sb);
		br.close();
	}
}
