import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ4447 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			String name = br.readLine();
			int countG = 0;
			int countB = 0;
			for(int i=0; i < name.length(); i++) {
				switch(name.toLowerCase().charAt(i)) {
				case 'g': countG++; break;
				case 'b': countB++; break;
				}
			}
			bw.append(name + " is ");
			bw.append(countG == countB ? "NEUTRAL" : countG > countB ? "GOOD" : "A BADDY");
			if(n > 0) bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
