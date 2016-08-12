package HW;

class Student extends Man {

	static int yearOfEducation;
	static int numberCourse;

	public Student() {
		super();
		return;
	}

	public int getYear(int yearOfEducation) {
		System.out.println("На каком курсе вы учитесь?");
		return yearOfEducation;
	}

	public int getCourse(int yearOfEducation, int numberCourse) {
		System.out.println("На каком курсе вы будете учиться в следующем году?");
		numberCourse = yearOfEducation + 1;
		return numberCourse;
	}

	public static void main(String[] args) {
		final Student student1 = new Student();
		final int s5 = student1.getYear(3);
		System.out.println("Я учусь на" + " " + s5 + " " + "курсе");

	}

}
