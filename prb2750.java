import java.util.Scanner;

public class prb2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		insert_sort(a, a.length);

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	private static void insert_sort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int key  = a[i];
			int k = i;
			for (int j = i-1; j >= 0; j--) {
				if(key<a[j]){
					a[j+1] = a[j];
					k = j;
				}
			}
			a[k] = key;
		}
	}
}
