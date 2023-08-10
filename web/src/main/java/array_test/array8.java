package array_test;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList 배열구조
public class array8 {

	public static void main(String[] args) {
		new array8().test();
	}
	public void test() {
		//ArrayList : 배열을 사용하는 클래스의 한 종류
		/* add(데이터추가), get(데이터값 출력), remove(삭제)
		 	size(배열 index갯수)
		*/
		
		String member[] = {"이순신","홍길동","유관순","강감찬"};
		
		ArrayList<String> ar = new ArrayList<String>();
		//System.out.println(ar.size());
		ar.add(member[0]);
		ar.add(member[2]);
		ar.add(member[3]);
		//System.out.println(ar.size());
		//System.out.println(ar);
		//System.out.println(ar.get(1)); //get -> 현재 배열중 순서 선택, 호출
		ar.remove(2);
		//System.out.println(ar);
		
		//ArrayList는 int라는 자료형이 없음
		//Arrays.asList() => 원시배열값을 한번에 ArrayList 배열로 데이터를 이관
		Integer no[] = {3,4,2,7,5,10};
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(no));
		//System.out.println(ar2.size());
		//System.out.println(ar2);
		//ArrayList에 있는 값을 모두 합한 결과값을 출력하시오.
		
		/*
		int summary = 0;
		for(int i=0; i<ar2.size(); i++) {
			summary += ar2.get(i);
		}
		System.out.println(summary);
		*/
		
		int w = 0;
		int sum = 0;
		while(w < ar2.size()) {
			sum = sum + ar2.get(w);
			w++;
		}
		//System.out.println(sum);
		
		
		//만약에?? int로 원시데이터일 경우 ArrayList 사용 불가능 한가?
		int no2[] = {3,4,2,7,5,10};
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		for(int f = 0; f < no2.length; f++) {
			ar3.add(no2[f]);
		}
		//System.out.println(ar3);
		
		/*
		 응용문제10
		 다음 데이터가 있습니다.
		 10,7,6,1,11,37,41,22 입니다.
		 해당 데이터에서 짝수값을 모두 삭제 되도록 하여 배열을 출력 되도록 합니다.
		 결과 [7,1,11,37,41]
		 단, ArrayList활용
		 */
/*		
		int no3[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		for(int ff=0; ff<=no3.length; ff++) {
			ar4.remove(no3[ff]%2==0);
		}
		System.out.println(ar4);
*/		
		
		Integer ori_data[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar4 = new ArrayList<Integer>(Arrays.asList(ori_data));

		int ww = 0;
		while(ww < ar4.size()) {
			if(ar4.get(ww) % 2 == 0) {
				ar4.remove(ww);
			}
			ww++;
		}
		System.out.println(ar4);
		
/*		
		Integer ori_data[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar5 = new ArrayList<Integer>(Arrays.asList(ori_data));
		
		int ww = 0;
		while(ww < ori_data.length) {
			if(ori_data[ww] % 2 != 0) {
				ar5.add(ori_data[ww]);
			}
			ww++;
		}
		System.out.println(ar5);
*/
	}
	
}










