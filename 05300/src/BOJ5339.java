import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BOJ5339 {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.append("     /~\\\n"
				+ "    ( oo|\n"
				+ "    _\\=/_\n"
				+ "   /  _  \\\n"
				+ "  //|/.\\|\\\\\n"
				+ " ||  \\ /  ||\n"
				+ "============\n"
				+ "|          |\n"
				+ "|          |\n"
				+ "|          |");
		bw.flush();
		bw.close();
	}
}
