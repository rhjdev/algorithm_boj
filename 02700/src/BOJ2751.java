import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2751 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i < n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			
			Collections.sort(list);
			
			for(int result : list) {
				sb.append(result).append('\n');
			}
			System.out.println(sb);
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
