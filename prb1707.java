import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class prb1707 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());

		for (int test_case = 0; test_case < t; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			boolean flag = true;

			ArrayList<Integer>[] a = new ArrayList[n + 1];
			for (int i = 1; i <= n; i++) {
				a[i] = new ArrayList<>();
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

			int c[] = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				if (c[i] == 0)
					bfs(a, c, i);
			}
			
			for (int i = 1; i <= n; i++) {
				for (int y : a[i]) {
					if (c[i] == c[y])
						flag = false;
				}
			}

			if (flag == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static void bfs(ArrayList<Integer>[] a, int[] c, int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		c[start] = 1;

		while (!q.isEmpty()) {
			int x = q.remove();
			for (int y : a[x]) {
				if (c[y] == 0) {
					q.add(y);
					c[y] = 3 - c[x];
				}
			}
		}
	}
}
