import java.util.Scanner;

public class prb1965 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int d[] = new int[n];
		int rst = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		d[0] = 1;
		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] > a[j] && d[j] > max) {
					max = d[j];
				}
			}
			d[i] = max + 1;
		}
		for(int i=0;i<d.length;i++){
			if(d[i]>rst)
				rst = d[i];
		}
		System.out.println(rst);
	}
}
