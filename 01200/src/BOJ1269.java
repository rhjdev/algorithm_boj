import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ1269 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Set<Integer> set = new TreeSet<>();
	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		addElements(A);
		addElements(B);
		System.out.printf("%d", set.size());
		br.close();
	}
	
	static void addElements(int size) throws Exception {
		st = new StringTokenizer(br.readLine());
		for(int i=0; i < size; i++) {
			int element = Integer.parseInt(st.nextToken());
			if(!set.add(element)) { set.remove(element); } //set 특성상 이미 존재해 더 이상 추가할 수 없는 경우 교집합에 해당하므로 삭제
		}
	}
}
