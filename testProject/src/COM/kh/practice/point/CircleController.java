package COM.kh.practice.point;

public class CircleController {
	private Circle c = new Circle();
	public String calcArea(int radius, int x, int y) {
		
		// c. setX(x);
		// c. setY(y);
		// c. setRadius(radius);
		
		// double circum = 2 * Math.PI * radius;
		// return "둘레 = " + c.toString() + "/" + circum;
		
		
		c = new Circle (radius, x, y); 
			return ""+ Math.PI * c.getRadus() * c.getRadus();
		
	}
	
	public String calcCircum(int radius, int x, int y) {
		
		// c. setX(x);
		// c. setY(y);
		// c. setRadius(radius);
		
		// double area = Math.PI * radius * radius;
		// return "면적 :" + c.toString() + " / " + area;
		
		c = new Circle (radius, x, y);
		 	return ""+ Math.PI * c.getRadus() * 2;
		 	
	}
}
