import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ4641 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input = br.readLine().split(" ");
			
			if(input.length == 1) {
				break;
			}
			
			int[] arr = new int[input.length-1];
			int count = 0;
			for(int i=0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(input[i]);
			}
			
			Arrays.sort(arr);
			
			for(int i=0; i < arr.length-1; i++) {
				for(int j=i+1; j < arr.length; j++) {
					if((arr[i] * 2) == arr[j]) {
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}
