package HomeWorkProject;

public class HumanEmotion {

	String name;
	String profession;
	boolean Sleepy = true;

	public void sleep(String dream) {
		if (Sleepy) {
			System.out.println(profession + " " + name + " " + "хочет" + " " + dream);
			Sleepy = true;
		} else {
			System.out.println(profession + " " + name + " " + "не хочет" + " " + dream);
		}

	}

	public void dance() {
		if (Sleepy) {
			System.out.println(profession + " " + name + " " + "хочет танцевать");
		} else {
			System.out.println(profession + " " + name + " " + "прилег в углу");
			Sleepy = false;
		}

	}

}
