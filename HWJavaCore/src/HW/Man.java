package HW;

public class Man {
	static String name;
	static int age;
	static String sex;
	static Double weight;

	public Man() {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.weight = weight;
	}

	public String getName(String name) {
		System.out.println("Назовите ваше имя");
		return name;
	}

	public int getAge(int age) {
		System.out.println("Назовите ваш возвраст?");
		return age;
	}

	public String getSex(String sex) {
		System.out.println("Назовите ваш пол?");
		return sex;
	}

	public Double getWeight(double weight) {
		System.out.println("Назовите ваш вес?");
		return weight;
	}

	public static void main(String[] args) {
		final Man man1 = new Man();
		final String s1 = man1.getName("Миша");
		System.out.println("Меня зовут" + " " + s1);
		final int s2 = man1.getAge(23);
		System.out.println("Мне" + " " + s2 + " " + "года");
		final String s3 = man1.getSex("мужского");
		System.out.println("Я" + " " + s3 + " " + "пола");
		final Double s4 = man1.getWeight(78.5);
		System.out.println("Я вешу" + " " + s4 + " " + "килограмм");

	}

}
