import java.util.Scanner;

public class BOJ2754 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		System.out.printf("%.1f", getPointAverage(input));
	}
	
	static double getPointAverage(String grade) {
		double average = 0.0;
		if(grade.charAt(0) == 'A') {
			average += 4.0;
		} else if(grade.charAt(0) == 'B') {
			average += 3.0;
		} else if(grade.charAt(0) == 'C') {
			average += 2.0;
		} else if(grade.charAt(0) == 'D') {
			average += 1.0;
		}
		if(grade.contains("+")) average += 0.3;
		if(grade.contains("-")) average -= 0.3;
		return average;
	}
}
