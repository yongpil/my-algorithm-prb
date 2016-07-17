import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class prb7576 {
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		int a[][] = new int[n][m];
		int c[][] = new int[n][m];
		boolean able = false;
		boolean all = true;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.valueOf(st.nextToken());
				if (a[i][j] == 1)
					able = true;
				if (a[i][j] == 0 || a[i][j] == -1)
					all = false;
			}
		}

		if (!able) {
			System.out.println(-1);
			return;
		}

		if (all) {
			System.out.println(0);
			return;
		}

		bfs(a, c);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j]== 0 && c[i][j]==0){
					System.out.println(-1);
					return;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (c[i][j] > max)
					max = c[i][j];
			}
		}
		System.out.println(max);
	}

	private static void bfs(int[][] a, int[][] c) {
		Queue<Pair> q = new LinkedList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == 1) {
					Pair e = new Pair(i, j);
					c[i][j] = 0;
					q.add(e);
				}
			}
		}
		while (!q.isEmpty()) {
			Pair e = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = e.x + dx[i];
				int ny = e.y + dy[i];
				if (nx > -1 && ny > -1 && nx < a.length && ny < a[0].length) {
					if (a[nx][ny] == 0 && c[nx][ny] == 0) {
						q.add(new Pair(nx, ny));
						c[nx][ny] = c[e.x][e.y] + 1;
						a[nx][ny] = 1;
					}
				}
			}
		}
	}
}
