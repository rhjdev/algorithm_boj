import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10610 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		StringBuilder sb = new StringBuilder();
		/* 조건1. 30의 배수는 0을 포함한다 */
		if(N.indexOf("0") == -1) {
			sb.append("-1");
		/* 조건2. 30의 배수는 각 자리의 숫자를 더했을 때 3으로 나누어 떨어진다 */
		} else {
			int sum = 0;
			for(int i=0; i < N.length(); i++) {
				int num = Integer.parseInt(String.valueOf(N.charAt(i)));
				sum += num;
			}
			if(sum % 3 != 0) {
				sb.append("-1");
			} else {
				char[] arr = N.toCharArray();
				Arrays.sort(arr);
				sb.append(new StringBuilder(String.valueOf(arr)).reverse());
			}
		}
		System.out.printf("%s", sb);
	}
}
