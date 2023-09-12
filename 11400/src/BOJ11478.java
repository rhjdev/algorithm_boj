import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class BOJ11478 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<String> set = new HashSet<>();
		String S = br.readLine();
		for(int i=0; i < S.length(); i++) {
			set.add(S.substring(i)); //5개 {ababc,babc,abc,bc,c}
			for(int j=i+1; j < S.length(); j++) {
				set.add(S.substring(i, j)); //10개 {a,ab,aba,abab,b,ba,bab,a,ab,b}
			}
		}
		bw.append(set.size() + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
