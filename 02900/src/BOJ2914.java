import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2914 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int songs = Integer.parseInt(st.nextToken());
		int avg = Integer.parseInt(st.nextToken()); //항상 올림하여 구해진 평균값
		bw.append(String.valueOf((songs * (avg-1)) + 1)); //수록곡 10, 평균값 10인 경우 저작권이 있는 멜로디 개수는 91~99 => songs*(avg-1)+1, songs*avg-1
		bw.flush();
		bw.close();
		br.close();
	}
}
