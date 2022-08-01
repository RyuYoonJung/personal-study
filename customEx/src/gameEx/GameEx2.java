package gameEx;

import java.util.Arrays;

public class GameEx2 {
	public static void main(String[] args) {
		// 윷놀이
		// 모 0000
		// 윷 1111 (15)
		// 도 0001(1) 0010(2) 0100(4) 1000(8)
		// 개 0011(3) 0101(5) 1001(9) 0110(6) 1010(10) 1100(12)
		// 걸 0111(7) 1101(13) 1011(11) 1110(14)

		// 팀1 10 (4)
		// 팀2 01 (1)

		// 판
		int[] arr = new int[20];

		// 윷
		String[] strs = { "도", "개", "걸", "윷", "모" }; //
		// System.out.println("윷 :: " + strs[roll()-1]);
		int position = 0;
		// 1회 굴림
		int result = roll();
		position += result; // 도개걸윷모 칸수
		position %= 20; // 현재위치가 말판의 인덱스 범위 내에 있도록 하기위함
		System.out.println("윷 :: " + strs[result - 1]);
		System.out.println("현재 위치 :: " + position + "번째");

		// 2회 굴림
		result = roll();
		position += result;
		position %= 20;
		System.out.println("윷 :: " + strs[result - 1]);
		System.out.println("현재 위치 :: " + position + "번째");

		// 3회 굴림
		result = roll();
		position += result;
		position %= 20;
		System.out.println("윷 :: " + strs[result - 1]);
		System.out.println("현재 위치 :: " + position + "번째");

		// 4회 굴림
		result = roll();
		position += result;
		position %= 20;
		System.out.println("윷 :: " + strs[result - 1]);
		System.out.println("현재 위치 :: " + position + "번째");

		// 5회 굴림
		result = roll();
		position += result;
		position %= 20;
		System.out.println("윷 :: " + strs[result - 1]);
		System.out.println("현재 위치 :: " + position + "번째");

		// 6회 굴림
		result = roll();
		position += result;
		position %= 20;
		System.out.println("윷 :: " + strs[result - 1]);
		System.out.println("현재 위치 :: " + position + "번째");
		System.out.println("---------------------------------");

		// 7회 굴림
		result = roll();
		position += result;
		position %= 20;
		arr[position] = 1%3;
		System.out.println("윷 :: " + strs[result - 1]);
		System.out.println("현재 위치 :: " + position + "번째");
		if(position == 19) {
			int i = 0;
			System.out.println(arr[position] + " 완주");

			
			
		}
	}
	
	static int roll() {
		int rn = (int)(Math.random()*16);
//		System.out.println(rn);
		int ret = 0;
		
		switch (rn) {
		case 1: case 2: case 4: case 8:
			ret = 1;
			break;
		case 3: case 5: case 6: case 9: case 10: case 12: 
			ret = 2;
			break;
		case 7: case 11: case 13: case 14:
			ret = 3;
			break;
		case 15: 
			ret = 4;
			break;
		case 0: 
			ret = 5;
			break;
		}
		return ret;
	}
}
