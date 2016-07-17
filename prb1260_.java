import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prb1260_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int c[] = new int[n];		
		ArrayList<Integer>[] a = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			a[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x].add(y);
			a[y].add(x);
		}
		
		for(int i=0;i<n;i++){
			Collections.sort(a[i]);
		}
		
		bfs(s,a,c);
	}

	private static void bfs(int s, ArrayList<Integer>[] a, int[] c) {
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		c[s] = 1;
	}
}
