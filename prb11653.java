import java.util.Scanner;

public class prb11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<n;i++){
			if(n%i==0){
				n = n/i;
				System.out.println(i);
				i--;
			}
		}
		if(n!=1)
			System.out.println(n);
	}
}
