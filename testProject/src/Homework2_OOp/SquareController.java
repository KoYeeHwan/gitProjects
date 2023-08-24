package Homework2_OOp;

public class SquareController {
	Shape s = new Shape();
	// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 둘레 반환
	// 둘레: 너비*2 + 높이*2
	double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width, s.getColor());
		return s.getHeight() * 2 + s.getWidth() * 2;
	}
	// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 넓이 반환
	// 넓이 : 너비 * 높이
	double calcArea(double height, double width) {
		s = new Shape(4, height, width, s.getColor());
		return s.getHeight() * s.getWidth();
	}
	// setter를 이용해 받아온 매개변수로 값 변경
	public void paintColor(String Color) {
		s.setColor(Color);
	}
	// 어떤 모양인지와 Shape의 information()메소드의 반환 값 합쳐 함께 반환
	public String print() {
		return "사각형\n" + s.information();
	}
}
