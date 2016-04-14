package HomeWorkProject;

public class Task06 {

	public static void main(String[] args) {

		int x = 174;

		while (x != 0) {
			if (x % 2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
			x = x >> 1;
		}
	}
}
