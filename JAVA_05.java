package practice;

import java.util.Scanner;

public class JAVA_05 {

//	제어문
//	프로그램 실행 코드의 흐름을 제어하는 구문
//	조건문: 조건에 따른 실행 흐름 분기
//	반복문: 조건에 따른 특정 영역의 코드를 반복
//
//	FOR 구문
//	유사하거나 동일한 동작을 지정한 횟수만큼 반복할 때 사용
//	배열이나 컬렉션을 다룰 때 while문과 함께 많이 사용
//
//	for(식1;식2;식3)
//	실행문;
//
//	for(식1;식2;식3){
//	실행문;
//	실행문;
//}
	
//	증감식(++, --, +=, -=)
	
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				sum = i * j;
//				System.out.printf("%d*%d=%d ",i,j,sum);	
////				System.out.printf("%d*%d=%d\n",i,j,sum);	
//				
//			}
//		}
//	}
	
//	public static void main(String[] args) {
		// 1부터 100까지 합을 구하시오
//		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//			System.out.println(sum);
//		}
		// 1부터 100까지 말해봐
//		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
//		}
//	}
//	public static void main(String[] args) {
//	int dan = 10;
//	for(int n1 = 2; n1 <= dan; n1++) {
//		System.out.println(n1 + "단!");
//		for(int n2 = 1; n2 <= 19; n2++) {
//			System.out.println(n1 + "*" + n2 + "=" +(n1*n2));
//		}
//		System.out.println();
//	}
//	System.out.println("===================");
//	for(int n1 = 1; n1 <= 9; n1++) {
//	    for(int n2 = 2; n2 <= 9; n2++) {
//	        System.out.print(n2 + "*" + n1 + "=" + (n1*n2));
//	        System.out.print("\t"); //탭문자
//	    }
//	    System.out.println();
//	    
//	}
	
//	for문 별 만들기
	
//		1) 첫 for문 별 만들기 my
//		for (int i = 0; i <= 6; i++) {
//			System.out.print("*\n");
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
		
//		2) *****
//		하나의 문자 출력을 for문으로 반복해서 해당 모양을 출력하세요.
//		for (int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
		/*
		 * 	*****
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 */
		
//		for(int i = 0; i <= 5; i++) {
//			System.out.println("*****");
//		}
			
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
	public static void main(String[] args) {
//		int start = 1;
//		for(int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(start);
//			}
//			start++;
//		}
		
//		별 찍기
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String str = "*";
		String sum = "";
		for(int i = 0; i < number; i++) {
			System.out.println(sum+=str);
		}
	}	
}
