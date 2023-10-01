import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10769 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		int countHappy = 0;
		int countSad = 0;
		for(int i=0; i < input.length; i++) {
			if(input[i] == ':') {
				if(input[i+1] == '-') {
					if(input[i+2] == ')') countHappy++;
					else if(input[i+2] == '(') countSad++;
				}
			}
		}
		if(countHappy == 0 && countSad == 0) {
			bw.append("none");
		} else if(countHappy == countSad) {
			bw.append("unsure");
		} else if(countHappy > countSad) {
			bw.append("happy");
		} else {
			bw.append("sad");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
