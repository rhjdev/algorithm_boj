import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BOJ23234 {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.append("The world says hello!");
		bw.flush();
		bw.close();
	}
}
