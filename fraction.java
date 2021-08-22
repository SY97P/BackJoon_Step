package 기본수학1;

import java.util.Scanner;

public class fraction {
	
	private static int[] getDiag(int n) {
		int arrDiag[] = new int[2];
		int diag = 1;
		
		int sum = 0;
		while(sum+diag<n) {
			sum += diag;
			diag++;
		}
		
		arrDiag[0] = diag;
		arrDiag[1] = n-sum-1;
		
		return arrDiag;
	}
	
	private static int[] getFrac(int sour[]) {
		int arrFrac[] = new int[2];
		
		// 왼아래쪽으로 진행할 때
		// 1/(arrDiag+1)에서 
		// 분모, 분자 각각에서 arrDiag[1]만큼 뺄, 덧셈
		arrFrac[0] = 1 + sour[1];
		arrFrac[1] = sour[0] - sour[1];
		if (sour[0]%2!=0) {
			int temp = arrFrac[0];
			arrFrac[0] = arrFrac[1];
			arrFrac[1] = temp;
		}
		
		return arrFrac;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int diag[] = getDiag(number);
		//System.out.println(diag[0] + " "+ diag[1]);
		
		int result[] = new int[2];
		result = getFrac(diag);
		
		for (int i=0; i<2; i++) {
			if (i==1)
				System.out.print("/");
			System.out.print(result[i]);
		}
		System.out.println();
	}

}
