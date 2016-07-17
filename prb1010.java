import java.util.Scanner;

public class prb1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test_case=0;test_case<t;test_case++){
			int y = sc.nextInt();
			int x = sc.nextInt();
			long d[][] = new long[x+1][y+1];
			
			for(int i=1;i<=x;i++){
				for(int j=1;j<=y;j++){
					if(i==j)
						d[i][j]=1;
					else if(j==1){
						d[i][j]=i;
					}
					else if(i>j){
						d[i][j] = d[i-1][j] + d[i-1][j-1];
					}
				}
			}
			System.out.println(d[x][y]);
		}
	}
}
