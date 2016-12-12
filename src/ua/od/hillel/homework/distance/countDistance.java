package ua.od.hillel.homework.distance;

public class countDistance{
	
	public static void main(String[] args){
		Distance distance = new Distance();
		System.out.println("The train has traveled "+distance.findDistance()+" km");
        distance.setSpeed(55);
        distance.setTime(5);
        System.out.println("The train has traveled "+distance.findDistance()+" km");
        System.out.println("The train has traveled "+distance.findDistance(45, 7)+" km");
        System.out.println("The train has traveled "+distance.findDistance(-5,7)+" km");
	}

}

