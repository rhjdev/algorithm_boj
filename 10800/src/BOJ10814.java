import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10814 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			int N = Integer.parseInt(br.readLine()); //회원 수
			
			Member[] member = new Member[N];
			
			for(int i=0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				member[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
			}
			
			/* 나이 기준 오름차순 정렬 */
			Arrays.sort(member, new Comparator<Member>() {

				@Override
				public int compare(Member o1, Member o2) {
					return o1.age - o2.age;
				}
				
			});
			
			for(Member mem : member) {
				bw.write(String.valueOf(mem));
			}
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

class Member {
	int age;
	String name;
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age + " " + name + "\n";
	}
}
