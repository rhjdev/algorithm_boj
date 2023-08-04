import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10816 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] cards = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i < cards.length; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cards);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			bw.append((upperBound(cards, num) - lowerBound(cards, num)) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	/*
	 * lower bound : key 이상의 값이 처음으로 나타나는 위치
	 * upper bound : key 초과한 값이 처음으로 나타나는 위치
	 * 
	 * [1, 2, 2, 3, 3, 3, 4, 7]
	 * : key = 3일 때, key <= arr[3]이므로 lower bound = 3
	 * : key = 3일 때, key < arr[6]이므로 upper bound = 6
	 * 
	 */
	static int lowerBound(int[] arr, int key) {
		int le = 0;
		int re = arr.length;
		do {
			int ct = (le + re) / 2;
			if(arr[ct] >= key) {
				re = ct;
			} else {
				le = ct + 1;
			}
		} while(le < re);
		return le;
	}
	
	static int upperBound(int[] arr, int key) {
		int le = 0;
		int re = arr.length;
		do {
			int ct = (le + re) / 2;
			if(arr[ct] > key) {
				re = ct;
			} else {
				le = ct + 1;
			}
		} while(le < re);
		return re;
	}
}
