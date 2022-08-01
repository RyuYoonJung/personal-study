package rect;

public class App {
	public static void main(String[] args) {
		int x = 1;
		int y = -123;
		App app = new App();
		
		y = app.result(y);
		System.out.println(y);
		
	}
	
	int result (int x) {
//		int a = x;
		
		return x < 0 ? -x : x;
	}
}

// display method >> 사각형 내에서 알 수 있는 모든 정보 출력 
// 둘레 넓이 가로 세로 