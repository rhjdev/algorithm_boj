import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1475 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		int[] count = new int[10];
		for(int i=0; i < N.length(); i++) {
			int num = Character.getNumericValue(N.charAt(i));
			if(num == 6) {
				count[9]++; //6,9 모두 우선 9로 카운팅
			} else {
				count[num]++;
			}
		}
		int nine = count[9]/2; //한 세트에 6,9 두 개가 있으므로 2로 나눠 덮어쓰기
		if(count[9]%2 == 1) nine++; //mod 값이 존재하면 한 세트 더 필요
		count[9] = nine;
		
		int max = 0;
		for(int i=0; i < count.length; i++) {
			max = Math.max(max, count[i]);
		}
		bw.append(max + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
