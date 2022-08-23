import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ12605 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < N; i++) {
			Stack<String> stack = new Stack<>();
			
			String[] input = br.readLine().split(" ");
			for(int j=0; j < input.length; j++) {
				stack.add(input[j]);
			}
			sb.append("Case #" + (i+1) + ": ");
			while(!stack.isEmpty()) {
				sb.append(stack.pop() + " ");
			}
			sb.append("\n");
		}
		br.close();
		System.out.printf("%s", sb);
	}
}
