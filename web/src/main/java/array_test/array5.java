package array_test;
import java.util.*;
//sort
public class array5 {

	public static void main(String[] args) {
		new array5().test();
	}

	public void test() {
		/*
		sort : 오름차순, 내림차순으로 정렬할때 사용하는 클래스
		단, int 사용시 Collections.reverseOrder가 작동하지 않음
		숫자 방식은 Integer로 설정시 정상 작동 합니다.
		*/
		
		int a[] = {10,1,6,9,20,11};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));	//오름차순
		
		Integer b[] = {10,1,6,9,20,11};
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));	//내림차순
		
		String c[] = {"z","a","c","h","f"};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println(Arrays.toString(c));
		
	}
}
