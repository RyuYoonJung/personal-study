package finalEx04;

public class Ex4_suppliment {
	public static void main(String[] args) {
		// 숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라 
		// 만일 문자열이 "12345" 라면 ‘1+2+3+4+5’의 결과인 15가 출력되어야 한다.
		
		// 두 눈의 합이 6이 되는 경우의 수 구하기
		int sum = 0;
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				sum = i + j;
				if(sum == 6) {
//					System.out.println("i = " + i + ",  j = " + j );
//					System.out.println("sum :: " + sum);
				}
			}
		}

		// 누적합이 100 이 되게 하는 수 구하기 (홀수 양수 / 짝수 음수)
		int totalSum = 0;
//		int i = 0;
//		while(totalSum < 100) {
//			i++;
//			if(i%2 == 0) {
//				totalSum += -i;
//			}else {
//				totalSum += i;
//			}
//			System.out.println(i +" ,"+ totalSum );
//		}
		
//		System.out.println(i);
//		System.out.println(totalSum);
		
		// 369게임
//		String clap = "짝";
////		int i = 69;
//
//		for(int i = 1; i < 100000; i++) {
//			int num = i;
//			System.out.print(i);
//			while(num != 0) {
//				int a = num%10;
////				System.out.print(" " + a);
//				if(a%3 == 0 && a != 0) {
//					System.out.print(clap);
//				}
//				num /= 10;
//			}
//			System.out.println();
//		}
//		
		
//		for(int i = 1; i < 100; i++) {
//			if(i%10%3 == 0 && i%3 == 0) {
//				System.out.println(i + clap);
//			}else {
//				System.out.println(i);
//			}
//			
//			if(i/10%3 == 0 || i%10 != 0) {
//				System.out.println(i + clap + clap);
//			}else {
//				System.out.println(i);
//			}
//		}
		
//		for(int i = 1; i < 100; i++) {
//			if(i%3 == 0) {
//				System.out.println(i + clap);
//			}else {
//				System.out.println(i);
//			}
//		}
		
		// 회문수 여부 확인 프로그램
//		int a = 1234; 
//		int num = a; 
//		int tmp = 0; // 회문수 저장할 곳
//		
//		
//		while(num != 0) {
//			tmp = tmp * 10 + num%10; // tmp = tmp*10 // tmp = 0*10 + 4 / 4*10 +3 /43 *10 + 2 / 432 +1    
//			System.out.println("tmp ::" + tmp);
//			System.out.println("num ::" + num);
//			num /= 10; // 123 12 1 0
//			System.out.println("tmp2 ::" + tmp);
//			System.out.println();		
//		}
		
		// 피보나치 (1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인가)
		int a = 1;
		int b = 0;
		int c = 0;
		// 1 0 1 1 2 3 5 8 13 21
			for(int i = 1; i <= 10 ; i++) {
				c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
			
			
//			a += b; // i = 1+0 // 1 + 1
//			result += a + b; // result = 1 // 2 + 1 
//			System.out.println(a);
//			System.out.println(b);
//		}
	}
}
