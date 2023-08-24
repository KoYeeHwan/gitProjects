package KH.OOP4;

public class Car {
	private String color;
	private String type;
	private float speed;
	
	public String getColor() {
		return this.color;
	}
	
	public String getType() {
		return this.type;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	
	public void setColor(String color) {
		this.color =color;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return this.color + " " + this.type + " " + this.speed;
	}
	
	
}
