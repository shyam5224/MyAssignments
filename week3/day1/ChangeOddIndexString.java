package weekend.week3.day1;

public class ChangeOddIndexString {

	public static void main(String[] args) {
		String test = "changeme",output="";
		char[] c=test.toCharArray();
		for (int i=0; i<test.length();i++) {
			char ch=c[i];
			if(i%2==1) {
				ch=Character.toUpperCase(ch);
				output=output+ch;
			}
			else {
				ch=Character.toLowerCase(ch);
				output=output+ch;
			}
		}		
		System.out.println(output);
	}

}
