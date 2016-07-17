import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
  
public class prb1377 {
    private static int dis;
  
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] a = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(br.readLine());
            d[i] = a[i];
        }
  
        Arrays.sort(d);
        dis = 0;
        for (int i = 0; i < n; i++) {
            bSearch(0, d.length - 1, a[i], d, i);
        }
        System.out.println(dis+1);
    }
  
    private static void bSearch(int l, int h, int k, int[] d, int index) {
        int r = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (d[mid] == k) {
                r = mid;
                l = mid + 1;
            }
            else if(d[mid] < k){
                l = mid + 1;
            }
            else
                h = mid - 1;
        }
        if(dis < index - r)
        	dis = index - r;
    }
}