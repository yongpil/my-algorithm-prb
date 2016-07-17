import java.util.Scanner;

public class prb2331 {
	private static int p;
	private static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		p = sc.nextInt();
		int c[] = new int[300000];
		int s[] = new int[300000];
		cnt = 0;
		dfs(a, c, s);
	}

	private static void dfs(int a, int[] c, int s[]) {
		if (c[a] == 1) {
			System.out.println(s[a]);
			return;
		}
		c[a] = 1;
		s[a] = cnt;
		cnt++;
		String t = String.valueOf(a);
		a = 0;
		for (int i = 0; i < t.length(); i++) {
			a = a + (int) Math.pow(t.charAt(i) - '0', p);
		}
		dfs(a, c, s);
	}
}
