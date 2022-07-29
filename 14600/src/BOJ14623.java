import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ14623 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long B1 = Long.parseLong(br.readLine(), 2); //radix를 2로 지정하여 2진수로 읽음
		Long B2 = Long.parseLong(br.readLine(), 2);
		String result = Long.toBinaryString(B1 * B2); //2진수로 변환
		br.close();
		System.out.printf("%s", result);
	}
}
