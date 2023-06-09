import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ4949 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		while(true) {
			input = br.readLine();
			if(input.equals(".")) break;
			bw.append(checkStack(input) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static String checkStack(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '[') { //여는 소괄호, 대괄호인 경우 top of the stack에 삽입(push)
				stack.push(ch);
			} else if(ch == ')') { //닫는 소괄호가 오면 직전 요소가 여는 소괄호인지 확인
				if(stack.empty() || stack.peek() != '(') { //1. 쌍을 이루지 못하면 결과값 리턴
					return "no";
				} else {
					stack.pop(); //2. 쌍을 이뤘다면 소괄호 () 삭제
				}
			} else if(ch == ']') { //닫는 대괄호가 오면 직전 요소가 여는 대괄호인지 확인
				if(stack.empty() || stack.peek() != '[') { //1. 쌍을 이루지 못하면 결과값 리턴
					return "no";
				} else { //2. 쌍을 이뤘다면 대괄호 [] 삭제
					stack.pop();
				}
			}
		}
		if(stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
