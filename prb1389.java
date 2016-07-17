import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prb1389 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList[] a = new ArrayList[n+1];
		int[] c;

		for (int i = 0; i < n+1; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			a[p].add(q);
			a[q].add(p);
		}

		int min = Integer.MAX_VALUE;
		int r = 0;
		int sum;
		for (int i = 1; i <= n; i++) {
			c = new int[n+1];
			initCh(c);
			sum = 0;
			bfs(i, a, c);
			for (int j = 1; j < c.length; j++) {
				sum = sum + c[j];
			}
			if (sum < min) {
				min = sum;
				r = i;
			}
		}
		
		System.out.println(r);
	}

	private static void initCh(int[] c) {
		for(int i=0;i<c.length;i++){
			c[i]=-1;
		}
	}

	private static void bfs(int x, ArrayList[] a, int[] c) {
		Queue<Integer> q = new LinkedList();
		q.add(x);
		c[x] = 0;
		while (!q.isEmpty()) {
			x = q.remove();
			for (int i = 0; i < a[x].size(); i++) {
				int y = (int) a[x].get(i);
				if (c[y] == -1) {
					q.add(y);
					c[y] = c[x] + 1;
				}
			}
		}
	}
}
