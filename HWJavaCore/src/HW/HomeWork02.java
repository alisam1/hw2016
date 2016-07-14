package HW;

public class HomeWork02 {

	public static void main(String[] args) {
		final int n = 3;
		int r = 0;
		int c = 0;
		int spec = 0;
		int i = 0;
		final int matr[][] = new int[n][n];
		for (; i < n * n - 1;) {

			for (int j = 0; j < n - spec; j++) {
				matr[r][c++] = ++i;
			}
			c--;
			++spec;

			for (int k = 0; k < n - spec; k++) {
				matr[++r][c] = ++i;
			}

			for (int l = 0; l < n - spec; l++) {
				matr[r][--c] = ++i;
			}
			++spec;

			for (int m = 0; m < n - spec; m++) {
				matr[--r][c] = ++i;
			}
			c++;
		}

		for (int d = 0; d < n; d++) {
			for (int s = 0; s < n; s++) {
				System.out.print(matr[d][s] + "\t");
			}
			System.out.println();
		}

	}

}
