package ua.od.hillel.homework.distance;

public class Distance{
	int speed;
	int time;
	
	public Distance(){
		this(0,0);
	}
	public Distance(int speed, int time){
		setSpeed(speed);
		setTime(time);
	}

	public void setSpeed(int speed){
		if(speed>0) this.speed=speed;
                else this.speed=0;
	}
	public void setTime(int time){
		if(time>0) this.time=time;
                else this.time=0;
	}
	public int findDistance(int speed, int time){
		setSpeed(speed);
		setTime(time);
		return this.speed*this.time;
	}
	
	public int findDistance(){
		return speed*time;
	}
}