package practice;

import java.util.Scanner;

public class JAVA_05 {

//	���
//	���α׷� ���� �ڵ��� �帧�� �����ϴ� ����
//	���ǹ�: ���ǿ� ���� ���� �帧 �б�
//	�ݺ���: ���ǿ� ���� Ư�� ������ �ڵ带 �ݺ�
//
//	FOR ����
//	�����ϰų� ������ ������ ������ Ƚ����ŭ �ݺ��� �� ���
//	�迭�̳� �÷����� �ٷ� �� while���� �Բ� ���� ���
//
//	for(��1;��2;��3)
//	���๮;
//
//	for(��1;��2;��3){
//	���๮;
//	���๮;
//}
	
//	������(++, --, +=, -=)
	
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
		// 1���� 100���� ���� ���Ͻÿ�
//		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//			System.out.println(sum);
//		}
		// 1���� 100���� ���غ�
//		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
//		}
//	}
//	public static void main(String[] args) {
//	int dan = 10;
//	for(int n1 = 2; n1 <= dan; n1++) {
//		System.out.println(n1 + "��!");
//		for(int n2 = 1; n2 <= 19; n2++) {
//			System.out.println(n1 + "*" + n2 + "=" +(n1*n2));
//		}
//		System.out.println();
//	}
//	System.out.println("===================");
//	for(int n1 = 1; n1 <= 9; n1++) {
//	    for(int n2 = 2; n2 <= 9; n2++) {
//	        System.out.print(n2 + "*" + n1 + "=" + (n1*n2));
//	        System.out.print("\t"); //�ǹ���
//	    }
//	    System.out.println();
//	    
//	}
	
//	for�� �� �����
	
//		1) ù for�� �� ����� my
//		for (int i = 0; i <= 6; i++) {
//			System.out.print("*\n");
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
		
//		2) *****
//		�ϳ��� ���� ����� for������ �ݺ��ؼ� �ش� ����� ����ϼ���.
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
		
//		�� ���
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String str = "*";
		String sum = "";
		for(int i = 0; i < number; i++) {
			System.out.println(sum+=str);
		}
	}	
}
