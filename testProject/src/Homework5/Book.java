package Homework5;

public class Book {
	private int code;
	private String title;
	private String author;
	
	public Book(int code, String title, String author) {
		this.code = code;
		this.title = title;
		this.author = author;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return 
	}
	
	
	//메인메서드에서 Book객체를 10개 담을 수 있는 Book형 배열 BookList를 만들고
	//10개의 Book을 생성해서 저장해라
	//BookList의 모든 Book의 toString 메서드를 호출하여 저장이 잘 되었는지 확인해보자
}
