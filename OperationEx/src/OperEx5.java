
public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int secondNum = 0;
		
		num = 10;
		secondNum = 4;
		
		System.out.printf("%d + %d = %d\n", num, secondNum, num+secondNum);
		System.out.printf("%d - %d = %d\n", num, secondNum, num-secondNum);
		System.out.printf("%d * %d = %d\n", num, secondNum, num*secondNum);
		// int / int -> 10 / 4 -> 2(.5 버림)
		System.out.printf("%d / %d = %d\n", num, secondNum, num/secondNum);
		System.out.printf("%d / %f = %f\n", 
				num, (float)secondNum, num/(float)secondNum);
	}

}
