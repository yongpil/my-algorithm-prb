import java.util.Scanner;

public class prb2136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] d = new int[n + 1][m + 1];
		d[1][1] = 0;
		for(int i=2;i<=n;i++){
			d[i][1]=i-1;
		}
		for(int i=2;i<=m;i++){
			d[1][i]=i-1;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= m; j++) {
				if (i % 2 == 0)
					d[i][j] = 2 * d[i/2][j] + 1;
				else if (j % 2 == 0)
					d[i][j] = 2 * d[i][j/2] + 1;
				else
					d[i][j] = d[i][j/2] + d[i][j/2+1] + 1;
			}
		}
		
		System.out.println(d[n][m]);
	}
}
