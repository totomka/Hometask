package ua.od.hillel.homework.findMinMax;

import java.util.Arrays;

public class FindMinMax{
	public static void main(String... args) {
        if (args.length == 3) {
			int [] arguments = new int[]{Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2])};
            Arrays.sort(arguments);
            if (arguments[0] != arguments[2]) {
                System.out.println("Minimum number = " + arguments[0]);
                System.out.println("Maximum number = " + arguments[2]);
            } else {
                System.out.println("All three numbers have the same value. Value = " + arguments[0]);
            }
        } else {
            System.out.println("There should be three numbers to do this task");
        }
    }
}