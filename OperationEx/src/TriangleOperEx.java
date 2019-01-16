
public class TriangleOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		삼항연산자
//		표현식
//		(조건식) ? 식1 : 식2
//		ㄴ true, false만 나옴
//		ex) 변수  = (조건식) ? 식1 : 식2 
		int x = 0;
		int y = 0;
		
		x = 10;
		y = -10;
		
		int absX = (x >= 0) ? x : -x; // 조건식의 결과가 맞으면-> : 경계로 왼쪽은 true, 오른쪽은 false
//															 => absX = x;
		int absY = (y >= 0) ? y : -y; // =>absY = -y;		
		System.out.println("x = 10일 때, x의 절대값은 " + absX);
		System.out.println("y = -10일 때, y의 절대값은 " + absY);
		
		
		
	}

}
