import java.util.Scanner;

public class FlowTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.println("자신의 점수를 입력해주세요.");
		score = scan.nextInt();

		if(score >100) {
			System.out.println("다시 입력해 주십시오");
		}else if(score >= 90) {
			System.out.println(score + "점은 " + "A");
		}else if(score >= 80) {
			System.out.println(score + "점은 " + "B");
		}else if(score >= 70) {
			System.out.println(score + "점은 " + "C");
		}else
			System.out.println(score + "점은" + "F");
	}
}
