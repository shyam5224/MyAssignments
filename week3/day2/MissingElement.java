package weekend.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(10);
		num.add(6);
		num.add(8);
		Collections.sort(num);
		int size=num.size();
		for (int i = 0; i <size-1; i++) {
			if((num.get(i)+1)!=num.get(i+1)) {
				System.out.println(num.get(i)+1);
			}
		}
	}
}
