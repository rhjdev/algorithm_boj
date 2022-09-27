import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ18258 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new LinkedList<>(); //double ended queue
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			switch(input) {
			case "push": queue.offer(Integer.parseInt(st.nextToken())); break;
			case "pop":
				if(!queue.isEmpty()) {
					sb.append(queue.pop()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "size": sb.append(queue.size()).append("\n"); break;
			case "empty":
				if(!queue.isEmpty()) {
					sb.append("0").append("\n");
				} else {
					sb.append("1").append("\n");
				}
				break;
			case "front": 
				if(!queue.isEmpty()) {
					sb.append(queue.peek()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "back":
				if(!queue.isEmpty()) {
					sb.append(queue.peekLast()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			}
		}
		br.close();
		System.out.printf("%s", sb);
	}
}
