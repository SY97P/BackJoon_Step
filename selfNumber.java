package 함수;

public class selfNumber {
	
	public static int[] parse(int number) {
		
		String strNumber[] = Integer.toString(number).split("");
		
		int parser[] = new int[5];
		for(int i=0; i<strNumber.length; i++) {
			parser[i] = Integer.parseInt(strNumber[i]);
		}
		
		//for(int i=0; i<5; i++)
		//	System.out.println(parser[i]);
		
		return parser;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		/*
		 * 10000보다 작거나 같은 셀프넘버를 찾는 것이므로 
		 * 10001 크기의 배열을 만들고 반복문을 통해 연산하면서 flag를 기록한다.
		 */
		
		int flag[] = new int[10001];
		
		// 셀프번호의 각 자리수
		// 만 까지니까 총 5개 공간 필요
		int parser[] = new int[5];
		// 초기화
		for(int i=0; i<parser.length; i++)
			parser[i] = 0;
		
		
		
		// 1부터 10000까지 연산
		for(int n=1; n<=10000; n++) {
			// 연산할 숫자의 각 자리수를 배열로 반환해주는 함수
			parser = parse(n);
			// 연산한 셀프넘버
			int result = n;
			// 셀프넘버 구하기
			for(int i=0; i<5; i++)
				result += parser[i];
			// 셀프넘버에 해당하는 배열에 1로 flagging
			//System.out.println("n="+n+"result="+result);
			if (result <= 10000)
				flag[result] = 1;
		}
		
		// 배열 값이 0인 index가 셀프넘버
		for(int i=1; i<=10000; i++) {
			if (flag[i] == 0)
				System.out.println(i);
		}
	}

}
