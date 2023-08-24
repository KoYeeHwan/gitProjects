package KH.OOP;

// 추상클래스는 일반클래스와 동일하지만
// 추상 메서드를 포함할 수 있어 객체생성이 되지 않는다.
// 상속받아 추상 메서드를 모두 구현해서 사용할 수 있다.

	// Animal 추상클래스 작성
	public abstract class Animal {
		
		// 필드 값 : String name, int age
		protected String name;
		protected int age;
		
		// 필드를 초기화하는 생성자 작성
		public Animal(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// 추상메서드 makeSound : 매게변수와 반환값(리턴값)이 없음
		public abstract void makeSound();
		
		
	}

