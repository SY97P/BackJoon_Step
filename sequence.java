package 함수;

import java.util.Scanner;

public class sequence {
	
	public static int[] parse(int number) {
		String strDigit[] = Integer.toString(number).split("");
		int result[] = new int[strDigit.length];
		for(int i=0; i<strDigit.length; i++)
			result[i] = Integer.parseInt(strDigit[i]);
		return result;
	}
	
	public static boolean isSeq(int arr[]) {
		boolean result = false;

		if (arr.length < 3)
			result = true;
		else {
			// diff는 123일 때 짝수, 321일 때 홀수
			int diff = arr[1] - arr[0];
			for (int i=2; i<arr.length; i++) {
				if (diff == arr[i]-arr[i-1]) {
					result = true;
					break;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int count = 0;
		// 1보다 크거나 같고, n보다 작거나 같은 한수의 개수 출력
		for (int i=1; i<=n; i++) {
			// 현재 숫자의 각 자리수를 나누는 함수
			int digit[] = parse(i);
			// 나눠진 각 자리수가 등차수열인지 확인하는 함수
			// 부울 반환값을 갖도록 유도
			if (isSeq(digit)) 
				count++;
		}
		
		System.out.println(count);
	}

}
