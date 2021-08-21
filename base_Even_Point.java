package 기본수학1;

import java.util.Scanner;

public class base_Even_Point {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		String sour[] = line.split(" ");
		
		int a = Integer.parseInt(sour[0]);
		int b = Integer.parseInt(sour[1]);
		int c = Integer.parseInt(sour[2]);
		
		if (b > c)
			System.out.println("-1");
		else 
			System.out.println(a/(c-b) + 1);
	}

}
