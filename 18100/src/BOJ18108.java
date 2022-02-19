import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ18108 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int y = Integer.parseInt(br.readLine());
			System.out.println(y - 543);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
