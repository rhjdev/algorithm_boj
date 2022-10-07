import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ5597 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<>();
		for(int i=1; i <= 30; i++) set.add(i);
		
		for(int i=0; i < 28; i++) {
			set.remove(Integer.parseInt(br.readLine()));
		}
		br.close();
		
		for(int num : set) {
			System.out.printf("%d\n", num);
		}
	}
}
