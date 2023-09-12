import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ20291 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			String input = br.readLine();
			int dot = input.indexOf(".");
			String extension = input.substring(dot+1); //dot 이후로 확장자명만 추출
			if(map.get(extension) != null) {
				map.replace(extension, map.get(extension)+1); //이미 map에 담긴 확장자인 경우 value 증가
			} else {
				map.put(extension, 1);
			}
		}
		
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1,o2) -> o1.getKey().compareTo(o2.getKey())); //key 기준 오름차순 정렬
		for(Map.Entry<String, Integer> entry : entries) {
			bw.append(entry.getKey() + " " + entry.getValue() + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
