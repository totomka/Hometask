package ua.od.hillel.homework.triangle;
import java.util.*;

public class Triangle{
	int sideA;
	int sideB;	
	
	void setA(int a){
		if(a>0) sideA=a;		
	}
	
	void setB(int b){
		if(b>0) sideB=b;
	}
	
	public void askUser(){
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter side A, it should be a positive number :");
		setA(reader.nextInt());
		System.out.println("Enter side B, it should be a positive number:");
		setB(reader.nextInt());
	}
	
	public int countSideC(){
		return (int)Math.sqrt(sideA*sideA+sideB*sideB);
	}
	
	public void countSquare(){
		int s=sideA*sideB/2;
		if (sideA>0&&sideB>0)
		System.out.println("The Square of the triangle with side a = "+sideA+" and side b = "+sideB+" is "+ s);
	else System.out.println("It is impossible to count the square");
	}
	
	public void countPerimeter(){
		int p=sideA+sideB+countSideC();
		if (sideA!=0&&sideB!=0) System.out.println("The perimeter of the triangle with side a = "+sideA+" and side b = "+sideB+" is "+ p);
		else System.out.println("It is impossible to count the perimeter");
	}
	
}