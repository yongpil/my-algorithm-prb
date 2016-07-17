	import java.util.Scanner;
	
	public class prb10972 {
		static boolean c = false;
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			int b = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
	
			for (int i = n - 1; i > 0; i--) {
				if (isChange())
					break;
				if (a[i - 1] < a[i]) {
					for (int j = n - 1; j >= i; j--) {
						if (isChange())
							break;
						if (a[j] > a[i - 1]) {
							int temp = a[i - 1];
							a[i - 1] = a[j];
							a[j] = temp;
							c = true;
							b = i;
						}
					}
				}
			}
			
			if (isChange()) {
				for (int i = 0; i < b; i++) {
					System.out.print(a[i] + " ");
				}
				
				for (int i = n-1; i >= b; i--) {
					System.out.print(a[i] + " ");
				}
			} else
				System.out.println(-1);
		}
	
		private static boolean isChange() {
			if (c == true)
				return true;
			return false;
		}
	}
