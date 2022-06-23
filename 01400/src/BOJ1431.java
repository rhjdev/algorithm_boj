import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1431 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i < N; i++) {
			arr[i] = br.readLine().toUpperCase();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					int sum1 = 0;
					for(int i=0; i < o1.length(); i++) {
						if(o1.charAt(i) >= '0' && o1.charAt(i) <= '9') {
							sum1 += Integer.parseInt(String.valueOf(o1.charAt(i)));
						}
					}
					int sum2 = 0;
					for(int i=0; i < o2.length(); i++) {
						if(o2.charAt(i) >= '0' && o2.charAt(i) <= '9') {
							sum2 += Integer.parseInt(String.valueOf(o2.charAt(i)));
						}
					}
					if(sum1 == sum2) {
						return o1.compareTo(o2);		//사전순 정렬
					} else {
						return sum1 - sum2;				//합이 작은 것 먼저 정렬
					}
				} else {
					return o1.length() - o2.length();	//길이가 짧은 것 먼저 정렬
				}
			}
		});
		
		for(int i=0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}
}
