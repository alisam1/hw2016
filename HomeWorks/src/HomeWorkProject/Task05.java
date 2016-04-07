package HomeWorkProject;

import java.util.Arrays;

public class Task05 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: ArgsExample <number>");
			System.exit(0);
		}
   

		String argsList = Arrays.toString(args);

		System.out.println(argsList);

		int x = Integer.parseInt(args[0]);

		if (x == 2) {
			System.out.println("Много");
		} 
		else if (x == 5){
			System.out.println("Мало");
		}
		
		else if (x == 1){
			System.out.println("В самый раз!");
		}
		
		else {
			System.out.println("Уточни!");
		}
		
		}
	}

