import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11399 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			String p = br.readLine();
			StringTokenizer st = new StringTokenizer(p);
			
			int[] minutes = new int[n];
			int index = 0;
			while(st.hasMoreTokens()) {
				minutes[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			
			int sum = 0;
			int total = 0;
			for(int i=0; i < minutes.length; i++) {
				Arrays.sort(minutes);
				sum += minutes[i];
				total += sum;
			}
			System.out.println(total);
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
