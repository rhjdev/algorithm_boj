import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14686 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[] swifts = new int[N]; int[] semaphores = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i < swifts.length; i++) {
			if(i == 0) {
				swifts[0] = Integer.parseInt(st.nextToken());
			} else {
				swifts[i] = swifts[i-1] + Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i < semaphores.length; i++) {
			if(i == 0) {
				semaphores[0] = Integer.parseInt(st.nextToken());
			} else {
				semaphores[i] = semaphores[i-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		int largestK = 0;
		for(int i=N-1; i >= 0; i--) {
			if(swifts[i] == semaphores[i]) {
				largestK = (i+1); break;
			}
		}
		System.out.printf("%d", largestK);
	}
}
