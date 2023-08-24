package COM.kh.extend;

public class Man {
	String name;
	
	public Man() {
		System.out.println("Man 생성");
	}
	
	public Man(String name) {
		System.out.println("name 넘겨받아 Man 생성");
	}
	public BusinessMan(String company, String position, String name) {
			this.company = company;
	}
	public void tellYourName() {
		System.out.print("My name is" + this.name);
	
	}	
}
