package finalEx05;

import java.util.Arrays;

public class Ex5_b2 {
	public static void main(String[] args) {
		char[] arr = {'A','B','C','D'};
		char[] tmp = {'0', '1','2','3','4','5','6','7','8','9'};
		
//		System.out.println(arr);
//		System.out.println(tmp);
//
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(tmp));
//		
//		// ABCD0123456789
//		char[] result = new char[arr.length + tmp.length];
//		System.arraycopy(arr, 0, result, 0, arr.length);
//		System.arraycopy(tmp, 0, result, arr.length, tmp.length);
//		
//		System.out.println(result);
//		// ABCD456789
//		System.arraycopy(arr, 0, tmp, 0, arr.length);
//		System.out.println(tmp);
//		// ABCD45ABC9
//		System.arraycopy(arr, 0, tmp, 0, arr.length);
//		System.arraycopy(arr, 0, tmp, 6, arr.length-1);
//		System.out.println(tmp);
//		System.out.println();
		
		// 5-5 총합과 평균
		int sum = 0;
		float average = 0;
		
		int[] mathScore = {78,59,87,99,87,93};
		
//		sum = sum + mathScore[0];
//		System.out.println(sum);
//		sum = sum + mathScore[1];
//		System.out.println(sum);
//		sum = sum + mathScore[2];
//		System.out.println(sum);
//		sum = sum + mathScore[3];
//		System.out.println(sum);
//		sum = sum + mathScore[4];
//		System.out.println(sum);
//		
//		average = (float)sum / mathScore.length;
//		System.out.println(average);
//		System.out.println();
		
		for(int i = 0; i < mathScore.length; i++) {
			sum += mathScore[i];
		}
		average = (float)sum / mathScore.length;
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +average);
		
		
		// 5-6 최대값과 최소값
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[6];
		int min = score[6];
		int a = score[0];
		System.out.println(score[0]);
		System.out.println(a);
		
		for(int i = 1 ; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
			System.out.println("최대값 :: " + max);
			System.out.println("최소값 :: " + min);
		}
		
		// 5-7 섞기
		int[] numArr = new int[10];
		numArr[0] = 0;
		numArr[1] = 1;
		numArr[2] = 2;
		numArr[3] = 3;
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
		System.out.println(numArr[3]);
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		for(int i = 0; i < numArr.length; i++) {
			int num = (int)(Math.random()*10);
//			System.out.println("random ::" +num);
			int temp = numArr[0]; // 0
			numArr[0] = numArr[num]; // 0 = 9
			numArr[num] = temp; // 9 = 0
//			System.out.println();
//			System.out.print("numArr[0] :: "+numArr[0]);
//			System.out.println();
//			System.out.print("numArr[num] :: " +numArr[num]);
		}
		
		// 5-8 섞기
		int[] ball = new int[45];
		
		ball[0] = 1;
		ball[1] = 2;
		ball[2] = 3;
		ball[3] = 4;
//		System.out.println();
//		System.out.println("ball[0] :: " +ball[0]);
//		System.out.println("ball[1] :: " +ball[1]);
//		System.out.println("ball[2] :: " +ball[2]);
//		System.out.println("ball[3] :: " +ball[3]);
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
			System.out.println(ball[i]);
		}
		System.out.println();
		System.out.println();
		int randomNum = 0;
		int tempo = 0;
		
		for(int i = 0; i <  6; i++) {
			randomNum = (int)(Math.random()*45);
			
			tempo = ball[i];
			ball[i] = ball[randomNum];
			ball[randomNum] = tempo;
			
//			System.out.println("ball[i] :: " +ball[i]);
//			System.out.println("ball[randomNum] :: " +ball[randomNum]);
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println("ball [" + i + "] :: "+ball[i]);
		}
		
		// 5-9 임의의 값으로 배열 채우기
		int[] code = {-4 ,-1, 3, 6, 11};
		int[] arrs = new int[10];

		for(int i = 0; i < arrs.length; i++) {
			int rn = (int)(Math.random()*code.length);
			arrs[i] = code[rn];
		}
		System.out.println(Arrays.toString(arrs));
		System.out.println();
		
		// 연습
//		int[] list = new int[10];
//		System.out.print(Arrays.toString(list));
//		System.out.println();
//		
//		for(int i = 0; i < list.length; i++) {
//			list[i] = (int)(Math.random()*10)+1;
//			int tmpe = list[0];
//			list[0] = list[i];
//			list[i] = tmpe;
//			System.out.println(list[i]);
////			System.out.println(Arrays.toString(list));
//		}
//		System.out.println();
//		System.out.print(Arrays.toString(list));
		System.out.println();
		
		// 5-10 정렬하기(sorting)
		int[] numARR = new int[10];
		
		for(int i = 0; i< numARR.length; i++) {
			System.out.print(numARR[i] = (int)(Math.random()*10));
		}
		System.out.println();
		System.out.println("---------------------");
		
		for(int i = 0; i < numARR.length-1; i++) {
			boolean changed = false;
			
			for(int j = 0; j < numARR.length-1-i; j++) {
				if(numARR[j] > numARR[j+1]) {
					int temp = numARR[j];
					numARR[j] = numARR[j+1];
					numARR[j+1] = temp;
					changed = true;
				}
			}
			
			if(!changed) {
				break;
			}
			for(int k = 0; k < numARR.length; k++) {
				System.out.print(numARR[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 5-11 빈도수 구하기 
		int[] numarr = new int[10];
		int[] counter = new int[10]; 
		
		for(int i = 0; i < numarr.length; i++) {
			numarr[i] = (int)(Math.random()*10);
			System.out.print(numarr[i]);
		}
		System.out.println("----------------");
		
		for(int i = 0; i < numarr.length; i++) {
			counter[numarr[i]]++;
			System.out.println(Arrays.toString(counter));
		}
		
		for(int i = 0; i < numarr.length; i++) {
			System.out.println(i + "의 개수 :: " + counter[i]);
		}
		
	}
}
