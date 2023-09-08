import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2346 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Deque<int[]> deque = new ArrayDeque<>();
		int[] numbers = new int[N];
		for(int i=0; i < numbers.length; i++) { //array 초기화
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i < N; i++) { //deque 초기화
			deque.offer(new int[] {(i+1), numbers[i]}); //{풍선 고유 index, 풍선에 적힌 번호}
		}
		
		/*
		 * num {3,2,1,-3,-1}
		 * idx [1,2,3,4,5]일 때
		 * {3} : 첫 번째 풍선이므로 remove() 3 [idx 1] -> 양수이므로 오른쪽으로 (3-1)만큼 이동 {-3,-1,2,1}
		 * {2} : remove() -3 [idx 4] -> 음수이므로 왼쪽으로 +3만큼 이동 {-1,2,1}
		 * {1} : remove() -1 [idx 5] -> 음수이므로 왼쪽으로 +1만큼 이동 {1,2}
		 * {-3} : remove() 1 [idx 3] -> 양수이므로 오른쪽으로 (1-1)만큼 이동 {2}
		 * {-1} : 마지막 풍선이므로 remove() 2 [idx 2] -> break;
		 */
		while(!deque.isEmpty()) {
			int idx = deque.peek()[0]; //프론트 풍선 고유 index
			int num = deque.peek()[1]; //프론트 풍선에 적힌 번호
			//첫 번째 풍선 제거
			if(idx == 1) {
				bw.append(deque.remove()[0] + " ");
				//첫 번째 풍선에 적힌 숫자만큼 자리 이동
				if(num > 0) {
					num -= 1;
					while(num-- > 0) {
						deque.offerLast(deque.pollFirst());
					}
				} else {
					while(num++ < 0) {
						deque.offerFirst(deque.pollLast());
					}
				}
				//다음 인덱스로 이동
				continue;
			} else {
				bw.append(deque.remove()[0] + " "); //이전 숫자만큼 자리 이동이 완료된 상태이므로 현재 기준 프론트 제거
				if(deque.size() == 0) break; //remove() 치른 후 더 이상 남은 숫자가 없다면 break;
				//양수인 경우 오른쪽으로(앞으로) 이동
				if(num > 0) {
					num -= 1; //프론트를 제거하면서 이미 한 칸씩 앞당겼기 때문에 -1만큼 덜 이동하도록 설정
					while(num-- > 0) {
						deque.offerLast(deque.pollFirst());
					}
				//음수인 경우 왼쪽으로(끝으로) 이동
				} else {
					while(num++ < 0) {
						deque.offerFirst(deque.pollLast());
					}
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
