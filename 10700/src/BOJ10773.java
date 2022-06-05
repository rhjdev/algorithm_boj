import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i < K; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				stack.pop();
			} else {
				stack.add(input); //push() 메소드로 대체 가능
			}
		}
		
		br.close();
		
		int sum = 0;
		for(int num : stack) {
			sum += num;
		}
		
		System.out.println(sum);
	}
}
