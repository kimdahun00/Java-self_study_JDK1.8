package practice;
// 객체 지향 프로그래밍
// 현실세계를 modeling하여 컴퓨터 프로그램으로 나타내는 개념
// 현실의 모든 사물을 컴퓨터 로 표현하기 위한 프로그래밍 방식
// ex) 설계도에 맞추어 물건을 만들어 내는 방식
// <설계도> Instance <실체>

//	OOP 개념
//	객체 지향에서의 프로그래밍 개념
//	캡슐화(은닉화)
//	관련 있는 속성(data)과 기능(method)을 하나(class)로 관리하는 것
//	class내부에서 처리되는 일은 외부에서 알 수 없음(사용 방법만 공개)
//	
//	상속
//	이전에 만들어 놓은 설계도에 기능을 추가하는 것
//	코드의 재사용성 및 신뢰성 증가

//	추상화
//	특정한 모양이 정해지지 않은 것
//	추상적인 것을 여러 형태로 정의하여 사용이 가능한 특성
//	
//	다형성
//	하나의 형태가 여러 형태로 만들어 지고 사용될 수 있는 특성
//  Overloading, Overriding 등




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
//		Point_JAVA_08 pos1 = new Point_JAVA_08(); // 디폴트 생성자
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


