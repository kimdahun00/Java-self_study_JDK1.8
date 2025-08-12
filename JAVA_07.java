package practice;

public class JAVA_07 {
//	재귀 메서드란?
//			함수(메서드) 안에서 자기 자신을 호출하는 메서드를 뜻하고 
//			보통 어떤 문제를 작은 문제로 쪼개서 같은 형태의 함수를 반복 실행할 때 쓰이며
//			반드시 종료 조건(base case) 이 있어야 무한히 호출되지 않고 끝난다.
	
	public static void recursisonMethod(int n) { // 매개변수 int n에 4가 전달 받고 
		System.out.println("recursisonMethod Call!!n: "+n); // 문자열 4로 출력 
		if(n == 0) { // n이 0과 완전히 같다면 
					 // 1) n이 4이기 0과 같지 않기에 값이 반환되지 않는다. 
					 // 2) n이 3이기 0과 같지 않기에 값이 반환되지 않는다.
					 // 3) n이 2이기 0과 같지 않기에 값이 반환되지 않는다.
					 // 4) n이 1이기 0과 같지 않기에 값이 반환되지 않는다.
					 // 5) n이 0이여서 return 되어 반환하게 된다. 
 			return; // return 하게 된다.
		}
		recursisonMethod(n-1); 
		// 메소드recursisonMethod를 호출하여 4가 입력받던거를 3이 되고
		// 아직 0이 될 때까지 호출이 되기에 아래 출력문으로 출력되지 않는다
		// 자기 자신 메서드를 호출하여 원하는 부분이 완성 될 떄 까지 실행되게 만든다
		
		System.out.println("recursisonMethod returned.n"+n); 
		// recursisonMethod(n-1)가 호출이 완료되고 아니 어떻게 1, 2, 3, 4가 출력되지???
	}
	public static void main(String[] args) {
		recursisonMethod(4);	// recursisonMethod 호출 동시에 4로 전달
	}
}

//	메인에서 호출 시작
//	recursionMethod(4) 호출 → n=4인 새로운 메서드 실행 영역(스택 프레임)이 만들어짐.
//	→ n==0이 아니므로 recursionMethod(3)을 또 호출.
//	
//	호출이 반복되며 스택이 쌓임
//	
//	n=3 → n=2 → n=1 → n=0
//	
//	호출할 때마다 이전 호출의 코드는 중단된 상태로 대기.
//	
//	각 호출은 독립적인 실행 공간을 가지고, 그 안에 자기만의 n 값이 저장됨.
//	
//	종료 조건 도달 (n==0)
//	
//	if (n==0) return; 실행 → 더 이상 재귀 호출 안 함.
//	
//	현재 메서드 실행이 끝나면서 스택에서 제거(pop).
//	
//	되돌아오며 출력 실행
//	
//	n=1 호출로 돌아옴 → println("returned.n1") 실행 → 끝나고 또 이전 호출로 반환.
//	
//	n=2 호출로 돌아옴 → println("returned.n2") 실행 → 반환.
//	
//	n=3 호출로 돌아옴 → println("returned.n3") 실행 → 반환.
//	
//	n=4 호출로 돌아옴 → println("returned.n4") 실행 → 반환.
//	
//	스택이 비면 프로그램 종료
//	
//	모든 재귀 호출이 종료되면 메인 메서드도 끝나고 프로그램 종료.
//	
//	핵심 포인트
//	재귀는 자기 자신을 호출하는 메서드.
//	
//	호출이 중첩될 때마다 **새로운 실행 영역(스택 프레임)**이 만들어짐.
//	
//	종료 조건(Base Case)을 만나면 되돌아가면서 대기 중이던 코드를 실행.
//	
//	“콜(Call)”이 연속으로 쌓였다가, “리턴(Return)”이 순서대로 되돌아오는 구조.
//	
//	비유
//	재귀 호출은 부메랑 같음.
//	멀리 던지면(깊이 호출) 끝까지 가서(종료 조건) 돌아올 때 한 단계씩 순서대로 거쳐서 돌아옴.


//	재귀 호출이 “돌아오는” 과정 이해하기
//	1. 함수 호출은 스택(Stack)에 쌓인다
//	메서드가 호출될 때마다 호출 정보가 스택이라는 자료구조에 쌓여.
//	
//	recursisonMethod(4) 호출되면, n=4인 상태가 스택에 쌓이고,
//	
//	그 안에서 recursisonMethod(3) 호출되면 n=3 상태가 새로 쌓이는 식으로 계속 쌓여.
//	
//	2. 재귀 호출 쌓기 (going down)
//	[스택 최상단]
//	recursisonMethod(0)  ← 가장 최근에 호출된 함수 (마지막 호출)
//	recursisonMethod(1)
//	recursisonMethod(2)
//	recursisonMethod(3)
//	recursisonMethod(4)  ← 처음 호출된 함수 (맨 아래)
//	[스택 최하단]
//	각 함수는 recursisonMethod(n-1) 호출하면서 점점 n이 줄어드는 상태로 계속 쌓임.
//	
//	3. 종료 조건 만나면 ‘return’하며 스택에서 함수가 제거됨
//	recursisonMethod(0) 호출 시, n==0 이므로
//	
//	바로 return 하면서 스택에서 빠져나감.
//	
//	4. 쌓였던 함수들이 차례대로 ‘return’ 되면서 아래 코드 실행 (going up)
//	recursisonMethod(0)이 끝나면 recursisonMethod(1)가 다음 줄(println("returned.n"+n)) 실행
//	
//	recursisonMethod(1) 종료 → recursisonMethod(2)가 다시 println 실행
//	
//	이런 식으로 스택에 쌓여있던 함수들이 하나씩 종료되면서 차례로 println 실행됨
//	
//	5. 그림으로 표현하면
//	호출 ->      출력 Call!!n:4
//	호출 ->      출력 Call!!n:3
//	호출 ->      출력 Call!!n:2
//	호출 ->      출력 Call!!n:1
//	호출 ->      n==0, 종료 (return)
//	
//	돌아옴 ->   출력 returned.n1 (recursisonMethod(1))
//	돌아옴 ->   출력 returned.n2 (recursisonMethod(2))
//	돌아옴 ->   출력 returned.n3 (recursisonMethod(3))
//	돌아옴 ->   출력 returned.n4 (recursisonMethod(4))

//	요약
//	재귀 함수는 호출될 때마다 쌓이고,
//	종료 조건 만나면 쌓인 함수들이 거꾸로 차례로 반환(return)되면서 실행된다.
//	그래서 “returned.n” 출력이 1부터 4까지 차례대로 찍히는 거야.


