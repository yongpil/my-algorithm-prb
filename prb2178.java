import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prb2178 {
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		int a[][] = new int[n][m];
		int c[][] = new int[n][m];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < m; j++) {
				a[i][j] =s.charAt(j)-'0'; 
			}
		}

		dfs(0, 0, a, c);
		System.out.println(c[n-1][m-1]);
	}

	private static void dfs(int x, int y, int[][] a, int[][] c) {
		Pair e = new Pair(x, y);
		Queue<Pair> q = new LinkedList<>();
		q.add(e);
		c[e.x][e.y] = 1;
		while (!q.isEmpty()) {
			e = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = e.x + dx[i];
				int ny = e.y + dy[i];
				if (nx > -1 && ny > -1 && nx < n && ny < m) {
					if (c[nx][ny] == 0 && a[nx][ny] == 1) {
						q.add(new Pair(nx, ny));
						c[nx][ny] = c[e.x][e.y]+1;
					}
				}
			}
		}
	}
}
