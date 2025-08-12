package practice;

import java.util.Scanner;

public class JAVA_06 {
	public static void main(String[] args) {

//		반복문: 조건에 따른 특정 영역의 코드를 반복
//		
//		While문
//		
//		프로그램 코드의 특정 부분을 반복하여 수행
//		
//		조건이 참이면 실행하고 다시 조건을 확인
//		
//		while(논리형 조건식){
//		  실행문;
//		  실행문;
//		  ......
//		  실행문;
//		}
		
//		do~while 구문
//		반복할 내용을 먼저 실행 후 조건식을 판단한다
//		최소 한번은 내용이 실행한다
		
//		do{
//			  실행문;
//			  실행문;
//			  ......
//			  실행문;
//			} while(논리형 조건식);
		
//		문제
//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//		입력
//		입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		입력의 마지막에는 0 두 개가 들어온다.
//
//		출력
//		각 테스트 케이스마다 A+B를 출력한다.		
		
//		Scanner sc = new Scanner(System.in);
//        int A, B;
//        
//        do {
//            A = sc.nextInt();
//            B = sc.nextInt();
//            
//            if (A == 0 && B == 0) {
//                break;
//            }
//            
//            System.out.println(A + B);
//        } while (true);
//        
//        sc.close();
//    }
		
//	실습문제
//		하나의 수를 입력 받아 n!을 구하라
//		규칙 1*2*3*4*5*6...*n
		
//		Ex)		입력 : 4
//				출력 : 4!은 24이다
	    Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int number = sc.nextInt();

        int result = 1; // 곱셈이니까 1부터 시작
        for (int i = 1; i <= number; i++) {
            result *= i; // result = result * i
        }

        System.out.printf("%d!은 %d이다", number, result);
    }
}
		
		
//	네 코드 문제점
//	반복문의 조건이 틀림
//	
//	for (int i = number; 10 >= number; i++)
//	이건 i가 아니라 number를 계속 비교하고 있어서 반복이 제대로 안 돼.
//	
//	그리고 10 >= number 이런 식이면, 입력값이 10보다 작으면 무한 루프에 들어가거나 이상하게 작동해.
//	
//	원하는 건 i가 1부터 number까지 증가하는 거야.
//	
//	곱셈 로직이 틀림
//	
//	sum = i * i;
//	이렇게 하면 매번 i의 제곱만 계산됨.
//	
//	팩토리얼은 이전 결과에 i를 계속 곱해 가야 해.
//	
//	예:
//	1단계 → 1
//	2단계 → 1×2
//	3단계 → (1×2)×3
//	4단계 → (1×2×3)×4
//	
//	2. 올바른 팩토리얼 계산 방식
//	팩토리얼의 기본 공식:
//	
//	n! = 1 × 2 × 3 × ... × n
//	코드로 바꾸면 이렇게 돼:
//	
//	import java.util.Scanner;
//	
//	public class FactorialExample {
//	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        System.out.print("숫자 입력: ");
//	        int number = sc.nextInt();
//	
//	        int result = 1; // 곱셈이니까 1부터 시작
//	        for (int i = 1; i <= number; i++) {
//	            result *= i; // result = result * i
//	        }
//	
//	        System.out.printf("%d!은 %d이다", number, result);
//	    }
//	}

//	3. 이 코드가 동작하는 과정 (예: 4 입력)
//	초기값
//	result = 1
//	
//	첫 번째 반복 (i=1)
//	result = 1 × 1 = 1
//	
//	두 번째 반복 (i=2)
//	result = 1 × 2 = 2
//	
//	세 번째 반복 (i=3)
//	result = 2 × 3 = 6
//	
//	네 번째 반복 (i=4)
//	result = 6 × 4 = 24
//	
//	출력:
//	
//	4!은 24이다
//	네가 헷갈린 "순서대로 곱해져야 한다"는 건
//	이전까지의 곱에 이번 수를 곱하는 방식으로 result *= i를 쓰면 해결돼.















		
		
		
