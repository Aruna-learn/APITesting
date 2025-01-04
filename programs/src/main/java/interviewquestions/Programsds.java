package interviewquestions;

import java.lang.String;
import java.util.Scanner;

public class Programsds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int count=1;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)!=' ') {
//				count++;
//			}
//		}
//
//		System.out.println(count);


char ch[]=s.toCharArray();
for(int i=0;i<s.length();i++) {
	for(int j=i+1;j<s.length();j++) {
		if(ch[i]==ch[j]) {
			count++;
		}
	}
	System.out.println("duplicate characters are:"+ch[i]+" "+count);
	break;
}



	}

}
