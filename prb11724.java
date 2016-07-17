import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class prb11724 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int cnt = 0;
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken());
			int v = Integer.valueOf(st.nextToken());
			a[u].add(v);
			a[v].add(u);
		}
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}
		boolean c[] = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			if (c[i] != true) {
				bfs(a, c, i);
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	private static void bfs(ArrayList<Integer>[] a, boolean[] c, int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		c[start] = true;
		q.add(start);

		while (!q.isEmpty()) {
			int x = q.remove();
			// System.out.print(x + " ");
			for (int y : a[x]) {
				if (c[y] == false) {
					c[y] = true;
					q.add(y);
				}
			}
		}
	}
}
