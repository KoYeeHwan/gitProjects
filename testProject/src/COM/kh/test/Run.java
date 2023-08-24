package COM.kh.test;

public class Run {
	public static void main(String[] args) {				
		Food Apple = new Food("사과", 20);
	}
}
////////////////////////////////////////////////////////////
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person();
		pArr[1] = new Person();
		pArr[2] = new Person();
		
		for (int i = 0; i < pArr.length; i++) {
				System.out.println(pArr[i].getName());
		}
/////////////////////////////////////////////////////////////
		
	public static void main(String[] args) {
		try {
			int a = "?";
		}catch(Exception e) {
			System.out.print("?");
			e.printStackTrace();
		}
	}