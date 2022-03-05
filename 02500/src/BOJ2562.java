import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int[] arr = new int[9];
			for(int i=0; i < 9; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
						
			int max = 0;
			int index = 0;
			int indexOf = 0;
			
			for(int result : arr) {
				indexOf++;
				if(result > max) {
					max = result;
					index = indexOf;
				}
			}
			System.out.println(max);
			System.out.println(index);
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
