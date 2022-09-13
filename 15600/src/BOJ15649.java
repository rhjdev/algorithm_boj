import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15649 {

	public static int[] arr;
	public static boolean[] isVisited; //조건1.이미 순회한 값인지 확인
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {

		/*
		 * 브루트포스(Bruteforcing) : 모든 경우의 수 탐색
		 * 백트래킹(Backtracking) : 범위 내에 조건을 설정하여 노드의 유망성(값으로서 취급할 필요가 있는지 여부)을 판단하고 이에 따라 효율적 탐색
		 * -깊이우선탐색(DFS, Depth-first Search) : 백트래킹 방법 중 하나로, 트리순회 형태의 알고리즘
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		isVisited = new boolean[N];
		dfs(N, M, 0);
		System.out.printf("%s", sb);
		br.close();
	}
	
	static void dfs(int N, int M, int depth) { //1~N 범위의 자연수 중 중복 없이 M개씩 짝을 이룬 수열 탐색
		if(depth == M) {
			for(int num : arr) { sb.append(num).append(" "); }
			sb.append("\n");
			return;
		}
		
		for(int i=0; i < N; i++) {
			if(!isVisited[i]) {
				isVisited[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				isVisited[i] = false;
			}
		}
	}
}
