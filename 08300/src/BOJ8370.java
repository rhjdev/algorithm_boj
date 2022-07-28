import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8370 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		br.close();
		
		int[] num = new int[input.length];
		int result = 0;
		for(int i=0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		result = (num[0] * num[1]) + (num[2] * num[3]); //business class seats + economic class seats
		System.out.printf("%d", result);
	}
}
