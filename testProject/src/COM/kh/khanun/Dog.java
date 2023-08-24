package COM.kh.khanun;

public class Dog extends Animal {
	
	
	public Dog(String name, int age, String gender) {
		super(name, age, gender);
	}
	
	public void welcomeHome() {
		System.out.print("꼬리를 흔듭니다");
	}
	
	void makeSound() {
		System.out.print("숨는다");
	}
	
	void makeSound() {
		System.out.println("야옹");
	}
}
