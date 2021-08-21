package 기본수학1;

import java.util.Scanner;

public class breakEvenPoint {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		String source[] = line.split(" ");
		
		int a = Integer.parseInt(source[0]);
		int b = Integer.parseInt(source[1]);
		int c = Integer.parseInt(source[2]);
		
		// System.out.println(a+ " " + b + " " + c);
		
		long count = 1;
		long left = 0;
		int diff = 0;
		while(true) {
			left = count * (c-b);
			
			if (diff < a-left && diff != 0) {
				count = -1;
				break;
			}
			else
				diff = (int)(a-left);
			
			//
//			if (gain > 1000000)
//				System.out.println("cost = " + cost + "gain = " + gain);
			//
			if (left > a)
				break;
			count++;
		}
		
		System.out.println(count);
	}

}
