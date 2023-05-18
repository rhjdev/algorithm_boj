import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2941 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();
		System.out.printf("%d", checker(input));
	}
	
	static int checker(String input) {
		int count = 0;
		for(int i=0; i < input.length(); i++) {
			/*
			 * 0부터 시작하므로 탐색 대상 index는 input.length()-1에 한함
			 * 해당하는 경우 index를 그 다음 글자로 이동
			 * => 런타임에러(StringIndexOutOfBounds) 주의. index에 대한 조건문을 직접 명시해야 함.
			 */
			if(input.charAt(i) == 'c' && i < input.length() - 1) { //'c=' 또는 'c-'
				if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-') i++;
			} else if(input.charAt(i) == 'd' && i < input.length() - 1) { //'dz=' 또는 'd-'
				if(input.charAt(i+1) == '-') i++;
				else if(input.charAt(i+1) == 'z' && i < input.length() - 2) {
					if(input.charAt(i+2) == '=') i+=2;
				}
			} else if((input.charAt(i) == 'l' || input.charAt(i) == 'n') && i < input.length() - 1) { //'lj' 또는 'nj'
				if(input.charAt(i+1) == 'j') i++;
			} else if((input.charAt(i) == 's' || input.charAt(i) == 'z') && i < input.length() - 1) { //'s=' 또는 'z='
				if(input.charAt(i+1) == '=') i++;
			}
			count++;
		}
		return count;
	}
}
