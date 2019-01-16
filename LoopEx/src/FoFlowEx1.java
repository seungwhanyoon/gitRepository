
public class FoFlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		표현식
//		for(초기화; 조건식; 증감식){
			// 조건식이 true일 때 수행될 문장들을 적는다
//		}
		//디버깅
		//브레이크 포인트 ->라인넘버에 마우스커서 가져가서 더블클릭 -> 숫자 앞에 동그라미 생김
		int sum = 0;
		// 합산 1 ~ 10까지의 숫자를 전부 더한 값은 얼마인가요?
		for (int i = 0; i <= 10; i++) {		//0 ~ 10 11번
			sum = sum + i;
			System.out.println(i + " 까지의 합 : " + sum);
		}
		
		System.out.println(sum);
		
		
		
	}

}
