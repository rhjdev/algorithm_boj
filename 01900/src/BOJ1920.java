import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A); //배열 오름차순 정렬 필요
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int result = 0;
		for(int i=0; i < M; i++) {
			if(binarySearch(A, Integer.parseInt(st.nextToken())) >= 0) { //Arrays.binarySearch() 메소드도 존재함
				result = 1;
			} else {
				result = 0;
			}
			System.out.println(result);
		}
		br.close();
	}
	
	static int binarySearch(int[] arr, int key) {
		int le = 0; //검색 범위의 왼쪽 끝 index
		int re = arr.length - 1; //검색 범위의 오른쪽 끝 index, 여기서는 검색 대상인 arr의 마지막 index를 가리킴
		
		do {
			int ct = (le + re) / 2; //검색 범위의 중앙 index
			if(arr[ct] == key) { //중앙 index와 일치하는 경우 검색 성공이므로 해당 값 반환
				return ct;
			} else if(arr[ct] < key) { //중앙 index보다 큰 경우 검색 범위를 오른쪽 절반으로 설정
				le = ct + 1;
			} else {
				re = ct - 1; //중앙 index보다 작은 경우 검색 범위를 왼쪽 절반으로 설정
			}
		} while(le <= re);
		return -1; //검색 실패한 경우 -1 반환
	}
}
