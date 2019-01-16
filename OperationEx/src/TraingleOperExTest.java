import java.util.Scanner;

public class TraingleOperExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		x = scan.nextInt();

		
		int absX = (x >= 0) ? x : -x; // 조건식의 결과가 맞으면-> : 경계로 왼쪽은 true, 오른쪽은 false
//															 => absX = x;
		
		
		System.out.println("x = " + x + "일 때, x의 절대값은 " + absX);
		
		
		
		
		
		
	}

}
