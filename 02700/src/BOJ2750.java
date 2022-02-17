import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		int[] num = new int[index];
		for(int i=0; i < index; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		
		for(int result : num) {
			System.out.println(result);
		}
	}
}
