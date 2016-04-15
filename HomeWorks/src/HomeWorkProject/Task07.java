package HomeWorkProject;

public class Task07 {

	public static void main(String[] args) {

		final int[] mas1 = { 0, 1, 2, 3 };
		final int[] mas2 = { 0, 4, 5, 6, 7, 8 };
		final int[] mas3 = { 10, 0, 11, 12, 13, 14, 15 };

		final int[][] matrix = { mas1, mas2, mas3 };
		final int[][][] mas3d = { matrix, { mas2, mas3 } };

		OUTER: for (int i = 0; i < mas3d.length; i++) {
			for (int j = 0; j < mas3d.length; j++) {
				for (int k = 0; k < mas3d.length; k++) {
					if (mas3d[i][j][k] == 0) {
						System.out.println(i);
						continue OUTER;
					}
				}
			}
		}
	}
}
