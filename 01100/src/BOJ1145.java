import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1145 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			/* 100보다 작거나 같은 서로 다른 자연수 5개 */
			int size = 5;
			int[] num = new int[size];
			
			int min = 100;
			
			for(int i=0; i < num.length; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				
				if(min > num[i]) min = num[i];
			}
			
			/* min : 적어도 3개의 num[i]로 나누어 떨어지는 가장 작은 자연수 */
			int count = 0;
			while(true) {
				for(int i=0; i < num.length; i++) {
					if(min % num[i] == 0) count++;
				}
				
				if(count >= 3) break;
				
				count = 0;
				min++;
			}
			
			bw.write(String.valueOf(min));
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
