package KH.OOP6;

public class XBOX<T extends Eatable>{
	T ob;
	
	public void set(T o) { ob = o; }
	public T get() {
		System.out.println(ob.eat());  //Eatable로 제한하였기에 eat 호출 가능
		return ob;
	}
}
