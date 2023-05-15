import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1924 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); //month
		int y = Integer.parseInt(st.nextToken()); //date
		int days = y;
		String day = ""; //day of the week
		if(x > 1) {
			for(int i=1; i <= x-1; i++) {
				if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					days += 31;
				} else if(i == 4 || i == 6 || i == 9 || i == 11) {
					days += 30;
				} else {
					days += 28;
				}
			}
		}
		
		switch(days % 7) {
		case 0: day = "SUN"; break;
		case 1: day = "MON"; break;
		case 2: day = "TUE"; break;
		case 3: day = "WED"; break;
		case 4: day = "THU"; break;
		case 5: day = "FRI"; break;
		case 6: day = "SAT"; break;
		}
		br.close();
		System.out.printf("%s", day);
	}
}
