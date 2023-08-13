import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1032 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		char[] pattern = br.readLine().toCharArray(); //첫 번째 입력값 기준으로 패턴 정의
		for(int i=0; i < N-1; i++) { //첫 번째 입력값을 제외한 N-1 동안 입력 받음
			char[] input = br.readLine().toCharArray();
			for(int j=0; j < pattern.length; j++) { //패턴의 철자 수만큼 반복
				if(pattern[j] != input[j]) pattern[j] = '?';
			}
		}
		for(char ch : pattern) bw.append(ch);
		bw.flush();
		bw.close();
		br.close();
	}
}
