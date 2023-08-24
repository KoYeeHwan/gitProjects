package Phone;

public class SmartPhone {
	private String androiddver;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in" + androidVer);
	}
}
