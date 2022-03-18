import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1292 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			int start = 0;
			int end = 0;
			while(st.hasMoreTokens()) {
				start = Integer.parseInt(st.nextToken());
				end = Integer.parseInt(st.nextToken());
			}
			
			List<Integer> arrList = new ArrayList<>();
			
			int count = 0;
			int num = 1;
			for(int i=0; i < end; i++) {
				arrList.add(num);
				count++;
				
				if(num == count) {
					num++;
					count = 0;
				}
			}
			
			int sum = 0;
			for(int i = start - 1; i <= end - 1; i++) {
				sum += arrList.get(i);
			}
			System.out.println(sum);
		} catch (NumberFormatException e) {
			e.printStackTrace();
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
