package practice;
/*
 * 2���� ��ǥ�� �����ϱ� ���� Ŭ����
 * 	��ü�� �ʱ�ȭ
 * 		�ɹ� �ʵ��� ���� �ʱⰪ�� �������� ������ G.C�� ���� ����Ʈ ������ �ʱ�ȭ ��
 * 		���� �ʱ�ȭ
 * 		��� �ʱ�ȭ
 * 		������ �ʱ�ȭ
 *  �����ڴ� Ŭ���� �̸��� ������ �ɹ� �޼���
 *  �����ڴ� ��ü ���� �� �ݵ�� ȣ��
 *  �����ڰ� �ϳ��� ���ٸ� ������ �����ڸ� �ڵ����� ȣ�� 
 *  �����ڴ� ��ȯ �ڷ����� ����
 *  �����ڴ� �����ε��� ����
 */
//public class Point { ��ü�� �ʱ�ȭ 
//	int x;
//	int y;
//
//	String pointToString() {
//		return "[x="+x+",y="+y+"]";
//	}
//}

public class Point_JAVA_08 {
	int x = -1; // ���� �ʱ�ȭ
	int y = -1;
	{
		System.out.println("�ʱ�ȭ ���");
		x = 1;
		for(int i = x; i < 10; i++) {
			y += x;
		}
	}
	String pointToString() {
		return "[x="+x+",y="+y+"]";
	}
	
	// ������
	Point_JAVA_08(){
		System.out.println("����Ʈ ������");
		x = 0;
		y = 0;
	}
	
	Point_JAVA_08(int n1, int n2){
		System.out.println("�����ε��� ������(int, int)");
		 x = n1;
		 y = n2;
	}
	
	
}

