package HomeWorkProject;

public class Task08 {

	public static void main(String[] args) {

		final int[][][] mas = new int[2][2][3];

		mas[0][0][0] = 1;
		mas[0][0][1] = 0;
		mas[0][0][2] = 2;
		mas[0][1][0] = 3;
		mas[0][1][1] = 4;
		mas[0][1][2] = 0;
		mas[1][0][0] = 5;
		mas[1][0][1] = 6;
		mas[1][0][2] = 7;
		mas[1][1][0] = 8;
		mas[1][1][2] = 9;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					if (mas[i][j][k] == 0) {
						inf(i, j, k);
						System.out.println(mas[i][j][k]);
						continue;
					}

				}

			}

		}
	}

	static void inf(int i, int j, int k) {
		System.out.println(
				"Столбец (i) = " + i + "\n" + "Строка(j)= " + j + "\n" + "Подстрока (k)= " + k + "\nЗначение=");
	}
}