import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2576 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i < 7; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num % 2 == 1) {
				sum += num;
				min = num < min ? num : min;
			}
			
		}
		if(sum == 0) {
			bw.append("-1");
		} else {
			bw.append(sum + "\n" + min);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
