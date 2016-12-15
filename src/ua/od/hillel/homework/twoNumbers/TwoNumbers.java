package ua.od.hillel.homework.twoNumbers;

public class TwoNumbers{
	public static void main (String... args){
		if (args.length != 2) {
            System.out.println("You should enter two numbers for this task");
            return;
        }
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
		if(divisor==0) {
			System.out.println("You can't divide by 0");
			return;
		}
        if (dividend % divisor == 0) {
            System.out.println("The number " + dividend + " can be divided by " + divisor);
        } else {
            System.out.println("The number " + dividend + " can't be divided by " + divisor);
        }
	}
}