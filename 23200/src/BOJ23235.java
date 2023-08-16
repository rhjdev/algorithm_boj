import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ23235 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int count = 1;
		boolean isInAscendingOrder = false;
		while(true) {
			String input = br.readLine();
			if(input.equals("0")) break;
			
			st = new StringTokenizer(input);
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			arr[0] = Integer.parseInt(st.nextToken());
			for(int i=1; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i] >= arr[i-1]) isInAscendingOrder = true;
			}
			if(isInAscendingOrder) bw.append("Case " + count + ": Sorting... done!\n");
			count++;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
