import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class BOJ2161 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i <= N; i++) { //1~N
			queue.offer(i);
		}
		while(!queue.isEmpty()) {
			bw.append(queue.remove() + " "); //discard first card
			if(queue.size() == 0) break;
			queue.offer(queue.poll()); //move first one to last
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
