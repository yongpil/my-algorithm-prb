import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class prb11650 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int a[][] = new int[n][2];
		StringTokenizer st;
		for(int i=0;i<n;i++){
			 st = new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++){
				 a[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		
		for(int i=0;i<n;i++){
			System.out.println();
			for(int j=0;j<2;j++){
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
