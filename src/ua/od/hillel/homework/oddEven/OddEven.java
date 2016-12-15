package ua.od.hillel.homework.oddEven;

public class OddEven{
	public static void main(String[] args){
		if (args.length == 0) {
            System.out.println("You should enter a number for this task");
            return;
        }
        int number = Integer.parseInt(args[0]);
        System.out.print("This number is ");
        if (number % 2 == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
	}
}