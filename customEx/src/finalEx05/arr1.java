package finalEx05;

import java.util.Arrays;

public class arr1 {
	public static void main(String[] args) {
		// 5-5
//		int[] score = {100, 88, 100, 100, 90};
//		int sum = 0;
//		float average = 0f;
//		
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		System.out.println("sum :: " + sum);
//		average = (float)sum / score.length;
//		System.out.println("average :: " + average);
		
		// 5-6
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min){
				min = score[i];
			}
		}
		System.out.println("max :: " +max);
		System.out.println("min :: " +min);
		
		// 5-7
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
//		System.out.println(Arrays.toString(numArr));
		System.out.println();
		// 5-8
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
			System.out.println(ball[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			int tmp = ball[0];
			int n = (int)(Math.random()*45);
			ball[i] = ball[n];
			ball[n] = tmp;
			System.out.println("ball [" + i + "] :: " + ball[i]);
		}
		// 5-9
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int [10];
		
		for(int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random()*5);
			arr[i] = code[n];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------");
		
		// 5-10
		int[] numArrs = new int[10];
		for(int i = 0; i < numArrs.length; i++) {
			System.out.print(numArrs[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i = 0; i< numArrs.length-1; i++) {
			boolean changed = false;
			for(int j = 0; j < numArrs.length-1-i; j++) {
				if(numArrs[j] > numArrs[j+1]) {
					int tmp = numArrs[j];
					numArrs[j] = numArrs[j+1];
					numArrs[j+1] = tmp;
					changed = true;
				}
			}
			System.out.println(changed);
			if(!changed) {
				break;
			}
			
			for(int k = 0; k < numArrs.length; k++) {
				System.out.print(numArrs[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 5-11
		
		int[] numarr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < numarr.length; i++) {
			System.out.print(numarr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i = 0; i < numarr.length; i++) {
			counter[numarr[i]]++; // numarr의 i번째에 저장된 값과 일치하는 counter배열 인덱스에 저장되어 있는 값을 1 증가시킨다
		}
		for(int i = 0; i < numarr.length; i++) {
			System.out.println(i + "의 개수 :: " +counter[i]);
		}
	}
}
