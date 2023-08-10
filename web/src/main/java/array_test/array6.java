package array_test;
//2차 배열

import java.util.Arrays;

public class array6 {

	public static void main(String[] args) {
		new array6().test();
	}
	
	public void test() {
		String member[][] = {
				{"박초롬","윤보미","정은지","김남주","오하영"},
				{"31","29","33","31","32"}
		};
		int ea = member.length;
		//System.out.println(ea);
		int data_ea = member[0].length;
		//System.out.println(data_ea);
		
		/*
		 * 응용문제7. 다음 코드를 활용하여 결과값을 예시처럼 출력 되도록 하시오
		 */
		
		int f,ff;
		for(f=0;f<data_ea;f++) { //5
			for(ff=0;ff<ea;ff++) { //2
				//System.out.println(member[ff][f]);
			}
		}
		
		/*
		 응용문제8
		 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하여 결과값을
		 출력하는 코드를 작성하시오
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 결과값은 90
		 */
		
		int number[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int total = 0;	//합산 결과 변수값
		//foreach문으로 풀이
		for(int a[] : number) {	//2차 배열을 1차 배열로 따로따로 구성
			
			for(int b : a) {	//위에서 구성된 1차 배열에 있는 데이터를 분리
				if(b % 2 == 0) {	//짝수 조건일 경우
					total += b;
				}
			}
		}
		System.out.println(total);
		
		
	}
	
}










