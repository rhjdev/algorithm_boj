import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BOJ7785 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		for(int i=0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			if(input[1].equals("enter")) {
				map.put(input[0], input[1]);
			} else if(input[1].equals("leave")) {
				map.remove(input[0]);
			}
		}
		br.close();
		
		List<Map.Entry<String, String>> entries = new LinkedList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o2.getKey().compareTo(o1.getKey()));
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey());
		}
	}
}
