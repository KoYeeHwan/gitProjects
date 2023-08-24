package COM.kh.practice.point;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		this.height = 0;
		this.width = 0 ;
	}
	
	public Rectangle(int width, int height, int x, int y) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return super.toString()	+ " " + height + " " + width;
	}
}
