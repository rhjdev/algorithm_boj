import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ7795 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int result = 0;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] A = new int[N];
			int[] B = new int[M];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i < A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i < B.length; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(B);
			
			for(int i=0; i < A.length; i++) {
				result += lowerBound(B, A[i]);
				
			}
			bw.append(result + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	/*
	 * lower bound : key 이상의 값이 처음으로 나타나는 위치
	 * index를 가리키므로 기준 숫자 미만의 개수와 일치
	 * 
	 * A [8, 1, 7, 3, 1]
	 * B [1, 3, 6] *오름차순 정렬 필요
	 * 
	 * 8 => 3
	 * 1 => 0
	 * 7 => 3
	 * 3 => 1
	 * 1 => 0
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
}
