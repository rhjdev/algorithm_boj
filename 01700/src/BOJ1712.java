import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1712 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); //고정비
		int B = Integer.parseInt(st.nextToken()); //가변비
		int C = Integer.parseInt(st.nextToken()); //상품가
		if(B >= C) {
			bw.append("-1");
		} else {
			bw.append((A / (C-B) + 1 + "")); //최초로 이익이 발생하는 판매량 *여기서 1을 더하지 않으면 '총비용=총수익'인 구간을 가리킴*
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
