import java.util.Scanner;

public class prb1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt =0;
		for(int i=1;i<=n;i++){
			int j = i;
			while(j%5==0 && j!=0){
				j= j/5;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
