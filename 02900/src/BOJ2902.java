import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2902 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("-");
		br.close();
		
		String result = "";
		for(int i=0; i < input.length; i++) result += input[i].charAt(0);
		System.out.println(result);
	}
}
