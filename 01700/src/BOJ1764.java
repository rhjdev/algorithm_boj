import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1764 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		for(int i=0; i < N; i++) { set.add(br.readLine()); }
		List<String> list = new ArrayList<>();
		for(int i=0; i < M; i++) {
			String input = br.readLine();
			if(set.contains(input)) { //N,M에 모두 포함된 이름
				list.add(input);
			}
		}
		br.close();
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
		Arrays.sort(arr, new Comparator<String>() { //사전순 정렬
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(arr.length).append("\n");
		for(String name : arr) { sb.append(name).append("\n"); }
		System.out.printf("%s", sb);
	}
}
