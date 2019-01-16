import java.util.Scanner;

public class OperEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		비교연산자
//		>, <, <=, >=, ==, !=
		int num = 0;
		System.out.println("숫자를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

//		크다, 작다, 초과, 미만
		System.out.println("2 > 1 결과는 : " + (num >1)); //true, 괄호먼저 실행후 실행값 나온 후 문자열나열

//		크거나 같다, 작거나 같다, 이상, 이하
		System.out.println(num <= 3);

//		같다
		System.out.println(num == 2);

//		!= 다르다
		System.out.println(num != 2);
		
		
		
		
	}

}
