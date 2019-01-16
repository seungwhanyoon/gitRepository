
public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//else문
		
//		표현식
//		if(조건식) {
//			조건식이 true일 때 수행될 문장들을 적는다.
//			}else{ (else문 혼자서는 존재할 수 없다. 반드시 if문 뒤에 적을 수 있다.
//					if문이 실행되고 false일 때 else문이 실행된다.)
//			조건식이 거짓일 때 수행될 문장들을 적는다.
//			}
		
		int visitCount = 0;
		
		if (visitCount == 0) {
			System.out.println("처음 오셨군요 방문해주셔서 감사합니다.");
		}else {
			System.out.println("다시 방문해 주셔서 감사합니다");
		}
		
		System.out.println("방문횟수는 " + (visitCount + 1) + "번입니다");
	
		
		
	}

}
