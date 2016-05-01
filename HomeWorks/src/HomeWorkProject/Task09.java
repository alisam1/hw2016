package HomeWorkProject;

public class Task09 {

	public static void main(String[] args) {
		final int[][] matrix = { { 134, 148, 189, 210 }, { 500, 386, 76, 98 }, { 239, 752, 390, 54 }, };

		for (int i = 0; i < matrix[i].length; i++) {
			int max = matrix[i][0];
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}

			System.out.println(max);
		}

	}

}
