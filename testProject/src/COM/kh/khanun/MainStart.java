package COM.kh.khanun;

public class MainStart {
	public static void main(String[] args) {
		Dog happy = new Dog("강아지", 5, "순이"); 
		happy.makeSound();
		
		Cat navi = new Cat("고양이", 10, "암컷");
		navi.makeSound();
	}
}
