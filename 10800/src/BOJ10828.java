import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		while(N > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			
			switch(input) {
			case "push" :
				stack.push(Integer.parseInt(st.nextToken())); break;
			case "pop" :
				if(!stack.isEmpty()) {
					sb.append(stack.pop()).append("\n"); break;
				} else {
					sb.append("-1").append("\n"); break;
				}
			case "size" :
				sb.append(stack.size()).append("\n"); break;
			case "empty" :
				if(!stack.isEmpty()) {
					sb.append("0").append("\n"); break;
				} else {
					sb.append("1").append("\n"); break;
				}
			case "top" :
				if(!stack.isEmpty()) {
					sb.append(stack.peek()).append("\n"); break; //peek() : without removing it from the stack
				} else {
					sb.append("-1").append("\n"); break;
				}
			}
			N--;
		}
		br.close();
		System.out.printf("%s", sb);
	}
}
