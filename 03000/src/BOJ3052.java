import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ3052 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int[] mod = new int[10];
			for(int i=0; i < mod.length; i++) {
				mod[i] = Integer.parseInt(br.readLine()) % 42;
			}
			
			bw.write(String.valueOf(modChecker(mod)));
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static int modChecker(int[] mod) {
		
		int count = 0;
		
		for(int i=0; i < mod.length; i++) {
			boolean check = false;
			for(int j=i+1; j < mod.length; j++) {
				if(mod[i] == mod[j]) {
					check = true;
					break;
				}
			}
			if(!check) {
				count++;
			}
		}
		return count;
	}
}
