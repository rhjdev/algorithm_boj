import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1021 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //size of deque
		int M = Integer.parseInt(st.nextToken()); //times to draw out
		
		LinkedList<Integer> deque = new LinkedList<>();
		for(int i=1; i <= N; i++) {
			deque.offer(i);
		}
		/*
		 * Deque = {1,2,3,4,5,6,7,8,9,10}
		 * numbers = {1,6,3,2,7,9,8,4,10,5}
		 * {1} : (num == deque.peek())이므로 count 0 => remove()
		 * {6} : (idx 4 <= mid)이므로 offerLast(pollFirst) 반복 - 2,3,4,5 끝으로 이동 => count 4 => {6,7,8,9,10,2,3,4,5} => remove()
		 * {3} : (idx 5 > mid)이므로 offerFirst(pollLast) 반복 - 5,4,3 앞으로 이동 => count 7 {3,4,5,7,8,9,10,2} => remove()
		 * {2} : (idx 6 > mid)이므로 offerFirst(pollLast) 1회 - 2 앞으로 이동 => count 8 {2,4,5,7,8,9,10} => remove()
		 * {7} : (idx 2 <= mid)이므로 offerLast(pollFirst) 반복 - 4,5 끝으로 이동 => count 10 {7,8,9,10,4,5} => remove()
		 * {9} : (idx 1 <= mid)이므로 offerLast(pollFirst) 1회 - 8 끝으로 이동 => count 11 {9,10,4,5,8} => remove()
		 * {8} : (idx 3 > mid)이므로 offerFirst(pollLast) 1회 - 8 앞으로 이동 => count 12 {8,10,4,5} => remove()
		 * {4} : (idx 1 <= mid)이므로 offerLast(pollFirst) 1회 - 10 끝으로 이동 => count 13 {4,5,10} => remove()
		 * {10} : (idx 1 <= mid)이므로 offerLast(pollLast) 1회 - 5 끝으로 이동 => count 14 {10,5} => remove()
		 * {5} : (num == deque.peek())이므로 count 14 => remove()
		 */
		st = new StringTokenizer(br.readLine());
		int count = 0;
		while(M-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			int idx = deque.indexOf(num); //java.util.LinkedList.indexOf()
			int mid = deque.size() / 2;
			//연산2. 왼쪽으로 한 칸 이동시킨다.
			if(idx <= mid) {
				while(num != deque.peek()) {
					deque.offerLast(deque.pollFirst());
					count++;
				}
			//연산3. 오른쪽으로 한 칸 이동시킨다.
			} else {
				while(num != deque.peek()) {
					deque.offerFirst(deque.pollLast());
					count++;
				}
			}
			//연산1. 첫 번째 원소를 뽑아낸다.
			deque.remove(); //equivalent to pollFirst()
		}
		bw.append(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
