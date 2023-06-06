import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2566 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[][] arr = new int[9][9];
		int max = Integer.MIN_VALUE;
		int row = 0;
		int col = 0;
		for(int i=0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); //초기화
				if(arr[i][j] > max) {
					max = arr[i][j]; //최댓값
					row = i+1; //index 0부터 시작하므로 +1
					col = j+1;
				}
			}
		}
		bw.append(max + "\n").append(row + " " + col); 
		bw.flush();
		bw.close();
		br.close();
	}
}
