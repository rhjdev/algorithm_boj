import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10809 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			/* 알파벳 갯수 크기의 배열 arr */
			int[] arr = new int[26];
			for(int i=0; i < arr.length; i++) {
				arr[i] = -1;
			}
			
			/* 소문자로 이루어진 단어 s */
			String s = br.readLine();
			
			for(int i=0; i < s.length(); i++) {
				char ch = s.charAt(i);
				
				if(arr[ch - 'a'] == -1) {
					arr[ch - 'a'] = i;
				}
			}
			
			for(int result : arr) {
				bw.write(result + " ");
			}
			bw.flush();
			bw.close();
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
}
