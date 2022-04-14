import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10039 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int[] scores = new int[5];
			
			int sum = 0;
			
			for(int i=0; i < scores.length; i++) {
				
				int input = Integer.parseInt(br.readLine());
				if(input > 40) {
					scores[i] = input;
				} else {
					scores[i] = 40;
				}
				sum += scores[i];
			}
			
			int avg = sum / scores.length;
			System.out.println(avg);
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
