import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i < T; i++) {
			System.out.printf("%s\n", isVPS(br.readLine()));
		}
	}
	
	/* 올바른 괄호 문자열(VPS, Valid Parenthesis String) */
	static String isVPS(String input) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '(') { //여는괄호가 들어오면 추가
				stack.add(ch);
			} else if(stack.isEmpty()) { //반면 닫는괄호가 먼저 자리하거든 결과 확정
				return "NO";
			} else { //괄호 한 쌍이 완성되면 스택에서 꺼내 제거
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) { //입력된 괄호가 모두 짝을 이뤄 제거되었다면 VPS
			return "YES";
		} else {
			return "NO";
		}
	}
}
