package finalEx05;

import java.util.Arrays;

public class arr2 {
	public static void main(String[] args) {
		// 5-5 
		int sum = 0; 
		float average = 0f;
		
		int[] score = {100, 83, 75, 94, 65, 77};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("sum :: " +sum);
		average = (float)sum / score.length;
		System.out.println("average :: " +average);
		
		// 5-6
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if (score[i] < min) {
				min = score[i];
			}
			System.out.println("----------------");
			System.out.println("max :: " + max);
			System.out.println("min :: " + min);
		}
		
		// 5-7
		int[] numArr = new int[10];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i : numArr) {
			System.out.print(i);
		}
		System.out.println();
		
//		for(int j = 0; j < numArr.length; j++) {
//			System.out.print(numArr[j]);
//		}
		
		// 5-8
		int[] ball = new int[45];
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
			System.out.println(ball[i]);
		}
		
		for(int i = 0; i < 6; i++) {
			int n = (int)(Math.random()*45);
			int tmp = ball[0];
//			System.out.println(tmp);
			ball[0] = ball[n];
			ball[n] = ball[0];
			System.out.println("ball[" + i + "] :: " +ball[n]);
		}
		
		// 5-9
		int[] code = {-4, -1, 3, 6, 11};
		int[] arrs = new int[10];
		
		for(int i = 0; i < arrs.length; i++) {
			int n = (int)(Math.random()*5);
			arrs[i] = code[n];
		}
		System.out.println(Arrays.toString(arrs));
		
		// 5-10
		int[] arrays = new int[10];
		
		for(int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i = 0; i < arrays.length-1; i++) {
			boolean changed = false;
			for(int j = 0; j < arrays.length-1-i; j++) {
				if(arrays[j] > arrays[j+1]) {
					int tmp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = arrays[j];
					changed = true;
				}
			}
			
			if(!changed) {
				break;
			}
			for (int k = 0; k < arrays.length; k++) {
//				System.out.print(arrays[k]);
			}
		}
		System.out.println("--------------------");
		
		// 5-11
		int[] numarr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < numarr.length; i++) {
			numarr[i] = (int)(Math.random()*10);
			System.out.print(numarr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < numarr.length; i++) {
			counter[numarr[i]]++;
			System.out.println(i +"번째 개수 :: " +counter[i]);
		}
		
		// 5-12
		String[] name = {"Kim", "Park", "Yi"};
		for(int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "] :: " + name[i]);
		}
		System.out.println();
		String tmp = name[2];
		System.out.println("tmp :: " +tmp);
		name[0] = tmp;
		
		for(String str : name) {
			System.out.println(str);
		}
		
		String[] str = new String[10];
		str[0] = "Kim";
		
//		int[] aa = new int[10];
//		aa[0] = 1;
		
		// 5-13
		char[] hex = {'C','A','F','E'};
		String[] binary = {"0000", "0001","0010", "0011"
						  ,"0100", "0101","0110", "0111"
						  ,"1000", "1001","1010", "1011"
						  ,"1100", "1101","1110", "1111"};
		
		String result = "";
		
		for(int i = 0; i < hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i] - '0'];
			}else {
				result += binary[hex[i] - 'A' + 10];
			}
		}
		System.out.println();
		System.out.println("hex :: " + new String(hex));
		System.out.println("binary :: " + result);
		
		String word = "java";
		System.out.println(word);
		System.out.println(word.toCharArray());
		
		// 5-14
		String text = "ABCD";
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		System.out.println(text.toCharArray());
		
		// 5-15
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", "."
						, "..-.", "--.", "....", "..", ".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-", ".-.", "...", "-"
						, "..-", "...-", ".--", "-..-", "-.--"
						, "--.."};
		String results = ""; 
		
		for(int i = 0; i < source.length(); i++) {
			results += morse[source.charAt(i) - 'A'];
		}
		
		System.out.println("source :: " + source);
		System.out.println("morse :: " + results);
	}
}
