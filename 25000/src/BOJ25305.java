import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ25305 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		
		arr = br.readLine().split(" ");
		Integer[] scores = new Integer[N]; //reverseOrder() 사용 위해 Integer 타입으로 선언
		for(int i=0; i < N; i++) {
			scores[i] = Integer.parseInt(arr[i]);
		}
		br.close();
		Arrays.sort(scores, Comparator.reverseOrder()); //내림차순 정렬 Collections.reverseOrder()도 가능
		System.out.printf("%d", scores[K-1]);
	}
}
