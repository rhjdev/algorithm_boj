import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10250 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			String[] input = br.readLine().split(" ");
			int H = Integer.parseInt(input[0]); //호텔의 층 수
			int W = Integer.parseInt(input[1]); //각 층의 방 수
			int N = Integer.parseInt(input[2]); //N번째 손님
			if(N % H == 0) {
				System.out.printf("%d\n", (H * 100) + (N / H));
			} else {
				System.out.printf("%d\n", (N % H * 100) + (N / H + 1));
			}
		}
		br.close();
	}
}
