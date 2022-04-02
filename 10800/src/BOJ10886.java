import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10886 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			int input = 0;
			int cute = 0;
			int not = 0;
			for(int i=0; i < n; i++) {
				input = Integer.parseInt(br.readLine());
				if(input == 1) {
					cute++;
				} else {
					not++;
				}
			}
			
			if(cute > not) {
				bw.append("Junhee is cute!");
			} else {
				bw.append("Junhee is not cute!");
			}
			bw.flush();
			bw.close();
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
