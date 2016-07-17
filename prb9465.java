
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 
public class prb9465 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
        	int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n];
            int[][] d = new int[n][2];
            for (int i = 0; i < 2; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine().trim());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.valueOf(st.nextToken());
                }
            }
 
            d[0][0] = arr[0][0];
            d[0][1] = arr[1][0];
            if (n > 2) {
                d[1][0] = arr[0][1] + arr[1][0];
                d[1][1] = arr[0][0] + arr[1][1];
            }
            for (int i = 2; i < n; i++) {
                d[i][0] = Math.max(d[i - 1][1] + arr[0][i], d[i - 2][1] + arr[0][i]);
                d[i][1] = Math.max(d[i - 1][0] + arr[1][i], d[i - 2][0] + arr[1][i]);
            }
 
            System.out.println(Math.max(d[n - 1][0], d[n - 1][1]));
        }
    }
}