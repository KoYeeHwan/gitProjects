package COM.kh.practice.point;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public  String calcArea(int x, int y, int height, int width) {
		r = new Rectangle (x, y, height, width);
			return "" + r.getWidth() * r.getHeight();
	}
	
	public  String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle (x, y, height, width);
			return "" + 2 * (r.getWidth() * r.getHeight());
	}
}
