package practice;
// ��ü ���� ���α׷���
// ���Ǽ��踦 modeling�Ͽ� ��ǻ�� ���α׷����� ��Ÿ���� ����
// ������ ��� �繰�� ��ǻ�� �� ǥ���ϱ� ���� ���α׷��� ���
// ex) ���赵�� ���߾� ������ ����� ���� ���
// <���赵> Instance <��ü>

//	OOP ����
//	��ü ���⿡���� ���α׷��� ����
//	ĸ��ȭ(����ȭ)
//	���� �ִ� �Ӽ�(data)�� ���(method)�� �ϳ�(class)�� �����ϴ� ��
//	class���ο��� ó���Ǵ� ���� �ܺο��� �� �� ����(��� ����� ����)
//	
//	���
//	������ ����� ���� ���赵�� ����� �߰��ϴ� ��
//	�ڵ��� ���뼺 �� �ŷڼ� ����

//	�߻�ȭ
//	Ư���� ����� �������� ���� ��
//	�߻����� ���� ���� ���·� �����Ͽ� ����� ������ Ư��
//	
//	������
//	�ϳ��� ���°� ���� ���·� ����� ���� ���� �� �ִ� Ư��
//  Overloading, Overriding ��




public class JAVA_08 {
//	public static void main(String[] args) {
//		Point pos1 = new Point();
//		pos1.x = 100;
//		pos1.y = 200;
//		System.out.println(pos1.pointToString());
//		Point pos2 = new Point();
//		pos2.x = 300;
//		pos2.y = 400;
//		System.out.println(pos2.pointToString());
//	}
	
//	public static void main(String[] args) {
//		Point_JAVA_08 pos1 = new Point_JAVA_08(); // ����Ʈ ������
//		System.out.println(pos1.pointToString()); 
//	}
	
	public static void main(String[] args) {
		Point_JAVA_08 pos1 = new Point_JAVA_08();
		System.out.println(pos1.pointToString());
		
		Point_JAVA_08 pos2 = new Point_JAVA_08(10, 20);
		System.out.println(pos2.pointToString());
		
		String str1 = new String();
		String str2 = new String("hello");
		String str3 = new String(new char[] {'h', 'e', 'l', 'l'});
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}


