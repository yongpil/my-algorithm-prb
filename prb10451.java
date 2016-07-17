import java.util.Scanner;

public class prb10451{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int test_case = 0; test_case<t;test_case++){
			int n = sc.nextInt();
			int[] a = new int[n+1];
			
			boolean c[] = new boolean[n+1];
			for(int i=1;i<=n;i++){
				a[i] = sc.nextInt();
			}
			int cnt =0;
			for(int i=1;i<=n;i++){
				if(c[i]==false){
				dfs(a,c,i);
				cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

	private static void dfs(int[] a, boolean[] c, int x) {
		if(c[x])return;
		c[x] = true;
		dfs(a,c,a[x]);
	}
}