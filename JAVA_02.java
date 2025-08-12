package practice;

public class JAVA_02 {
// 연산자
//	연산자의 우선순위
//
//	최우선연산자 > 단항 연산자 > 산술연산자 > 쉬프트 연산자 > 관계연산자 > 비트연산자
//	> 논리연산자 > 삼항 연산자 > 배정대입연산자 > 증감후위연산자 > 순차연산자
//
//	최우선 연산자   .(점) , [] , ()
//	단항 연산자    ! , ~ , + / - , ++ / -- , (cast 자료형) , instanceof
//	산술 연산자    + , - , * , / , %
//	Shift 연산자   << , >> , >>>
//	관계 연산자    < , > , <= , >= , == , !=
//	비트 연산자    & , | , ^
//	논리 연산자    && , ||
//	삼항 연산자    (조건항) ? 참항 : 거짓항
//	배정 대입 연산자   = , *= , /= , %= , += , -= , <<= , >>= , >>>=
//	증감 후위 연산자   ++ / --
//	순차 연산자    ,(콤마)
	
	
	public static void main(String[] args) {
//최우선연산자 - ".","[]","()"
//    .  : 참조연산자 - 클래스의 맴버를 사용하기 위해 사용함
//   []  : 배열참조연산자? - 배열의 위치 번째를 나타날 때 사용됨
//   ()  : 괄호연산자 - 특성연산자를 묶어 처리할 수 있게 만들어주는 연산자
		
		int x = 5 + 3 * 2;
		int y = (5 + 3) * 2;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
// 단항 연산자 - "!", "~", "+/-", "++/--", "(cast 자료형)", "instanceof"
// ! : 논리부정 - 내용의 반대되는 값을 표현, boolean 자료형에서만 사용 가능

	   boolean bool = false;
	   System.out.println("a = " + bool);
	   System.out.println("b = " + !bool);
	   boolean bool1 = 5 > 3;
	   System.out.println("c = " + bool1);
	   System.out.println("d = " + !(5 > 3));
	   // System.out.println("e = " + !5); // error
	   

// ~ : 비트부정 - 비트단위로 부정을 한후, 2진수 0은 1로, 1은 0으로 바꾸는 작업
// boolean, 실수형자료형에서는 사용 불가
// byte,short,char,int 형은 ~연산후 int형이나 long형에 결과값을 담을수 있고
// long형은 ~연산후 long형에만 담을수 있다.

	System.out.println("a1 = " + ~(~(4)));
	int x1 = +4;
	int y1 = -4;
	int z1 = -4 * -3;
	System.out.println("z1 = " + z1);
	

// +/- : 부호연산자

// ++/-- : 특정필드의 값을 하나 증감시키는 연산자
//   앞쪽에 적히는 경우가 우선순위 2순위인 단항연산이고
//   뒤에 붙으면 우선순위 11위인 증감 연산 후위형에 속한다.
//   int a=5; int k = 4++ +a * 3; k=22, a=6(연산 전 계산)
//   int a=5; int k = 4+ a++ * 3; k=19, a=6(연산 후 계산)
	
//	 int x = 10;
//	 int y = ++x;
//	 System.out.println("x = " + x);
//	 System.out.println("y = " + y);
	
//	(cast 자료형) - ex : int i = 1; byte by = (int) i;
//	단항 연산자라고 알아두자.
//
//		float a = 3.14f;
//		int b = (int)a;
//		//float변수의 값을 형변환(casting)하여 int변수에 저장
//
//		System.out.println(a+"f를 int로 변환한 값 : " + b);
//		실행결과
//		3.14를 int로 변환한 값 : 3
	

//instanceof
//객체의 타입을 비교 하는 연산자로서 우변의 객체와 좌변의 객체의 타입을 비교
//우변과 좌변의 객체의 타입이 서로 같다면 true 그렇지 않다면 false를 반환
//		Exam exam = new Exam();
//		boolean bool = exam instanceof Object;
//		System.out.println("bool = " + bool);

//실행결과
//bool = true
	

//산술연산자 +, -, *, /, %
	
//byte, short, char, int형의 자료형의 연산은 int 형의 자료형으로 나타나며
//long, float, double형의 자료형은 큰 자료형의 결과로 나타난다
//(long<float<double)
//float형과 double형의 연산은 혼용하여 사용하지 않는 것이 좋다.
	
	float f = 1.2f;
	double d = 1.2;
	double d1 = d - f;
	System.out.println(d1);
	
//	시프트연산자 "<<", ">>", ">>>"
//	- 자바프로그램에서 사용하는 기본 메모리는 32비트인데,
//	때때로 메모리 절약을 위해 int형 하나의 데이터에 16비트씩 2개의
//	데이터를 함께 사용하는 경우나, 8비트씩 4개의 데이터를 함께
//	사용하는 경우, 필요한 데이터의 결과값만 꺼내려고 할 때 사용
//
//	대상필드의 값을 2진비트로 바꾼 후 특정 비트 수 만큼 이동시켜 원하는
//	부분의 비트데이터를 얻어내는 연산자
//	boolean형, float형, double형에서는 사용할 수 없다.
//

//a<<b : left shift 연산자
//a의 값을 2진비트로 바꾼 후 왼쪽으로 b비트 수 만큼 이동시키고 빈자리는
//0으로 채우는 연산자
//예) 2<<3
//
//2를 32비트로 분해한 다음 왼쪽으로 3bit 이동시켜라.
//> 2<<3
//
//00000000 00000000 00000000 00000010 2
//000|00000000 00000000 00000000 00010??? 16
//
//앞의 000은 버리고 뒤의 ???는 000으로 채운다.
//결과는 16이다.
//적용 공식 : 원본데이터 * 2^이동변수
	
//	a>>b : right shift 연산자
//	a의 값을 2진비트로 바꾼 후 오른쪽으로 b비트 수 만큼 이동시키고 빈자리는
//	원본 데이터의 값이 양수이면 0을, 음수이면 1을 채우는 연산자
//
//	int a = 16;
//	int b = 3;
//	int c = a >> b;
//
//	00000000 00000000 00000000 00010000 16
//	00000000 00000000 00000000 00000010 000 2
//
//	int a = -16;
//	int b = 3;
//	int c = a >> b;
//
//	11111111 11111111 11111111 11110000 -16
//	11111111 11111111 11111111 11111110 000 -2
	

//">>>" unsigned right shift 연산자
//>> 연산자와 기본원리는 똑같으나, 원본 데이터가 음수일 경우에도 앞의 빈
//비트를 0으로 채운다는 사실이 다르다. 자바에만 있는 기술이다.
//원본데이터에 관계없이 결과는 무조건 양수로만 나타나게 된다.
//
//int a = -16;
//int b = 3;
//int c = a >>> b;
//
//11111111 11111111 11111111 11110000 -16
//00011111 11111111 11111111 11111110 000
//536870910
	

//관계 연산자
//
//비교관계 : ">", "<", ">=", "<="
//항등관계 : "==", "!="
//
//비교관계연산자는 다 아는 경우이고,
//항등관계 연산자는 피 연산자들이 서로 같은지 다른지를 판단하는 것
//
//== 는 비교하는 두 개의 피연산자가 같으면 true, 다르면 false
//!= 는 비교하는 두 개의 피연산자가 같으면 false, 다르면 true 반환
//- != 는 관계연산자이지만, != 뒤의 연산자를 부정한 후 대입하라는 뜻
	
//	boolean bool = 5 < 3; // false
//	boolean bool1 = 10 != 10; // false
//	System.out.println("bool = " + bool);
//	System.out.println("bool1 = " + bool1);
//
//	boolean a = bool != bool1;
//	boolean b = bool = ! bool1;
//	System.out.println("a = " + a);
//	System.out.println("b = " + b);
	
//	비트연산자 - "&", "|", "^"
//	& - and연산자, 대조되는 비트가 모두 1일때 결과값을 1로 주는 연산자
//	| - or연산자, 대조되는 비트 한쪽이라도 1이면 결과값은 1로주는 연산자
//	^ - exclusive or연산자, 대조되는 비트가 다르면 1을 주는 연산자
//	예)
//		int a = 4;
//		int b = 12;
//		System.out.println("& = " + (a & b));//0100 & 1100 = 0100
//		System.out.println("| = " + (a | b));//0100 | 1100 = 1100
//		System.out.println("^ = " + (a ^ b));//0100 ^ 1100 = 0011
	

//논리연산자 - "&&", "||"
//"&&" - and연산자, 피연산자를 비교하여 둘 다 참이면 true 아니면 false
//"||" - or연산자, 피연산자를 비교하여 둘 중 하나만 참이면 ture, 아니면 false

//	boolean bool = 5 < 3 && 7 > 4; //false false && true
//	boolean bool1 = 10 != 10 || 7 <= 3; // true true || false
//	System.out.println("bool = " + bool);
//	System.out.println("bool1 = " + bool1);
	

//삼항 연산자 : "조건항 ? 항1 : 항2"
//조건항이 참이면 항1번을 시행하고 조건항이 거짓이면 항2번을 실행한다.
//
//public static void main(String[] args) throws IOException {
//	BufferedReader in = new BufferedReader(
//			new InputStreamReader(System.in));
//
//	System.out.print("1.남성 2.여성 = ");
//	int x = Integer.parseInt(in.readLine());
//	String str = x == 1 ? "남성" : "여성";
//	System.out.println("str = " + str);
//}
//
//실행결과
//
//1을 입력한 경우
//1.남성 2.여성 = 1
//str = 남성
	
//	배정대입연산자 : =, *=, /=, %=, +=, -=, <<=, >>=, >>>=
//			= : 대입연산자, 단순히 오른쪽에 있는 값을 왼쪽으로 옮겨라.
//			byte a = 5;
//
//			배정연산자
//
//			a = a - 5; 라고 하면 5값은 int형이라 오류가 발생한다.(형변환을 해줘야 함)
//			이럴 때 형변환을 쓰지 않으면서 결과값은 같게 나오게 하는 해결책
//			우선적으로 배정되어 있는 다른 연산이 먼저 발생한 후에 대입연산을 해라
//			ex) a += b => a = a + b;
//			ex) a -= b => a = a - b;
//			ex) a *= b => a = a * b;
//			ex) a /= b => a = a / b;
//			ex) a %= b => a = a % b;
//			ex) a <<= b => a = a << b;
//			ex) a >>= b => a = a >> b;
	
	
	}
}
