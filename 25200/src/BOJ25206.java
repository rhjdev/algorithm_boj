import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ25206 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String[] arr = new String[3]; //과목명, 학점, 등급
		double sumTwentyGrades = 0;
		double sumMajors = 0;
		for(int i=0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			arr[0] = st.nextToken();
			arr[1] = st.nextToken();
			arr[2] = st.nextToken();
			if(!arr[2].contains("P")) {
				sumTwentyGrades += Double.parseDouble(arr[1]);
				sumMajors += (Double.parseDouble(arr[1]) * convertGradeToScale(arr[2]));
			}
		}
		bw.append(String.format("%.6f", sumMajors / sumTwentyGrades));
		bw.flush();
		bw.close();
		br.close();
	}
	
	static double convertGradeToScale(String letterGrade) {
		double percentScale = 0.0;
		if(letterGrade.indexOf('+') > 0) percentScale += 0.5;
		if(letterGrade.contains("A")) percentScale += 4.0;
		else if(letterGrade.contains("B")) percentScale += 3.0;
		else if(letterGrade.contains("C")) percentScale += 2.0;
		else if(letterGrade.contains("D")) percentScale += 1.0;
		return percentScale;
	}
}
