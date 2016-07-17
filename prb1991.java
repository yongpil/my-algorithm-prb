import java.util.Scanner;

public class prb1991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] a = new int[26][2];
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			int x = line.charAt(0) - 'A';
			char y = line.charAt(2);
			char z = line.charAt(4);
			if (y == '.') {
				a[x][0] = -1;
			} else {
				a[x][0] = y - 'A';
			}
			if (z == '.') {
				a[x][1] = -1;
			} else {
				a[x][1] = z - 'A';
			}
		}
		preorder(a, 0);
		System.out.println();
		inorder(a, 0);
		System.out.println();
		postorder(a, 0);
		System.out.println();
	}

	private static void postorder(int[][] a, int x) {
		if (x == -1)
			return;
		postorder(a, a[x][0]);
		postorder(a, a[x][1]);
		System.out.print((char) (x + 'A'));
	}

	private static void inorder(int[][] a, int x) {
		if (x == -1)
			return;
		inorder(a, a[x][0]);
		System.out.print((char) (x + 'A'));
		inorder(a, a[x][1]);
	}

	private static void preorder(int[][] a, int x) {
		if (x == -1)
			return;
		System.out.print((char) (x + 'A'));
		preorder(a, a[x][0]);
		preorder(a, a[x][1]);
	}
}
