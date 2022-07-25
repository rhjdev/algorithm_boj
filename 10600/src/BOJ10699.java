import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ10699 {

	public static void main(String[] args) {
		
		//LocalDate now = LocalDate.now();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(date));
	}
}
