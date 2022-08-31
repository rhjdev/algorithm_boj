import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ3003 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] piece = {1, 1, 2, 2, 2, 8};
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < input.length; i++) {
			int num = Integer.parseInt(input[i]);
			sb.append(piece[i] - num).append(" ");
		}
		br.close();
		System.out.printf("%s", sb);
	}
}
