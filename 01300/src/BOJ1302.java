import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BOJ1302 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine()); //하루간 총 판매 개수
			
			Map<String, Integer> map = new HashMap<>();
			
			for(int i=0; i < N; i++) {
				String title = br.readLine(); //판매된 책 제목
				
				if(!map.containsKey(title)) {
					map.put(title, 1);
				} else {
					map.put(title, map.get(title) + 1);
				}
			}
			
			int max = 0;
			String title = "";
			
			for(String key : map.keySet()) {
				int value = map.get(key);
				
				if(max == value && key.compareTo(title) < 0) {
					title = key;
				} else if(max < value) {
					max = value;
					title = key;
				}
			}
			
			bw.write(title);
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