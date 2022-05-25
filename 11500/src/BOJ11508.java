import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ11508 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine()); 							//유제품 개수
			
			Integer[] C = new Integer[N];
			for(int i=0; i < N; i++) C[i] = Integer.parseInt(br.readLine());	//각 유제품 가격
			
			Arrays.sort(C, Comparator.reverseOrder());							//Integer 타입의 배열 내림차순 정렬
			int sum = 0;
			for(int i=0; i < N; i++) {
				if(i % 3 == 2) continue;										//3개 묶음이므로 index가 2, 5, 8...일 때 생략
				sum += C[i];
			}
			
			bw.write(String.valueOf(sum));
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
}
