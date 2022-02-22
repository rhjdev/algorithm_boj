import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean check;
		
		int count = 0;
		
		try {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				
				check = true;
				if(num == 1) {
					continue;
				}
				
				for(int i=2; i < num; i++) {
					if(num % i == 0) {
						check = false;
						break;
					}
				}
				
				if(check) {
					count++;
				}
			}
			System.out.println(count);
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
