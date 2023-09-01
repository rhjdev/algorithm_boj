import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ10866 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			String[] order = br.readLine().split(" ");
			switch(order[0]) {
				case "push_front": deque.offerFirst(Integer.parseInt(order[1])); break;
				case "push_back": deque.offerLast(Integer.parseInt(order[1])); break;
				case "pop_front": case "pop_back": {
					if(deque.isEmpty()) {
						bw.append("-1\n");
					} else {
						if(order[0].contains("front")) {
							bw.append(deque.pop() + "\n"); //removes and returns
						} else if(order[0].contains("back")) {
							bw.append(deque.pollLast() + "\n"); //retrieves and removes
						}
					}
					break;
				}
				case "size": bw.append(deque.size() + "\n"); break;
				case "empty": {
					if(deque.isEmpty()) {
						bw.append("1\n");
					} else {
						bw.append("0\n");
					}
					break;
				}
				case "front": case "back": {
					if(deque.isEmpty()) {
						bw.append("-1\n");
					} else {
						if(order[0].contains("front")) {
							bw.append(deque.getFirst() + "\n");
						} else if(order[0].contains("back")) {
							bw.append(deque.getLast() + "\n");
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
