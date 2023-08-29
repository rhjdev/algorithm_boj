import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1620 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //number of pokemons
		int M = Integer.parseInt(st.nextToken()); //number of problems to solve
		Map<String, Integer> nameMap = new HashMap<>();
		String[] nameArr = new String[N+1];
		
		for(int i=1; i <= N; i++) {
			nameArr[i] = br.readLine();
			nameMap.put(nameArr[i], i);
		}
		for(int i=0; i < M; i++) {
			String input = br.readLine();
			if(isNumeric(input)) { //입력값이 숫자인 경우
				bw.append(nameArr[Integer.parseInt(input)] + "\n"); //해당 번호 기준으로 array에서 이름 호출
			} else {
				bw.append(nameMap.get(input) + "\n"); //key값인 이름 통해 map에서 value 호출
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
}
