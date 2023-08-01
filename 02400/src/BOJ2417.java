import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2417 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		bw.append(binarySearch(n) + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	static long binarySearch(long key) {
		long le = 0;
		long re = key;
		long result = 0;
		while(le <= re) {
			long ct = (le + re) / 2;
			if(Math.pow(ct, 2) >= key) { //Math.pow(base, exponent) => base^exponent
				result = ct;
				re = ct - 1;
			} else {
				le = ct + 1;
			}
		}
		return result;
	}
}
