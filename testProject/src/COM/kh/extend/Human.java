package COM.kh.extend;

public class Human {
	//필드대이터
	//이름, 성별, 나이, 몸무게(소수점 포함)
	private String name;
	private String gender;
	private int age;
	private float weight;
	//전체 데이터 초기화 하는 생성자
	public Human(String name, String gender, int age, float weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public float getWeight() {
		return weight;
	}
	//setter
	public void setName(String name) {
		this.name =name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	//toString
	public String toString() {
		String str = this.name + "\t" + this.gender + "\t" + this.age + "\n" + this.weight;
		return str;
	}
	
}
