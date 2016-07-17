import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prb2636 {
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[][] c = new int[n][m];
		int[][] d = new int[n][m];
		int cnt = 0;
		int num = -1;
		int lNum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		while (num != 0) {
			lNum = num;
			num = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (a[i][j] == 1) {
						boolean p = false;
						for (int k = 0; k < 4; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							if (a[nx][ny] == 0)
								p = true;
						}
						if (p)
							d[i][j] = bfs(i, j, a, c);
						c = new int[n][m];
					}
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (d[i][j] == 1)
						a[i][j] = 0;
					if(a[i][j]==1)	
						num++;
				}
			}
			cnt++;
		}

		System.out.println(cnt);
		System.out.println(lNum);
	}
	
	

	private static int bfs(int x, int y, int[][] a, int[][] c) {
		Queue<Pair> q = new LinkedList<>();
		Pair e = new Pair(x, y);
		q.add(e);
		c[x][y] = 1;
		while (!q.isEmpty()) {
			e = q.remove();
			if (e.x == 0 && e.y == 0)
				return 1;
			for (int i = 0; i < 4; i++) {
				int nx = e.x + dx[i];
				int ny = e.y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < a.length && ny < a[0].length) {
					if (a[nx][ny] == 0 && c[nx][ny] == 0) {
						q.add(new Pair(nx, ny));
						c[nx][ny] = 1;
					}
				}
			}
		}
		return 0;
	}
}
