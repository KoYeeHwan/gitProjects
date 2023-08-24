package COM.kh.iclass;

import java.util.Scanner;
//접근지정자 class 클레스이름{}
class Product{
	//필드
	//필요한 데이터의 변수를 나열
	private String name; //상품명
	private int price;	//가격
	private int count;	//재고
	private String description;  //상품설명
	
	private final int MAX_COUNT = 50;
	//생성자
	//접근제한자 클레스이름(매개변수){}
	public  Product(String name, int price, String description) {
		this.name = name == null ? "이름없음" : name;
		this.price = price < 0 ? 0 : price;
		this.count = this.MAX_COUNT;
		this.description = description == null ? "-" : description;
	}
	
	// 3가지 기본메서드
	//		getter(필드에 있는 데이터 반환),
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getCount() {
		return this.count;
	}
	public String getDescription() {
		return this.description;
	}
	//		setter(필드에 있는 데이터에 값 대입),
	public void setName(String name) {
		this.name =name == null ? "이름없음" : name;
	}
	public void setPrice(int price) {
		this.price =price < 0 ? 0 : price;
	}
	public void setCount(int count) {
		this.count =count < 0 ? 0 : count;
	}
	public void setDescription(String description) {
		this.description =description == null ? "-" : description;
	}
	//		toString(모든 데이터 정보 String으로 반환)
	
	public String toString() {
		String str = this.name + "\t" +this.price + "\n" + this.description;
		return str;
	}
}	
	////////////////////////////
	//필드(데이터영역)
	//변수를 필요한만큼 생성한다.
//	private String name;
//	private int price;
//	private int count; 
//	
//	//메서드(기능영역)
//	//메서드 작성방법
//	//접근제한자 반환자료형 메서드이름(매개변수){ }
//	
//	//생성자 => 데이터 필드를 초기화 시키기 위해서 생성시에 한번만 호출되는 특수한 메서드
//	// class와 이름이 똑같은 메서드로 반환형을 가지고 있지 않다.
//	//개발자가 직접 만들어주지 않으면 기본생성자는 내부적으로 컴파일러가 만들어 준다.
////	public Product() {
////		
////	}
//	
//	//매개변수에 개수나 타입에 따라서 여러개를 생성할 수 있다.
//	// 단 생성자를 직접 적어주면 기본생성자는 자동생성되지 않는다.
//	public Product(String name, int price, int count) {
//		this.name = name;
//		this.price = price;
//		this.count = count;
//	}
//	//네임값을 세팅하는 기능
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setPrice(int price) {
//		if(price < 0)
//			this.price = 0;
//		else
//			this.price = price;
//	}
//	
//	public void setCount(int count) {
//		if(count < 0)
//			this.count = 0;
//		else
//			this.count = count;
//	}
//	
//	
//	//네임값을 가지고오는 기능
//	//접근제한자 반환자료형 메서드이름(매개변수){ 실행할 코드}
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getPrice() {
//		return this.price;
//	}
//	
//	public int getCount() {
//		return this.count;
//	}
//	
//	public void productInfo() {
//		System.out.println(getName() + " 잔당 " + getPrice() + "원에 " + getCount() + "잔 팝니다");
//	}
//	
//	//제품 가격 두개를 매개변수로 넘겨받아서 합한 값을 리턴해주는 메서드
//	// totalprice
//	
//	//접근제한자 반환자료형 메서드이름(매개변수){ 실행할 코드}
//	public int addPrice(int plusPrice) {
//		int sum = this.price + plusPrice;
//		return sum;
//	}
//}	
	
