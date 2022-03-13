import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2588 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int first = Integer.parseInt(br.readLine());
			int second = Integer.parseInt(br.readLine());
			
			System.out.println(first * (second%10));
			System.out.println(first * (second%100/10));
			System.out.println(first * (second/100));
			System.out.println(first * second);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
