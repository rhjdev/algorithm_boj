import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st= new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[5];
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			int[] result = new int[5];
			result[i] = arr[i] - (L*P);
			System.out.print(result[i] + " ");
		}
		br.close();
	}
}
