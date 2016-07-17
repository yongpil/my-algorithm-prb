import java.util.Scanner;

public class prb1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		int min = 0;
		int k = 0;
		int p = 0;
		int q = 0;
		for(int i=0;i<t;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>b)
				min = b;
			else
				min = a;
			for(int j=1;j<=min;j++){
				if(a%j==0 && b%j==0){
					k = j;
					p = a/j;
					q = b/j;
				}
			}
			System.out.println(k*p*q);
		}		
	}
}
