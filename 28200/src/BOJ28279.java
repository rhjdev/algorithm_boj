import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ28279 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		while(N-- > 0) {
			String[] input = br.readLine().split(" ");
			int order = Integer.parseInt(input[0]);
			switch(order) {
				case 1: deque.offerFirst(Integer.parseInt(input[1])); break;
				case 2: deque.offerLast(Integer.parseInt(input[1])); break; //equivalent to offer()
				case 3: case 4: {
					if(deque.isEmpty()) {
						bw.append("-1\n");
					} else {
						if(order == 3) {
							bw.append(deque.pollFirst() + "\n"); //equivalent to poll(), retrieves and removes
						} else if(order == 4) {
							bw.append(deque.pollLast() + "\n"); //retrieves and removes
						}
					}
					break;
				}
				case 5: bw.append(deque.size() + "\n"); break;
				case 6: {
					if(deque.isEmpty()) {
						bw.append("1\n");
					} else {
						bw.append("0\n");
					}
					break;
				}
				case 7: case 8: {
					if(deque.isEmpty()) {
						bw.append("-1\n");
					} else {
						if(order == 7) {
							bw.append(deque.getFirst() + "\n"); //retrieves but not removes
						} else if(order == 8) {
							bw.append(deque.getLast() + "\n"); //retrieves but not removes
						}
					}
					break;
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
