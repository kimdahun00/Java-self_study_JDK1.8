package practice;
/*
 * 2차원 좌표를 저장하기 위한 클래스
 * 	객체의 초기화
 * 		맴버 필드의 값에 초기값을 지정하지 않으면 G.C를 통해 디폴트 값으로 초기화 됨
 * 		직접 초기화
 * 		블록 초기화
 * 		생성자 초기화
 *  생성자는 클래스 이름과 동일한 맴버 메서드
 *  생성자는 객체 생성 시 반드시 호출
 *  생성자가 하나도 없다면 디폴드 생성자를 자동으로 호출 
 *  생성자는 반환 자료형이 없음
 *  생성자는 오버로딩이 가능
 */
//public class Point { 객체의 초기화 
//	int x;
//	int y;
//
//	String pointToString() {
//		return "[x="+x+",y="+y+"]";
//	}
//}

public class Point_JAVA_08 {
	int x = -1; // 직접 초기화
	int y = -1;
	{
		System.out.println("초기화 블록");
		x = 1;
		for(int i = x; i < 10; i++) {
			y += x;
		}
	}
	String pointToString() {
		return "[x="+x+",y="+y+"]";
	}
	
	// 생성자
	Point_JAVA_08(){
		System.out.println("디폴트 생성자");
		x = 0;
		y = 0;
	}
	
	Point_JAVA_08(int n1, int n2){
		System.out.println("오버로딩된 생성자(int, int)");
		 x = n1;
		 y = n2;
	}
	
	
}

