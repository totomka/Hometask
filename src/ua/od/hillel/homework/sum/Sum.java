package ua.od.hillel.homework.sum;

public class Sum{
	public static void main(String [] args){
		int var = 1111; 
		countPrintSum(var);
		var=5678;
		countPrintSum(var);
		var=9000;
		countPrintSum(var);
		var=-9000;
		countPrintSum(var);
	}
	
	public static void countPrintSum(int number){
		String string = Integer.toString(Math.abs(number)); 
		int sum = Character.getNumericValue(string.charAt(0)) + Character.getNumericValue(string.charAt(1)) + Character.getNumericValue(string.charAt(2)) 
		+ Character.getNumericValue(string.charAt(3)); 
		System.out.println("The sum of digits of the number "+number+" is "+sum);
	}
}