package testProject;

import java.util.Scanner;

// HelloWorld class는 코딩의 시작입니다.
public class HelloWorld {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
//    	 System.out.println(7);
//    	 System.out.println(3.15);
//    	 System.out.println("3 + 5 =" + 8);
//    	 System.out.println(3.15 + "는 실수입니다.");
//    	 System.out.println("3 + 5" + "의 연산 결과는 8입니다.");
//    	 System.out.println(3 + 5);
//    	 System.out.println(3 + "+" + 5);
    	
//    	//double 형 변수 num을 생성하고 3.75를 대입해라
//    	double num = 3.75;
//    	//int형 변수 num2를 생성하고 숫자를 하나 입력받아라
//    	int num2 = sc.nextInt();  			
//    	//입력 받은 num2(길이)를 활용하여 1차원 배열 arr을 하나 만들고 모든 수를 5로 초기화한다
//    	int[] arr = new int[num2];
//    	for(int i = 0; i <arr.length; i++)
//    		arr[i] =5;
//    	//arr 배열의 2인덱스 값에 0을 넣어준다.
//    	arr[2] = 0;
//    	//arr 배열을 처음부터 끝까지 아래와 같은 방식으로 출력한다.
//    	//배열 안에 값이 5일때 5출력
//    	//배열 안에 값이 0일때 "5가 아닙니다"
//    	for(int i = 0; i <arr.length; i++) {
//    		if(arr[i] == 5)
//    			System.out.println(5);
//    	}
//    	else
//    		System.out.print("5가 아닙니다.");
   	
//    	int kor, eng, math, total;
//    	float avg;
//    	
//    	System.out.println("국어 :");
//    	kor = sc.nextInt();
//    	System.out.println("영어 :");
//    	eng = sc.nextInt();
//    	System.out.println("수학 :");
//    	math = sc.nextInt();
//    	System.out.println("합계 :");
//    	System.out.println(kor + eng + math);
//    	
//    	
//    	total = kor + eng + math;
//    	avg = ((kor + eng + math)/(float)3);
//    	
//    	if(kor > 50 && eng > 50 && math > 50 && ((kor + eng + math) / (float)3) > 60) {
//    		System.out.println("합격");  		
//    	}
//    	else
//    		System.out.println("불합격");
    	
    	
//    	int num;
//    	while(true) {
//    	System.out.println("1 이상의 숫자를 입력하세요 :");
//    	num = sc.nextInt();
//    	}
//    	
//    	if (num < 1) 
//    		System.out.println("1 이상의 숫자를 입력하세요.");
//    	} else {
//    	for(int i = num; i > 0; i --) {
//    		System.out.print(i + " ");
//    	}
//    	break;
//    }
    	
    	
//    	arr[0][0] = 'T';
//    	arr[0][1] = 'P';
//    	arr[0][2] = 'M';
//    	arr[0][3] = 'B';
//    	
//    	arr[1][0] = 'U';
//    	arr[1][1] = 'I';
//    	arr[1][2] = 'H';
//    	arr[1][3] = 'S';
//    	
//    	arr[2][0] = 'Q';
//    	arr[2][1] = 'M';
//    	arr[2][2] = 'B';
//    	arr[2][3] = 'H';
//    	
//    	arr[3][0] = 'H';
//    	arr[3][1] = 'B';
//    	arr[3][2] = 'I';
//    	arr[3][3] = 'X';
//    	
//    	arr[4][0] = 'G';
//    	arr[4][1] = 'F';
//    	arr[4][2] = 'X';
//    	arr[4][3] = 'I';
//    	int row, col;
//    	do
//    	System.out.print("행의 크기((1~10)를 입력하세요 :	");
//    	row = sc.nextInt();
//    	
//    	if (row < 1  || row > 10)
//    		System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
//    	while(row < 1 || row > 10);
//    	
//    	do {
//    		System.out.print("열의 크기(1~10)를 입력하세요 : ");
//    		col = sc.nextInt();
//    		
//    		if (col < 1 || col > 10)
//    			System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다."	);
//    	} while(col < 1 || col > 10);
//    	
//    	char[][] arr = new char[row][col];
//    	for (int i = 0; i < arr.length; i++) {
//    		for(int j = 0; j < arr[i].length; j++) {
//    			arr[i][j] = (char)(Math.random() * 26 + 65);
//    			
//    		}
//    	
//    		for (int i = 0; i < arr.length; i++) {
//        		for(int j = 0; j < arr[i].length; j++) 
//        			System.out.print(arr[i][j] + " ");
//    		
//    		}
//    		System.out.println();        	
//    	}
    	
    	
//    	String[][] arr = new String[][] {
//    		{"이", "까", "왔", "앞", "힘"},{"차", "지", "습", "으", "냅"},
//    		{"원", "열", "니", "로", "시"},{"배", "심", "다", "좀", "다"},
//    		{"열", "히", "!", "더", "!!"}};
//    	for(int i = 0; i < arr.length; i++) {
//    		for(int j = 0; j < arr[i].length; j++) {
//    			System.out.print(arr[j][i] + " ");
//    		}
//    		System.out.println();
//    	}
    	
    	
    	
    		//////////////////실습문제 7///////////// 	
    	
//    	int row;
//    	System.out.print("행의 크기 :");
//    	row = sc.nextInt();
//    	
//    	char[][] arr = new char[row][];
//    	for(int i = 0; i < arr.length; i++) {
//    		int col;
//    		System.out.print(i + "열의 크기를 입력하세요. :");
//    		col = sc.nextInt();
//    		
//    		arr[i] = new char[col];    		
//    	}
//    	
//    	char al = 'a';
//    	for(int i = 0; i < arr.length; i++) {
//    		for (int j = 0; j < arr[i].length; j++) {
//    			arr[i][j] = al++;
//    			System.out.print(arr[i][j]);
//    		}
//    		System.out.println();
//    	}
    	
    	
    	
