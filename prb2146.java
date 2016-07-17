import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class prb2146 {
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int a[][] = new int[n][n];
		int g[][] = new int[n][n];
		int d[][] = new int[n][n];
		int c[][] = new int[n][n];

		int gNum = 1;

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 1 && g[i][j] == 0) {
					g_bfs(i, j, a, g, gNum, n);
					gNum++;
				}
			}
		}

		b_bfs(g, n);
		d_bfs(a, d, n);
		
        int ans = -1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                for (int k=0; k<4; k++) {
                    int x = i+dx[k];
                    int y = j+dy[k];
                    if (0 <= x && x < n && 0 <= y && y < n) {
                        if (g[i][j] != g[x][y]) {
                            if (ans == -1 || ans > d[i][j] + d[x][y]) {
                                ans = d[i][j] + d[x][y];
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);

	}

	private static void b_bfs(int[][] g, int n) {
		Queue<Pair> q = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (g[i][j] != 0)
					q.add(new Pair(i, j));
			}
		}
		while (!q.isEmpty()) {
			Pair e = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = e.x + dx[i];
				int ny = e.y + dy[i];
				if (nx > -1 && ny > -1 && nx < n && ny < n) {
					if (g[nx][ny] == 0) {
						g[nx][ny] = g[e.x][e.y];
						q.add(new Pair(nx, ny));
					}
				}
			}
		}
	}

	private static void g_bfs(int x, int y, int[][] a, int[][] g, int gNum, int n) {
		Queue<Pair> q = new LinkedList<>();
		Pair e = new Pair(x, y);
		q.add(e);
		g[x][y] = gNum;

		while (!q.isEmpty()) {
			e = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = e.x + dx[i];
				int ny = e.y + dy[i];
				if (nx > -1 && ny > -1 && nx < n && ny < n) {
					if (a[nx][ny] == 1 && g[nx][ny] == 0) {
						g[nx][ny] = gNum;
						q.add(new Pair(nx, ny));
					}
				}
			}
		}
	}

	private static void d_bfs(int[][] a, int[][] d, int n) {
		Queue<Pair> q = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 1) {
					q.add(new Pair(i, j));
					d[i][j] = 0;
				}
			}
		}
		while (!q.isEmpty()) {
			Pair e = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = e.x + dx[i];
				int ny = e.y + dy[i];
				if (nx > -1 && ny > -1 && nx < n && ny < n) {
					if (a[nx][ny] == 0) {
						d[nx][ny] = d[e.x][e.y] + 1;
						q.add(new Pair(nx, ny));
						a[nx][ny] = 1;
					}
				}
			}
		}
	}
}
