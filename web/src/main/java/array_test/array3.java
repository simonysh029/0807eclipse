package array_test;
//foreach문 : 무조건 배열에만 사용하는 반복문
//배열의 자료형을 따라 입력한다
public class array3 {

	public static void main(String[] args) {
		new array3().test();
	}

	public void test() {
		/*
		 * foreach는 배열값을 이용하여 범위할당 한 만큼만 반복적으로 사용하는 문법
		 * 주의사항 : 배열 자료형과 foreach에 사용하는 자료형을 동일하게 설정
		 */
		String user[] = {"홍길동","김유신","장보고","유관순"};
		
		for(String f : user) {
			System.out.println(f);
		}
		/*
		 * 응용문제4
		 * foreach를 이용하여 다음 배열 데이터의 값을 모두 곱한 결과값을 출력하시오
		 * 5 10 15 20 25 30 35
		 */
		
		int no[] = {5,10,15,20,25,30,35};
		int sum = 1;
		for(int n : no) {
			sum*=n;
		}
		System.out.println(sum);
		
		/*
		 응용문제5
		 다음 리스트 숫자 중 짝수, 홀수 각각의 갯수를 출력하시오.
		 3 6 9 12 15 18 21 24 27		 
		 */
		
		int number[] = {3,6,9,12,15,18,21,24,27};
		int odd=0;
		int even=0;
		for(int num : number) {
			if(num%2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("짝수 : " + even + "홀수 : " + odd);
	}
}












