package COM.kh.review;

public class Human {
	private String name;
	private int age;
	private String residentNumber;
	private char gender;	// f -> 여자 m -> 남자
	private Book[] bookList;
	
	// 필드를 전부 초기화 하는 매게변수를 가지고 있는 생성자
	// 생성자 : 객체의 데이터들을 전부 초기화하기 위한 특수목적의 메서드
	// 리턴값을 가지고 있지 않고 객체 생성시 1번만 호출된다.
	// 오버로딩 가능/ 이름은 클래스와 동일하다.
	public Human(String name, int age, String residentNumber, char gender) {
		this.name = name;
		this.age = age;
		this.residentNumber = residentNumber;
		this.gender = gender;
		bookList = new Book[10];
	}
	
	// 오버로딩 : 메서드의 이름이 같아도 매게변수의 개수나, 자료형이 다르면 구분이 가능하다.
	
	public Human(String name, int age) {
		this(name, age, "미입력", 'f');
	}
	
	// getter, setter, toString
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getResidentNumber() {
		return this.residentNumber;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public Book	[] getBookList() {
		return this.bookList;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setResidentNumber(String residentNumber) {
		this.residentNumber = residentNumber;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age;
	}
	
	// 접근제한자 반환형 메서드이름(매게변수) {
	//실행할 코드
	// }
	
	public String getFutureAge() {
		int sum = this.age + 10;
		return "제 10년 후 나이는" + sum + "입니다.";
	}
}

