package interviewquestions;

import java.util.ArrayList;
import java.lang.String;

public class Stringss {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string:");
//		String s=sc.next();
//		
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		
//		String result="";
//		for(int i=0;i<s.length();i++) {
//			java.lang.String ch=""+s.charAt(i);
//			if(result.contains(ch)) {
//				continue;
//			}
//			result=result+ch;
//		}
//		
//		System.out.println(result);
		
		
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)!=' ') {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(6);
		al.add(3);
		al.add(223);
		
		for(Integer in:al) {
			System.out.println(in);
		}
		//arraylist to array
		System.out.println("Arraylist to array");
		Integer[] digit=al.toArray(new Integer[al.size()]);
		for(Integer n:digit) {
			System.out.println(n);
		}
		
	}
	

}
