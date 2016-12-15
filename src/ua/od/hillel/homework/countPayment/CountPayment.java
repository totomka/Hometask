package ua.od.hillel.homework.countPayment;

public class CountPayment{
	public static void main(String[] args){
		if (args.length == 0) {
            System.out.println("You should enter the number of days for this task");
            return;
        }
        int days = Integer.parseInt(args[0]);
		int totalPayment = 40 * days;
        int payment = days >= 7 ? totalPayment - 50 : days >= 3 ? totalPayment - 20 : totalPayment;
		System.out.println("Payment will be "+ payment);
	}
}