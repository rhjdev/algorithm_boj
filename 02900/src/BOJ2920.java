import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2920 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[8];
		for(int i=0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		boolean asc = true;
		boolean desc = true;
		for(int i=0; i < num.length-1; i++) { //current index와 next index 값을 구분하므로 length-1로 선언
			if(num[i] > num[i+1]) asc = false;
			else if(num[i] < num[i+1]) desc = false;
		}
		if(asc) {
			bw.append("ascending");
		} else if(desc) {
			bw.append("descending");
		} else {
			bw.append("mixed");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
