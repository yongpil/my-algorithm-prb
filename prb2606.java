import java.util.ArrayList;
import java.util.Scanner;

public class prb2606 {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c[] = new int[n+1];
		ArrayList<Integer>[] a = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<>();
		}

		for (int i = 1; i <= m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x].add(y);
			a[y].add(x);
		}
		dfs(1,a,c);
		
		System.out.println(cnt);
	}
	private static void dfs(int x, ArrayList<Integer>[] a, int[] c) {
		c[x] = 1;
		for(int i=0;i<a[x].size();i++){
			int y = a[x].get(i);
			if(c[y]==0){
				dfs(y,a,c);
				cnt++;
			}
		}
	}
}
