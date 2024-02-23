package weekend.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> num1=new ArrayList<Integer>();
		num1.add(3);
		num1.add(2);
		num1.add(11);
		num1.add(4);
		num1.add(6);
		num1.add(7);
		
		List<Integer> num2=new ArrayList<Integer>();
		num2.add(1);
		num2.add(2);
		num2.add(8);
		num2.add(4);
		num2.add(9);
		num2.add(7);
		int size1=num1.size();
		int size2=num2.size();
		for (int i = 0; i <=size1-1; i++) {
			for(int j=0;j<=size2-1;j++) {
				if(num1.get(i)==num2.get(j)) {
					System.out.println(num1.get(i));
				}
			}
		}
	}
}
