import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10798 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr = new char[5][15];
		for(int i=0; i < arr.length; i++) {
			String input = br.readLine();
			for(int j=0; j < input.length(); j++) {
				arr[i][j] = input.charAt(j);
			}
		}
		int index = 0;
		for(int j=index; j < arr[index].length; j++) { //15
			for(int i=0; i < arr.length; i++) { //5
				if(arr[i][j] != '\0') bw.append(arr[i][j]); //char 타입의 null 확인('\0')
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
