import java.util.Scanner;

public class prb11729 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		hanoi(n,1,2,3);
	}
	
	public static void hanoi(int i,int start, int mid, int end){
		
		if(i==1){
			System.out.println(start + " " + end);
		}
		else{
			hanoi(i-1,start,end,mid);
			System.out.println(start + " " + end);
			hanoi(i-1,mid,start,end);
		}
	}
	
}
