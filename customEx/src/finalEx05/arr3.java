package finalEx05;

import java.util.Arrays;

public class arr3 {
	public static void main(String[] args) {
		// 5-1
		int[] arr = {50,60,70,80,90};
		int tmp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			tmp += arr[i];
			System.out.println("score[" + i + "] :: " +  arr[i]);
		}
		System.out.println("tmp :: " + tmp);
		
		// 5-2
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i;
			System.out.print(iArr1[i]);
		}
		System.out.println();
		
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10);
		}
		System.out.print(Arrays.toString(iArr2));
		System.out.println();
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		System.out.println("-----------------------");
		
		
		// 5-3
		int[] arrays = new int[5];
		for(int i = 0; i < arrays.length; i++) {
			arrays[i] = i + 1;
			System.out.println("arrays[" + i + "] :: " +arrays[i]);
		}
		System.out.println("-----------------------");
		
		int[] arrCopy = new int[arrays.length * 2];
		for(int i = 0; i < arrays.length; i++) {
			arrCopy[i] = arrays[i];
			System.out.println("aa :: " + arrays[i]);
			System.out.println("bb :: " + arrCopy[i]);
		}
		System.out.println(Arrays.toString(arrays));
		arrays = arrCopy;
		System.out.println(Arrays.toString(arrCopy));
		System.out.println(Arrays.toString(arrays));
		
		for(int i = 0; i < arrays.length; i++) {
			System.out.println("arr[" + i + "] :: " + arrays[i]);
		}
		
		int[] a = new int[5];
		int[] b = new int[a.length*2];
		
		a= b;
		System.out.println(Arrays.toString(b));
		
		// 5-4
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		for(char ch : abc) {
			System.out.print(ch);
		}
		System.out.println();
		
		for(char ch : num) {
			System.out.print(ch);
		}
		System.out.println("------------------");
		int len = num.length;
		char[] temp = new char[len];
		for(int i = 0; i < abc.length; i++) {
			temp[i] = abc[i];
			System.arraycopy(num, abc.length , temp, abc.length, num.length - abc.length);
		}
		System.out.println(Arrays.toString(temp));
		
	}
}
