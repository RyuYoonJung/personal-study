package finalEx04;

import java.util.Scanner;

public class Ex4_b {
	public static void main(String[] args) {
		// 4-1
		int x = 0;
		
		if(x == 0) {System.out.println("x == 0");} // true
		if(x != 0) {System.out.println("x != 0");} // false
		if(!(x == 0)) {System.out.println("!(x == 0)");} // false
		if(!(x != 0)) {System.out.println("!(x != 0)");} // true
		
		x = 1;
		System.out.printf("x = %d 일 때, 참인 것은 %n", x);
		if(x == 0) {System.out.println("x == 0");} // false
		if(x != 0) {System.out.println("x != 0");} // true
		if(!(x == 0)) {System.out.println("!(x == 0)");} // true
		if(!(x != 0)) {System.out.println("!(x != 0)");} // false
		
		// 4-2 && 4-3
		System.out.println("숫자를 하나 입력하세요. > ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0이 맞습니다.");
		}else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}

		// 4-4 && 4-5
		int score;
		char grade = ' ';
		char opt = ' ';

		System.out.println("점수를 입력하세요 > ");
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
		score = Integer.parseInt(input);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}else if(score < 94) {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}else if(score < 84) {
				opt = '-';
			}
		}else if(score >= 70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			}else if(score < 74) {
				opt = '-';
			}
		}	
		chkGrade(grade, opt);
	}
	

	// 누적합이 100 이 되게 하는 수 구하기 (홀수 양수 / 짝수 음수)
	// 두 눈의 합이 6이 되는 경우의 수 구하기
	// 369게임
	// 회문수 여부 확인 프로그램
	// 피보나치 (1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인가)
	
	static void chkGrade(char grade, char opt) {
		System.out.println("당신의 학점은 " + grade + opt + "입니다.");
	}
}
