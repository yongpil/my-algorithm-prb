import java.util.Scanner;

public class prb9251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int x = s1.length();
		int y = s2.length();
		int d[][] = new int[x + 1][y + 1];
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					d[i][j] = d[i-1][j-1]+1;
				else
					d[i][j] = Math.max(d[i-1][j],d[i][j-1]);
			}
		}
		System.out.println(d[x][y]);
	}
}
