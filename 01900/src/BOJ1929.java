import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1929 {
	
	public static boolean[] isPrime;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		isPrime = new boolean[N+1];
		for(int i=0; i < isPrime.length; i++) isPrime[i] = true; //boolean 타입의 기본값은 false이므로 원하는 값으로 초기화 필요
		
		StringBuilder sb = new StringBuilder();
		getPrimeNumbers();
		for(int i=M; i <= N; i++) {
			if(isPrime[i]) sb.append(i).append("\n");
		}
		br.close();
		System.out.printf("%s", sb);
	}
	/*
	 * 에라토스테네스의 체(Sieve of Eratosthenes)
	 * 1. 배열의 index를 활용해 0부터 N에 이르는 모든 숫자를 나열
	 * 2. 소수도 합성수도 아닌 자연수 0과 1은 제외
	 * 3. 2 이상 √N 이하 사이를 반복하는 동안 i의 배수는 i를 약수로 가지므로 제외
	 */
	public static void getPrimeNumbers() {
		isPrime[0] = isPrime[1] = false; //0, 1 제외
		for(int i=2; i <= Math.sqrt(isPrime.length); i++) {
			if(!isPrime[i]) continue;
			for(int j=i*i; j < isPrime.length; j+=i) { //i 탐색 시마다 i의 배수 제외
				isPrime[j] = false;
			}
		}
	}
}
