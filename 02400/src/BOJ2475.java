import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2475 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			int[] num = new int[5];
			int sum = 0;
			
			for(int i=0; i < num.length; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				
				num[i] *= num[i];	//제곱
				sum += num[i];		//합계
			}
			
			int ver = sum % 10;		//검증수
			bw.write(String.valueOf(ver));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
