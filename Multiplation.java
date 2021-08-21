package 입출력;

import java.util.Scanner;

public class Multiplation {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		// System.out.println(first + " " + second);
		
		int units = b%10;
		int tens = (b%100 - units)/10;
		int hundreds = (b-tens)/100;
		
		int answer[] = new int[3];
		answer[0] = a * units;
		answer[1] = a * tens;
		answer[2] = a * hundreds;
		
		int result = 0;
		for (int i=0; i<3; i++) {
			result += answer[i] * Math.pow(10, i);
		}
		
		for(int i=0; i<3; i++)
			System.out.println(answer[i]);
		System.out.println(result);
	}

}
