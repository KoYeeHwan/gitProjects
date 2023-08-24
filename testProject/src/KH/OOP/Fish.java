package KH.OOP;

public class Fish extends Animal implements Swimmable{
	
	public Fish(String name, int age) {
		super(name, age);
	}

	@Override
	public void swim() {
		System.out.println(this.name + "는 물을 헤엄친다.");
	}

	@Override
	public void makeSound() {
		System.out.println(this.name + "이 물에서 울고있습니다.");
	}

}
