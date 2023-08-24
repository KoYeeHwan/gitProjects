package KH.OOP6;

public class BoxFactory {
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();		// 상자를 생성하고,
		box.set(o);		// 전달된 인스턴스를 상자에 담어서,
		return box;		// 상자를 반환한다.
	}
	
	Box<String> sBox = BoxFactory.makeBox("Sweet");
	Box<Double> dBox = BoxFactory.makeBox(7.59);	// 7.59에 대해 오토 박싱 진행됨
}
