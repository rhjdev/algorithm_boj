import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2789 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		char[] cambridge = "CAMBRIDGE".toCharArray();
		for(int i=0; i < cambridge.length; i++) {
			if(input.indexOf(cambridge[i]) > -1) { //일치하는 철자가 있는 경우
				input = input.replaceAll(String.valueOf(cambridge[i]), "");
			}
		}
		bw.append(input);
		bw.flush();
		bw.close();
		br.close();
	}
}
