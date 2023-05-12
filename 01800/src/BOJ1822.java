import java.util.Scanner;
import java.util.TreeSet;

public class BOJ1822 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int sizeA = sc.nextInt();
		int sizeB = sc.nextInt();
		TreeSet<Integer> setA = new TreeSet<>(); //HashSet과 달리 이진탐색트리(BST, binary search tree) 형태를 취하며, 데이터 기본 오름차순 자동 정렬
		for(int i=0; i < sizeA; i++) {
			setA.add(sc.nextInt());
		}
		for(int i=0; i < sizeB; i++) {
			int num = sc.nextInt();
			if(setA.contains(num)) setA.remove(num);
		}
		sb.append(setA.size() + "\n");
		for(int e : setA) {
			sb.append(e + " ");
		}
		sc.close();
		System.out.printf("%s", sb);
	}
}
