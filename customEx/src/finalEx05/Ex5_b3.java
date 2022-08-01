package finalEx05;

import java.util.Arrays;

public class Ex5_b3 {
	public static void main(String[] args) {
		// 5-12 배열의 선언과 생성
		String[] names = {"Kim","Park","Yi"};
		
//		for(String i : names) {
//			System.out.println(i);
//		}
		
		for(int i = 0; i < names.length; i++) {
		System.out.println("names[" + i + "]: " + i);
		}
		
		String tmp = names[2];
		System.out.println(tmp);
		names[0] = "Yu";
		System.out.println(names[0]);
		System.out.println();
		
		for(String str : names) {
			System.out.println(str);
		}
		System.out.println();
		
		// 5-13 
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = {"0000", "0001","0010", "0011"
						  ,"0100", "0101","0110", "0111"
						  ,"1000", "1001","1010", "1011"
						  ,"1100", "1101","1110", "1111"};
		
		String result = ""; 
		
		for(int i = 0; i < hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i]-'0'];
			}else {
				result += binary[hex[i]-'A' + 10];
			}
			System.out.println("hex :: " + new String(hex));
			System.out.println("binary :: " + result);
		}
		
		char[] chArr = {'a','b','c','d'};
		String str = new String(chArr);
		char[] aa = str.toCharArray();
		System.out.println(Arrays.toString(aa));
		
		// 5-14 char배열과 String클래스의 변환
		String src = "ABCD"; 
		
		char[] change = src.toCharArray();
		System.out.println(Arrays.toString(change));
		
		for(int i = 0; i < change.length; i++) {
			char ch = change[i];
			System.out.println("ch[" + i + "] :: " + ch);
		}
		System.out.println();
		
		for(int i = 0; i < change.length; i++) {
			char ch = src.charAt(i);
			System.out.println("ch[" + i + "] :: " + ch);
		}
		
		char[] charArr = src.toCharArray();
		System.out.println(Arrays.toString(charArr));
		
		// 5-15
		String source = "javaworld";
		
		
		String[] morse = {".-", "-...", "-.-.", "-..", "."
						, "..-.", "--.", "....", "..", ".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-", ".-.", "...", "-"
						, "..-", "...-", ".--", "-..-", "-.--"
						, "--.."};
		String results = "";
		for(int i = 0; i < source.length(); i++) {
			char ch = source.charAt(i);
			int a = ch - 'a';
			results += morse[a];
		}
		System.out.println("source :: " + source);
		System.out.println("results :: " + results);
		
		// 5-16 커맨드 라인으로 입력받기
		System.out.println("매개변수의 개수 :: " + args.length);
		
		
	}
}
