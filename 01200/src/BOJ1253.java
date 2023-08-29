import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1253 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		bw.append(String.valueOf(twoPointer(arr)));
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int twoPointer(int[] arr) {
		int count = 0;
		for(int i=0; i < arr.length; i++) {
			int start = 0;
			int end = arr.length - 1;
			int target = arr[i]; //목표하는 sum 결과값
			while(start < end) { //두 포인터가 만나지 않을 때에 한함(두 숫자의 합으로 나타낼 수 없는 상황이기 때문)
				int sum = arr[start] + arr[end];
				//target과 일치하는 경우 포인트들을 한 번 더 점검
				if(sum == target) {
					if(start != i && end != i) { //start, end가 target이 된 i가 아닐 때만 유효
						count++;
						break;
					} else if(start == i) { //두 숫자의 합으로 나타내야 하기에, 현재의 i를 가리키고 있다면 포인터 이동
						start++;
					} else {
						end--;
					}
				//target보다 큰 경우 end 포인트 감소
				} else if(sum > target) {
					end--;
				//target보다 작은 경우 start 포인트 증가
				} else {
					start++;
				}
			}
		}
		return count;
	}
}