    	////////////////////실습문제 8////////////////
    	
//    	String[][] arr1 = new String[2][3];
//    	String[][] arr2 = new String[2][3];
//    	//	===== 1분단 =======
//    	arr1[0][0] = "강건강";
//    	arr1[0][1] = "남나나";
//    	
//    	arr1[1][0] = "도대담";
//    	arr1[1][1] = "류라라";
//    	
//    	arr1[2][0] = "문미미";
//    	arr1[2][1] = "박보배";
//     // ======== 2분단 =======	
//    	arr2[0][0] = "송성실";
//    	arr2[0][1] = "윤예의";
//    	
//    	arr2[1][0] = "진재주";
//    	arr2[1][1] = "차천축";
//    	
//    	arr2[2][0] = "피풍표";
//    	arr2[2][1] = "홍하하";
//    	
//    	for(int i = 0; i < arr1.length; i++) {
//    		for (int j = 0; j < arr2[i].length; j++) {
//    			System.out.println(arr1[i][j] + " ");
//    			System.out.println(arr2[i][j] + " ");
//    		}
//    		System.out.println();
//    	}	
   //////////////////////////////////////////////////// 	
    	// 출석부 1차원 배열 초기화
//    String[] students = {
//    		"강건강", "남나나",
//    		"도대담", "류라라",
//    		"문미미", "박보배",
//    		"송성실", "윤예의",
//    		"진재주", "차천축",
//    		"피풍표", "홍하하"
//    };
//    	
//    String[][] classRoom1 = new String[3][2];
//	String[][] classRoom2 = new String[3][2];
//	
//    int index = 0;	
//	for(int i = 0; i < classRoom1.length; i++) {
//		for (int j = 0; j < classRoom1[i].length; j++) {
//			classRoom1[i][j] = students[index];
//			index += 1;
//		}
//	}
//	
//	
//	for(int i = 0; i < classRoom2.length; i++) {
//		for (int j = 0; j < classRoom2[i].length; j++) {
//			classRoom2[i][j] = students[index];
//			index += 1;
//		}
//	}
//	System.out.println("== 1분단 ==");	
//	for(int i = 0; i < classRoom1.length; i++) {
//		for (int j = 0; j < classRoom1[i].length; j++) {
//			System.out.print(classRoom1[i][j] + " ");
//			
//		}
//		System.out.println();
//	}
//	
//	System.out.println("== 2분단 ==");
//	for(int i = 0; i < classRoom2.length; i++) {
//		for (int j = 0; j < classRoom2[i].length; j++) {
//			System.out.print(classRoom2[i][j] + " ");
//		}
//		System.out.println();
//	}
    	
    	String[] students = {
        		"강건강", "남나나",
        		"도대담", "류라라",
        		"문미미", "박보배",
        		"송성실", "윤예의",
        		"진재주", "차천축",
        		"피풍표", "홍하하"
        };
        	
        String[][] classRoom1 = new String[3][2];
    	String[][] classRoom2 = new String[3][2];
    	
        int index = 0;	
    	for(int i = 0; i < classRoom1.length; i++) {
    		for (int j = 0; j < classRoom1[i].length; j++) {
    			classRoom1[i][j] = students[index];
    			index += 1;
    		}
    	}
    	
    	
    	for(int i = 0; i < classRoom2.length; i++) {
    		for (int j = 0; j < classRoom2[i].length; j++) {
    			classRoom2[i][j] = students[index];
    			index += 1;
    		}
    	}
    	System.out.println("== 1분단 ==");	
    	for(int i = 0; i < classRoom1.length; i++) {
    		for (int j = 0; j < classRoom1[i].length; j++) {
    			System.out.print(classRoom1[i][j] + " ");
    			
    		}
    		System.out.println();
    	}
    	
    	System.out.println("== 2분단 ==");
    	for(int i = 0; i < classRoom2.length; i++) {
    		for (int j = 0; j < classRoom2[i].length; j++) {
    			System.out.print(classRoom2[i][j] + " ");
    		}
    		System.out.println();
    	}
    	
    	System.out.println("검색할 학생 이름을 입력하세요 :");
    	String target = sc.next();
    	int bundan = 0, line = 0, isRight = 0;
    	boolean isTrue = false;
    	
    	for(int i = 0; i < classRoom1.length && !isTrue; i++) {
    		for (int j = 0; j < classRoom1[i].length && !isTrue; j++) {
    			if(classRoom1[i][j].equals(target)) {
    				bundan = 1;
    				line = i;
    				isRight = j;
    				isTrue = true;
    			}
    		}
    		
    	}
    	if (!isTrue)
    	for(int i = 0; i < classRoom2.length && !isTrue; i++) {
    		for (int j = 0; j < classRoom2[i].length &&!isTrue; j++) {
    			if(classRoom2[i][j].equals(target)) {
    				bundan = 2;
    				line = i;
    				isRight = j;
    				isTrue = true;
    			}
    		}    	
    	}
    	if (isTrue) {
    		System.out.print("검색하신 " + target + " 학생은 " + bundan + " 분단 " + (line == 0 ? ("첫번째") :  (line == 1 ? ("두번째") : ("세번째")	) +" 줄"+" " +(isRight == 0 ? "왼쪽" : "오른쪽")+ "에 있습니다."));
    	} else {
    		System.out.print("검색하신 " + target + " 학생은 찾지 못했습니다.");
    	
    	}
    }
}
