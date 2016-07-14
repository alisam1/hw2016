package HW;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class ALHW02 {

	public static void main(String[] args) {
		final ArrayList<String> states = new ArrayList<String>();
		final TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(1, "ArgumentsExample.java");
		tMap.put(2, "Autopack.java");
		tMap.put(3, "BigExample.java");
		tMap.put(4, "BitOperations.java");
		tMap.put(5, "CharsTest.java");
		tMap.put(6, "ClassExample.java");
		tMap.put(7, "CoverClasses.java");
		tMap.put(8, "DataTypes.java");
		tMap.put(9, "Import.java");
		tMap.put(10, "InstanceOf.java");
		tMap.put(11, "LogicOperations.java");
		tMap.put(12, "Main.java");
		tMap.put(13, "Operators.java");
		tMap.put(14, "StringTransformation.java");
		tMap.put(15, "UnaryOperators.java");
		System.out.println("Keys of tree map: " + tMap.keySet());
		System.out.println("Values of tree map: " + tMap.values());
		final Scanner in = new Scanner(System.in);
		System.out.print("Введите ключ: ");
		final int key = in.nextInt();
		if (key == 1) {
			System.out.println("ArgumentsExample.java");
		} else if (key == 2) {
			System.out.println("Autopack.java");
		} else if (key == 3) {
			System.out.println("BigExample.java");
		} else if (key == 4) {
			System.out.println("BitOperations.java");
		} else if (key == 5) {
			System.out.println("CharsTest.java");
		} else if (key == 6) {
			System.out.println("ClassExample.java");
		} else if (key == 7) {
			System.out.println("CoverClasses.java");
		} else if (key == 8) {
			System.out.println("DataTypes.java");
		} else if (key == 9) {
			System.out.println("Import.java");
		} else if (key == 10) {
			System.out.println("InstanceOf.java");
		} else if (key == 11) {
			System.out.println("LogicOperations.java");
		} else if (key == 12) {
			System.out.println("Main.java");
		} else if (key == 13) {
			System.out.println("Operators.java");
		} else if (key == 14) {
			System.out.println("StringTransformation.java");
		} else if (key == 15) {
			System.out.println("UnaryOperators.java");
		} else if (key < 1 || key > 7) {
			System.out.println("Error");
		} else {
			System.out.println("Quit");
		}
	}
}