package interviewquestions;
import java.lang.String;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();

		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='o') {
				count++;

			}
		}
		System.out.println(count);







	}

}
