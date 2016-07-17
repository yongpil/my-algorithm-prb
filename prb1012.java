import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class prb1012 {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		StringTokenizer st;
		int cnt;
		for (int test_case = 0; test_case < t; test_case++) {
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			int[][] arr = new int[n][m];
			int[][] c = new int[n][m];

			int x = 0;
			int y = 0;
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.valueOf(st.nextToken());
				y = Integer.valueOf(st.nextToken());
				arr[y][x] = 1;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (c[i][j] == 0 && arr[i][j] == 1){
						bfs(i, j, arr, c);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	private static void bfs(int x, int y, int[][] arr, int[][] c) {
		Queue<Pair> q = new LinkedList();
		Pair e = new Pair(x, y);
		q.add(e);
		c[x][y] = 1;
		while (!q.isEmpty()) {
			e = q.remove();
			for(int i=0;i<4;i++){
				int nx = e.x + dx[i];
				int ny = e.y + dy[i];
				if(nx > -1 && ny > -1 && nx < arr.length && ny <arr[0].length){
					if(arr[nx][ny]==1 && c[nx][ny] == 0){
						c[nx][ny] = 1;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
	}
}
