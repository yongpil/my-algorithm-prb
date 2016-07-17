import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prb1963 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10000];
		prime(a);
		
		int n = a.length;
		ArrayList<Integer> g[] = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		
		for(int i=1000;i<n;i++){
			if(a[i]!=0){
				for(int j=1000;j<n;j++){
					if(a[j]!=0 && c(a[i],a[j]))
						g[i].add(a[j]);
				}
			}
		}
		int tc = sc.nextInt();
		for(int t = 0;t<tc;t++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int v[] = new int[10000];
			
			if(x!=y)
				bfs(x, y, g, v);
			else
				System.out.println(0);
		}
	}

	private static void bfs(int s, int d, ArrayList<Integer>[] g, int[] v) {
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		v[s] = 0;
		
		while (!q.isEmpty()) {
			int x = q.remove();
			for (int i = 0; i < g[x].size(); i++) {
				if (g[x].get(i) == d){
					System.out.println(v[x]+1);
					return;
				}
				else if (v[g[x].get(i)] == 0){
					q.add(g[x].get(i));
					v[g[x].get(i)] = v[x]+1;
				}
			}
		}
	}

	private static boolean c(int p, int q) {
		int x = p;
		int y = q;
		int cnt = 0;

		for (int i = 0; i < 4; i++) {
			if (x % 10 == y % 10)
				cnt++;
			x = x / 10;
			y = y / 10;
		}
		if (cnt == 3)
			return true;
		else
			return false;
	}

	private static void prime(int[] a) {
		for (int i = 2; i < a.length; i++) {
			a[i] = i;
		}

		for (int i = 2; i < a.length; i++) {
			for (int j = i; j < a.length; j = j + i) {
				if (a[j] != 0 && i != j)
					a[j] = 0;
			}
		}
	}
}
