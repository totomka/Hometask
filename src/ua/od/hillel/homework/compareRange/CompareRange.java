package ua.od.hillel.homework.compareRange;

public class CompareRange{
	public static void main (String... args){
		if (args.length != 2) {
        System.out.println("You should enter two numbers for this task");
        return;
        }
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
		if(firstNumber==secondNumber){
			System.out.println("The numbers are equal");
			return;
		}
		if(Math.abs(firstNumber - 10) == Math.abs(secondNumber - 10)){
				System.out.println("The range between the numbers and 10 is equal");
				return;
			}
		if (firstNumber == 10) {
                System.out.println("The first number is 10");
				return;
		}
		if (secondNumber == 10) {
            System.out.println("The second number is 10");
			return;
        }
		if (Math.abs(firstNumber - 10) < Math.abs(secondNumber - 10)){
			System.out.println("The range between the number " + firstNumber + " and 10 is smaller than between " + secondNumber + " and 10");
		}
		else {
			System.out.println("The range between the number " + secondNumber + " and 10 is smaller than between " + firstNumber + " and 10");
		}
	}
}