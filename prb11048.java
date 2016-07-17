import java.util.Scanner;

public class prb11048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		int d[][] = new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j] = sc.nextInt();
			}
		}
		d[0][0] = a[0][0];
		for(int i=1;i<m;i++){
			d[0][i] = d[0][i-1] + a[0][i];
		}
		for(int i=1;i<n;i++){
			d[i][0] = d[i-1][0] + a[i][0];
		}
		
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				int max = 0;
				 max = Math.max(d[i-1][j] + a[i][j],d[i-1][j-1] + a[i][j]);
				 max = Math.max(max,d[i][j-1]+a[i][j]);
				 d[i][j] =  max;
			}
		}
		
		System.out.println(d[n-1][m-1]);
	}
}
