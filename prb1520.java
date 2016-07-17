import java.util.Scanner;

public class prb1520 {
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int m, n;
	static int[][] a;
	static int[][] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		a = new int[m][n];
		d = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(dfs(0, 0));
	}

	private static int dfs(int x, int y) {
		if (x == m - 1 && y == n - 1)
			return 1;
		if (d[x][y] == 0) {
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < m && ny < n && nx >= 0 && ny >= 0 && a[nx][ny] < a[x][y])
					d[x][y] += dfs(nx, ny);
			}
		}
		return d[x][y];
	}
}
