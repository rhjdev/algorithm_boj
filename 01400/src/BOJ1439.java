import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1439 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		/*
		StringTokenizer countZero = new StringTokenizer(S, "0");
		StringTokenizer countOne = new StringTokenizer(S, "1");
		bw.append(Math.min(countZero.countTokens(), countOne.countTokens()) + "");
		*/
		int countZero = 0;
		int countOne = 0;
		for(int i=0; i < S.length(); i++) {
			if(i == 0) {
				if(S.charAt(i) == '0') countZero++;
				else countOne++;
			} else {
				if(S.charAt(i-1) != S.charAt(i)) { //연속돼 오는 경우 카운팅 제외
					if(S.charAt(i) == '0') countZero++;
					else countOne++;
				}
			}
		}
		bw.append(Math.min(countZero, countOne) + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
