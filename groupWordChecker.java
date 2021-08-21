package 문자열;

import java.util.Scanner;

public class groupWordChecker {
	
	public static boolean checker(String s) {
		boolean result = true;
		
		// 알파벳의 char값을 index로 하는 배열을 만들고
		// 입력으로 주어지는 단어의 현재 위치를 배열에 저장
		// 현재 살펴보고 있는 단어가 이미 한 번 본 단어이면서
		// 배열값과 현재 위치가 연속되지 않는다면(차이가 1이 아니라면 & 값이 0이 아니라면)
		// false
		int arr[] = new int['z'-'a'+1];
		//System.out.println(s);
		for(int i=0; i<s.length(); i++) {
			
//			System.out.println("\n"+s.charAt(i));
//			for (int j=0; j<arr.length; j++)
//				System.out.print(arr[j] + " ");
			int temp = arr[s.charAt(i)-'a'];
			// 현재 위치와 원래 있던 값의 차이가 1이 아니거나(연속되지 않거나)
			// 현재 위치의 값이 0이 아니라면(처음 보는 글자가 아니라면)
			// 한 번 봤으면서 연속되지 않는 숫자(그룹 단어가 아닌 단어)
			// false로 선언하고 반복 탈출
			if (i-temp!=0 && temp != 0) {
				result = false;
				break;
			}
			// 한 번도 못 봤거나 연속되는 숫자가 오는 경우
			else 
				// 배열에 현재 위치를 저장
				arr[s.charAt(i)-'a'] = i+1;
		}
		//System.out.println(result + " " + s);
		return result;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String word[] = new String[n];
		
		input.nextLine();
		
		for (int i=0; i<n; i++)
			word[i] = input.nextLine();
		
//		for (int i=0; i<n; i++)
//			System.out.println(i+ " " + word[i]);
		// 그룹단어 구하는 함수
		int result = 0;
		for(int i=0; i<n; i++) {
			if (checker(word[i])) {
				//System.out.println(word[i]);
				result++;
			}
		}
		
		System.out.println(result);
	}

}
