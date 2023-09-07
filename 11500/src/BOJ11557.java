import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ11557 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine()); //number of university
			Map<String, Integer> map = new HashMap<>();
			while(N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				map.put(st.nextToken(), Integer.parseInt(st.nextToken())); //name of university, the consumption of alcohol
			}
			List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
			Collections.sort(list, (o1,o2) -> o2.getValue().compareTo(o1.getValue())); //descending order
			bw.append(list.get(0).getKey());
			if(T > 0) bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
