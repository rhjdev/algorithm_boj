import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1075 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		int num = (N / 100) * 100; //마지막 두 자리 절삭
		while(true) {
			if(num % F == 0) {
				System.out.println(String.valueOf(num).substring(String.valueOf(num).length()-2));
				break;
			} else {
				num++;
			}
		}
		br.close();
	}
}
