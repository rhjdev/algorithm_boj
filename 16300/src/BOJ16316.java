import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ16316 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		br.close();
		
		for(int i=0; i < input.length; i++) {
			if(input[i].equals("mumble")) continue;
			
			if(Integer.parseInt(input[i]) == (i+1)) {
				continue;
			} else {
				System.out.printf("%s", "something is fishy");
				return;
			}
		}
		System.out.printf("%s", "makes sense");
	}
}
