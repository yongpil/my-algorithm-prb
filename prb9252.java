import java.util.Scanner;

public class prb9252 {
	static String s1;
	static String s2;
	static int n,m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 s1 = sc.nextLine();
		 s2 = sc.nextLine();
		 n = s1.length();
		 m = s2.length();
		int d[][] = new int[n + 1][m + 1];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					d[i][j] = d[i - 1][j - 1] + 1;
				} else {
					if (d[i - 1][j] > d[i][j - 1]) {
						d[i][j] = d[i - 1][j];
					} else {
						d[i][j] = d[i][j - 1];
					}
				}
			}
		}
		System.out.println(d[n][m]);
		System.out.println(fs(d,sb));
	}

	private static String fs(int[][] d, StringBuilder sb) {
		int x = n;
		int y = m;
		while(d[x][y] != 0){
			if(s1.charAt(x-1)==s2.charAt(y-1)){
				sb.append(s1.charAt(x-1));
				x = x -1;
				y = y -1;
			}
			else{
				if(d[x-1][y] > d[x][y-1])
					x =  x-1;
				else
					y = y-1;
			}
		}
			return sb.reverse().toString();
	}
}
