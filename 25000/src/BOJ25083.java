import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ25083 {

	public static void main(String[] args) {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.append("         ,r'\"7\n")
			  .append("r`-_   ,'  ,/\n")
			  .append(" \\. \". L_r'\n")
			  .append("   `~\\/\n")
			  .append("      |\n")
			  .append("      |");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
