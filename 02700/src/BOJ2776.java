import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2776 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[] numbers = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i < numbers.length; i++) {
				numbers[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(numbers);
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i=0; i < M; i++) {
				if(binarySearch(numbers, Integer.parseInt(st.nextToken())) >= 0) {
					bw.append(1 + "\n");
				} else {
					bw.append(0 + "\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int binarySearch(int[] arr, int key) {
		int le = 0;
		int re = arr.length - 1;
		do {
			int ct = (le + re) / 2;
			if(arr[ct] == key) {
				return ct;
			} else if(arr[ct] < key) {
				le = ct + 1;
			} else {
				re = ct - 1;
			}
		} while(le <= re);
		return -1;
	}
}
