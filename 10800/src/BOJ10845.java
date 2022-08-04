import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ10845 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Queue
		 * 선입선출(FIFO, First In First Out) 방식의 자료구조
		 * Queue 인터페이스를 상속 받은 하위 인터페이스들은 Deque, BlockingQueue, TransferQue 등 다양하지만 대부분 LinkedList로 인스턴스 생성
		 * Queue는 인터페이스이기 때문에 그 자체로는 인터페이스 생성이 불가
		 * Queue<String> queue = new Queue<>(); (X)
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int last = 0;
		
		while(N > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			switch(input) {
			case "push" :
				int num = Integer.parseInt(st.nextToken());
				last = num; //queue의 가장 뒤에 있는 정수가 담기도록 요청마다 덮어쓰기
				queue.offer(num); break;
			case "pop" :
				if(!queue.isEmpty()) {
					sb.append(queue.poll()).append("\n"); break; //poll() : removes the head of this queue
				} else {
					sb.append("-1").append("\n"); break;
				}
			case "size" :
				sb.append(queue.size()).append("\n"); break;
			case "empty" :
				if(!queue.isEmpty()) {
					sb.append("0").append("\n"); break;
				} else {
					sb.append("1").append("\n"); break;
				}
			case "front" :
				if(!queue.isEmpty()) {
					sb.append(queue.peek()).append("\n"); break;
				} else {
					sb.append("-1").append("\n"); break;
				}
			case "back" :
				if(!queue.isEmpty()) {
					sb.append(last).append("\n"); break;
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
