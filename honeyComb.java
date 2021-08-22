package 기본수학1;

import java.util.Scanner;

public class honeyComb {
	
	public static int shellCount(int n) {
		
		int shell = 1;
		
		int lower = 1;
		int upper = 0;
		
		while(true) {
			if (n==1)
				break;
			upper = lower + 6*(shell-1);
			if (n > lower && n <= upper)
				break;
			shell++;
			lower = upper;
		}
		
		return shell;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int result = shellCount(number);
		
		System.out.println(result);
	}

}
