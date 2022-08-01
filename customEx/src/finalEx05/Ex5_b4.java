package finalEx05;

public class Ex5_b4{
	public static void main(String[] args) {
		// 5-16 커맨드 라인으로 입력받기
		if(args != null) {
			System.out.println("매개변수의 개수 :: " + args.length);
			
			for(int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] =  + " + args[i]);
				
			}
		}
	}
}
