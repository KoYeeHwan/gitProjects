package objectArray;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public Student() {
    }
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
        return "Name: " + name + ", Subject: " + subject + ", Score: " + score;
    }
}
