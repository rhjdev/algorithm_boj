import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10871 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		try {
			st = new StringTokenizer(br.readLine());
			int n = 0;
			int x = 0;
			while(st.hasMoreTokens()) {
				n = Integer.parseInt(st.nextToken());
				x = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			int[] a = new int[n];
			int index = 0;
			while(st.hasMoreTokens()) {
				a[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			
			for(int i=0; i < a.length; i++) {
				if(a[i] < x) {
					System.out.print(a[i] + " ");
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
