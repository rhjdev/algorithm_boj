import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class BOJ1181 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>(); //HashSet 특성 활용해 중복 입력 방지
		for(int i=0; i < N; i++) {
			set.add(br.readLine());
		}
		br.close();
		
		/*
		 * 1. toArray() 메소드가 매개변수로 허용하는 배열 Object[] 생성
		 * 2. 기존의 HashSet 객체를 Array로 옮김
		 * 3. Arrays.sort() 통해 정렬 조건 일괄 적용
		 */
		String[] arr = new String[set.size()];
		set.toArray(arr);
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) { //조건A. 길이가 같으면 사전순 정렬
					return o1.compareTo(o2);
				} else { //조건B. 그 밖의 경우는 기본 오름차순 정렬
					return o1.length() - o2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String result : arr) {
			sb.append(result).append("\n");
		}
		System.out.printf("%s", sb);
	}
}
