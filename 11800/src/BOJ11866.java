import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11866 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		br.close();
		
		/*
		 * (N, K)-요세푸스 순열
		 * 
		 * (7, 3)-요세푸스 순열
		 * {1, 2, 3, 4, 5, 6, 7}
		 * => {2, 3, 4, 5, 6, 7, 1}
		 * => {3, 4, 5, 6, 7, 1, 2}
		 * => 3 출력
		 * ...
		 */
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i <= N; i++) { queue.add(i); } //1~N명의 사람들
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(queue.size() > 1) { //마지막 값만을 남겨둘 때까지 순차적으로 제거
			for(int j=0; j < K-1; j++) { //제거 대상인 K번째를 구하기 위해 그보다 앞에 있는 값들(K-1)은 자리에서 지우고 Queue에 새롭게 삽입
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()).append(", "); //선두로 옮겨온 K번째 대상을 출력값으로 저장
		}
		sb.append(queue.poll()).append(">");
		System.out.printf("%s", sb);
	}
}
