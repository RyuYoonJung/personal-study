package finalEx05;

import java.util.Arrays;

public class Ex5_b1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int a = 50;
		int tmp = 0;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = a;
			a += 10;
//			System.out.println("score[" + i + "] : " +score[i]);
			tmp = score[3] + score[4];
//			System.out.println(score[5]); ArrayIndexOutOfBoundsException 발생 (인덱스의 유효범위를 넘긴 것)
			// 배열의 길이 --> 배열 공간의 갯수
			// 배열의 범위 --> 배열의 길이 -1 :: 인덱스가 0부터 시작하기 때문
		}
//		System.out.println("tmp :: " + tmp);
		
		int[] arr = {1,2,3,4,5};
		byte[] byteArr = {1,2,3,4};
		char[] charArr = {'1','2','1','1'};
//		System.out.println(charArr);
//		System.out.println(Arrays.toString(charArr));
//		
//		System.out.println(byteArr);
//		System.out.println(Arrays.toString(byteArr));
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr);

		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//			System.out.println();
//			System.out.println(arr[0]);
//			System.out.println(arr[1]);
//			System.out.println(arr[2]);
//			System.out.println(arr[3]);
//			System.out.println(arr[4]);
		}
		int b = 0;
		int[] arrays = new int[10];
		for(int i = 0; i < arrays.length; i++) {
			arrays[i] = i;
		}
		b = arrays[1];
//		System.out.println();
//		System.out.println(b);
//		System.out.println(Arrays.toString(arrays));
		
//		char[] ch = {'1','2','3','4','5','6','7','8','9'};
// 		System.out.println(ch);
 		
 		int[] iArr1 = new int[10];
 		int[] iArr2 = new int[10];
 		int[] iArr3 = {100, 95, 80, 70, 60};
 		char[] chArr = {'a','b','c','d'};
 		
 		for(int i = 0; i < iArr1.length; i++) {
 			iArr1[i] = i + 1;
// 			System.out.print(iArr1[i] + ",");
 		}
// 		System.out.println(iArr1[0]);
// 		System.out.print(Arrays.toString(iArr1));
 		
 		for(int i = 0; i < iArr2.length; i++) {
 			iArr2[i] = (int)(Math.random()*11);
 		}
 		
 		for(int i = 0; i < iArr2.length; i++) {
 			iArr2[i] = (int)(Math.random()*11);
 		}
 		
 		for(int i = 0; i < charArr.length; i++) {
// 			System.out.println(Arrays.toString(chArr));
// 			System.out.println(chArr);
 		}
// 		System.out.println();
// 		System.out.println(Arrays.toString(iArr1));
// 		System.out.println(Arrays.toString(iArr2));
// 		System.out.println(Arrays.toString(iArr3));
// 		System.out.println(Arrays.toString(chArr));
 		
 		
 		int[] copyArr = {5,1,3,4,5};
 		int[] tmpArr = new int[copyArr.length *2];
 		
 		System.out.println(copyArr.length);
 		System.out.println(tmpArr.length);
 		System.out.println(Arrays.toString(copyArr));
 		System.out.println(Arrays.toString(tmpArr));
 		
 		for(int i = 0; i < copyArr.length; i++) {
 			tmpArr[i] = copyArr[i];
 			System.out.println(Arrays.toString(tmpArr));
 		}
 		
 		tmpArr[5] = 1;
 		tmpArr[6] = 2;
 		tmpArr[7] = 3;
 		System.out.println(tmpArr[5]);
 		System.out.println(tmpArr[6]);
 		System.out.println(tmpArr[7]);
 		System.out.println(Arrays.toString(tmpArr));
 		
 		for(int i = 0; i < tmpArr.length; i++) {
 			tmpArr[i] = 0;
 			System.out.print(tmpArr[i] + ",");
 		}
 		System.out.println();
 		System.out.print(Arrays.toString(tmpArr));
 		System.out.println();
 		System.out.println("--------------------");
 		System.arraycopy(copyArr, 0, tmpArr, 0, copyArr.length);
 		System.out.println(Arrays.toString(copyArr));
 		System.out.println(Arrays.toString(tmpArr));
 		
 		System.out.println("------------------");
 		char[] cArr = {'A','B','C','D'};
 		char[] cnArr = {'0','1','2','3','4','5','6','7','8','9'};
 		System.out.println(cArr);
 		System.out.println(cnArr);
 		System.out.println("---------------------------");
 		char[] resultArr = new char[cArr.length + cnArr.length];
 		System.arraycopy(cArr, 0, resultArr, 0, cArr.length);
 		System.arraycopy(cnArr, 0, resultArr, cArr.length, cnArr.length);
 		System.arraycopy(cnArr, cArr.length, resultArr, cArr.length, cArr.length);
 		
 		System.out.println(Arrays.toString(resultArr));
 		
 		
	}
}
