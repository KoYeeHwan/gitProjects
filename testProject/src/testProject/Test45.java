package testProject;

import java.util.Arrays;
import java.util.Scanner;
	//////////////// 배열 실습문제 14/////////////////////
	// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
	// 1~ 45번 난수 생성
public class Test45 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[] arr = new int[6];
//		int i = 0;
//		while (i < arr.length) {
//			// 난수 입력받기
//			int nan = (int)(Math.random() * 45 + 1);
//			// 난수 검사
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}	
//				if (nan == 0)
//					continue;
//				else {
//					arr[i] = nan;
//					i++;
//				}
//			}	
		
		
//			for( int i = 0; i < arr.length; i++) {
//				arr[i] = (int)(Math.random() * 45 + 1);
//				for (int j = 0; j < i; j++) {
//					if (arr[i] == arr[j]) {
//						i--;
//						break;
//					}
//				}
//			}
//			Arrays.sort(arr);
//			
//			for (int = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
		
		//////////배열 실습문제 15///////////////
//		   String str;
//		   char[] strArray;
//		   
//		   System.out.print("문자열 :");
//		   str = sc.next();
//		   // application
//		   
//		   strArray = new char[str.length()]; 
//		   
//		   int i = 0, j = 0;
//		   while(i < str.length()) {
//			   strArray[j] = str.charAt(i);
//			   //중복검사
//			   for(int k = 0; k < j; k++) {
//				   if(strArray[j] == strArray[k]) {
//					   j--;
//					   break;
//				   }
//			   }
//			   i++;
//			   j++;
//		   }
//		   System.out.print("문자열에 있는 문자 : ");				 		  	
//		   for (int h = 0; h < strArray.length; h++) {
//			   if(strArray[h+1] == 0) {
//				   System.out.println(strArray[h]);
//				   System.out.print("문자 개수 : " + (h + 1));
//				   break;
//			   }else
//				   System.out.print(strArray[h] + ", ");			   
//		   }
	
		
		////////// 배열 실습문제 16 ///////////////////
		int num;
		String[] strArray1, strArray2;		
		
		System.out.print("배열의 크기를 입력하세요 :");
		num = sc.nextInt();
		sc.nextLine();
		
		strArray1 = new String[num];
		int i = 0;
		while(true) {
			
			// 문자열을 입력 받는 부분
			for(; i < strArray1.length; i++) {
				System.out.print((i + 1) +"번째 문자열 : ");
				strArray1[i] = sc.nextLine();
			}
		
			// 더 입력 할지 안할지 확인부분
			System.out.print("더 값을 입력하시겠습니까?(Y/N): " );
			
			//더 입력하겠다.
			if ('Y' == sc.next().charAt(0)) {
				System.out.println("더 입력하고 싶은 개수 :");
				num =sc.nextInt();
				sc.nextLine();
				strArray2 = new String[strArray1.length +num];
				
				for (i = 0; i < strArray1.length; i++) {
					strArray2[i] = strArray1[i];
				}
				strArray1 = strArray2;
				// 배열 추가로 크게 생성해주고
				//복제
			}else {  // 그만 입력하겠다.
				System.out.print("[");
				for ( i = 0; i < strArray1.length; i++) {
					if (i == strArray1.length - 1) 
							System.out.print(strArray1[i] + "]");
					else
							System.out.print(strArray1[i] + ",");
					
				}
				break;								
			}
		}		
	}
}
