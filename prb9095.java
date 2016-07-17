import java.util.Scanner;

public class prb9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int []d = new int[12];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for(int i=4;i<12;i++){
			d[i] = d[i-3]+d[i-2]+d[i-1];
		}
		for(int test_case=0;test_case<t;test_case++){
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
		
	
	}
}
