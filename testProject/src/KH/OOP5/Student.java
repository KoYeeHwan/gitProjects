package KH.OOP5;

public class Student extends Human implements Swimmable, sleepable{
	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void sleep() {
		System.out.println(this.name + "님은 잠을 잡니다");		
	}

	@Override
	public void swim() {
		System.out.println(this.name + "님은 수영을 합니다");		
	}

	@Override
	public void makeSound() {
		System.out.println("저는" + this.name +"이고" + this.age + "살 입니다");		
	}
	
	
}
