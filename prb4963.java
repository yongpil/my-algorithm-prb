import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prb4963 {
	static int[]dx = {0,0,1,-1,1,-1,1,-1};
	static int[]dy = {1,-1,0,0,1,1,-1,-1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int cnt = 0;
		while (w != 0 || h != 0) {
			int[][] a = new int[h][w];
			int[][] c = new int[h][w];
			cnt = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (c[i][j] == 0 && a[i][j] == 1) {
						bfs(i, j, a, c);
						cnt++;
					}

				}
			}
			w = sc.nextInt();
			h = sc.nextInt();
			System.out.println(cnt);
		}
	}

	private static void bfs(int x, int y, int[][] a, int[][] c) {
		Pair e = new Pair(x,y);
		Queue<Pair> q = new LinkedList<>();
		c[e.x][e.y] = 1;
		q.add(e);
		
		while(!q.isEmpty()){
			e = q.remove();
			for(int i=0;i<8;i++){
				int nx = e.x + dx[i]; 
				int ny = e.y + dy[i];
				if(nx > -1 && ny >-1 && nx < a.length && ny < a[0].length){
					if(c[nx][ny] == 0 && a[nx][ny] ==1){
						c[nx][ny] = 1;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
	}
}
