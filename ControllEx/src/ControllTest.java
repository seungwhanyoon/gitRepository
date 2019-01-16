
public class ControllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int visitNum = 0;
		
		if (visitNum == 0) {
			System.out.println("\"처음 오셨군요. 방문해 주셔서 감사합니다.\"");
//			System.out.println("방문횟수는 " + (visitNum + 1) + "번 입니다.");
		}
				
		if (visitNum > 0) {
			System.out.println("다시 방문해 주셔서 감사합니다.");
//			System.out.println("방문횟수는 " + (visitNum + 1) + "번 입니다.");
		}

		System.out.println("방문횟수는 " + (visitNum + 1) + "번 입니다.");
	}

}
