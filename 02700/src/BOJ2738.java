import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2738 {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		for(int a=1; a <= 2; a++) { //두 번에 걸쳐 입력(N개의 줄에 행렬 A 원소 M개, N개의 줄에 행렬 B 원소 M개)
			for(int i=0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j < M; j++) {
					arr[i][j] += Integer.parseInt(st.nextToken());
					if(a == 2) bw.append(Integer.toString(arr[i][j]) + " "); //두 번째 입력 중 합산된 값을 저장
				}
				if(a == 2) bw.append("\n");
			}
		}
		bw.flush();
		br.close();
	}
}
