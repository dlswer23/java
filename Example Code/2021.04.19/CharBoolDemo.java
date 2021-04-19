package basic;

public class CharBoolDemo {

	public static void main(String []args) {
		char ga1 = '가';
		char ga2 = '\uac00';  //'가'에해당하는 유니콛 값이다
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + " 가 아니면"  + geojit + "입니다");
		
		//출력결과 
		//가
		//가
		//true 가 아니면false입니다

		
	}
	
}
