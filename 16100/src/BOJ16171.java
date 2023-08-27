import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ16171 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String keyword = br.readLine();
		String result = "";
		for(int i=0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) result += ch;
		}
		if(result.contains(keyword)) {
			bw.append("1");
		} else {
			bw.append("0");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
