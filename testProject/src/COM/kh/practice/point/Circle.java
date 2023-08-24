package COM.kh.practice.point;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
		super();
		this.radius = 0;
	}
	
	public Circle(int radus, int x, int y) {
		super(x, y);
		this.radius = radius;
	}
	
	public int getRadus() {
		return radius;
	}
	
	public void setRadus(int radus) {
		this.radius =radus;
	}
	
	@Override
	public String toString() {		 
		return super.toString() + ", " + radius;
	}
}
