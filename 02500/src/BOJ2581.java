import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2581 {

	static boolean[] isNotPrime;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		checkPrimeNumber(N);
		int sum = 0;
		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE; //최댓값 및 최솟값을 구할 때는 각각 MIN_VALUE/MAX_VALUE로 초기화한 후 탐색 범위를 돌면서 덮어씀
		for(int i=M; i <= N; i++) {
			if(!isNotPrime[i]) {
				sum += i;
				min = i < min ? i : min;
//				max = i > max ? i : max;
			}
		}
		if(sum > 0) {
			bw.append(sum + "\n");
			bw.append(min + "");
		} else {
			bw.append("-1");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	/*
	 * 에라토스테네스의 체(Sieve of Eratosthenes)
	 * 1. 배열의 index를 활용해 0부터 N에 이르는 모든 숫자를 나열
	 * 2. 소수도 합성수도 아닌 자연수 0과 1은 제외
	 * 3. 2 이상 √N 이하 사이를 반복하는 동안 i의 배수는 i를 약수로 가지므로 제외
	 */
	static void checkPrimeNumber(int N) {
		isNotPrime = new boolean[N+1]; //0~N
		isNotPrime[0] = isNotPrime[1] = true; //0, 1은 소수가 X
		for(int i=2; i <= Math.sqrt(N); i++) {
			if(isNotPrime[i]) continue; //앞선 탐색 중 이미 소수가 아닌 것으로 판명났다면 지나침
			for(int j=i*i; j < isNotPrime.length; j += i) {
				isNotPrime[j] = true;
			}
		}
	}
}
