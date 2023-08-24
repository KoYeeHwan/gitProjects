package testProject;

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double height, weight, bmi;
		height = sc.nextDouble();
		weight = sc.nextDouble();
		
		bmi = (weight / (height * height));
		
		System.out.print("BMI 지수 :" + bmi);
		
		System.out.print("키(m)를 입력해 주세요(m) :");
		System.out.print("몸무게(kg)를 입력해 주세요(kg) :");
		
		if(bmi < 18.5)
			System.out.print("저체중");
		 else if(23 > bmi && bmi >= 18.5) 
			System.out.print("정상체중");
		 else if(25 > bmi && bmi >= 23)   
			System.out.print("과체중");
		 else if(30 > bmi && bmi >= 25)  
			System.out.print("비만");
		 else                            
			System.out.print("고도비만");  
	}	

}
