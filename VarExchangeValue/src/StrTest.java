
public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자형
		char ch =' '; // 오로지 한 글자만 존재할 수 있다. 문자형 초기값 설정시 공백
		
//		concat ->concatnation
//		문자열 (초기값의 의도 : 어떤 다른 내용들과 합쳐져도 영향을 주지 않아야 한다.) 
		String str = "";
		String name = "";
		
		//문자열 특징
		/*
		 * 문자열 + any type -> 문자열 + 문자열 -> 문자열 
		 * any type + 문자열 -> 문자열 + 문자열 -> 문자열
		 */
		str = "Ja" + "va"; //Java
		name = str + 8.0; //"8.0"
		
		
		System.out.println("str : " + str);
		System.out.println("name = " + name);
		
		String string ="";
		
		string = 7 + " " + true;
		
		System.out.println(string);
		
	}

}
