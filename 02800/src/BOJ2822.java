import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BOJ2822 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for(int i=0; i < 8; i++) {
			map.put((i+1), Integer.parseInt(br.readLine()));
		}
		br.close();
		
		List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue())); //value 기준 내림차순 정렬
		StringBuilder sb = new StringBuilder();
		int[] key = new int[5];
		for(int i=0; i < 5; i++) {
			sum += entries.get(i).getValue();
			key[i] = entries.get(i).getKey();
		}
		Arrays.sort(key); //5개 문항 번호 key 오름차순 정렬
		for(int num : key) sb.append(num).append(' ');
		
		System.out.printf("%d\n", sum);
		System.out.printf("%s", sb);
	}
}
