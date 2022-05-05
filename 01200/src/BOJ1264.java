import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1264 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			for(;;) {
				String input = br.readLine().toLowerCase();
				
				int count = 0;
				for(int i=0; i < input.length(); i++) {
					
					switch(input.charAt(i)) {
						case 'a':
						case 'e': 
						case 'i':
						case 'o':
						case 'u': count++; break;
						case '#': return;
						default: break;
					}
				}
				bw.write(String.valueOf(count) + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
