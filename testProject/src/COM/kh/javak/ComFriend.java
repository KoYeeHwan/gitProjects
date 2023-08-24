package COM.kh.javak;

public class ComFriend {
	private String name;
	private String department;
	private String phone;
	
	public ComFriend
		(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + department);
		System.out.println("전화: " + phone);
	} 
}
