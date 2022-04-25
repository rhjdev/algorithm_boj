import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		try {
			
			while(true) {
				st = new StringTokenizer(br.readLine());
				int first = Integer.parseInt(st.nextToken());
				int second = Integer.parseInt(st.nextToken());
				
				if(first == 0 && second == 0) break;
				
				if(second % first == 0) {
					System.out.println("factor");
				} else if(first % second == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			}
			
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
