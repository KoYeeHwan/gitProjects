package COM.kh.test;

import Homework4_Inheritance.Person;

public class Test1 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}
}
