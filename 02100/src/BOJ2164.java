import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i <= N; i++) { queue.offer(i); }
		
		for(int i=queue.size(); i > 1; i--) { //한 장 남을 때까지 반복
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.printf("%d", queue.poll());
	}
}
