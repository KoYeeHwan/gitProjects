package BookClass;

public class Book {
//	1. 우리는 도서관에서 책을 관리하는 프로그램을 만든다고 가정한다.
//	해당 클레스는 도서관에 책을 등록할 때 사용하는 book객체를 생성할 Book Class이다. 
//	필요하다고 생각하는 데이터와 기능을 구현하고 이를 활용해 보자.
//	class Book{
	//필드
	private String novel;
	private String Sf;
	private String history;
	
	//생성자
	public Book(String novel, String Sf, String history) {
		this.novel = novel;
		this.Sf = Sf;
		this.history = history;
	}
	
	//매서드
	public String getNovel() {
		return this.novel;
	}
	
	public String getSF() {
		return this.Sf;
	}
	
	public String getHistory() {
		return this.history;
	}
	
	public void setNovel(String novel) {
		this.novel = novel;
	}
	
	public void setSF(String Sf) {
		this.Sf = Sf;
	}
	
	public void setHistory(String history) {
		this.history = history;
	}
	
	public String toString() {
		String str = this.novel + "\t" + this.Sf + "\t" + this.history;
		return str;
	}
//	2. main문에서 Book Class의 객체배열을 생성하고
//	이를 활용하여 도서를 등록, 삭제, 전체 도서목록 조회, 검색하는 기능을 구현해 보아라
}
