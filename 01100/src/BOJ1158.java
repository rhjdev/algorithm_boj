import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		br.close();
		System.out.printf("%s", solution(N, K));
	}
	
	/*
	 * 요세푸스 순열(Josephus permutation) - Queue 활용
	 * 1)K-1에 해당하는 노드들을 꺼냄과 동시에 삭제하고(poll) 새롭게 삽입(offer)
	 * 2)맨 앞에 오게 된 K번째 노드를 삭제하며 결과값으로 저장
	 * 3)노드가 모두 제거될 때까지 반복
	 * 
	 * 예. K=3인 경우
	 * 1 2 3 4 5 6 7 [3]
	 * 4 5 6 7 1 2 [6]
	 * 7 1 2 4 5 [2]
	 * 4 5 7 1 [7]
	 * 1 4 5 [5]
	 * 1 4 [1]
	 * [4]
	 */
	static String solution(int N, int K) {
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=1; i <= N; i++) { //1~N
			queue.add(i);
		}
		sb.append("<");
		while(!queue.isEmpty()) { //모두 제거될 때까지 반복
			for(int i=0; i < K-1; i++) {
				queue.offer(queue.poll()); //offer() : generally preferable to add(), which can fail to insert an element only by throwing an exception.
			}
			sb.append(queue.poll()); //K번째에 해당하는 노드 삭제하며 결과값 저장
			if(queue.size() != 0) sb.append(", ");
		}
		sb.append(">");
		return sb.toString();
	}
}
