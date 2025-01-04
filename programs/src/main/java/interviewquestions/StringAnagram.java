package interviewquestions;

import java.util.Scanner;
import java.lang.String;
public class StringAnagram {
	
public static void main(String[] args) {
	
	/*
	 * String s="tomato";
	 * 
	 * String s1="matoto"; s.toLowerCase(); s1.toLowerCase();
	 * 
	 * if(s.length()!=s1.length()) { System.out.println("Strings are not anagram");
	 * }
	 * 
	 * else { char[] ch=s.toCharArray(); char[] ch1=s1.toCharArray();
	 * 
	 * Arrays.sort(ch); Arrays.sort(ch1);
	 * 
	 * if(Arrays.equals(ch,ch1)==true) { System.out.println("anagram"); } else
	 * System.out.println("not anagram");
	 * 
	 * }
	 * 
	 * String s2="automation java selenium testng";
	 * 
	 * System.out.println(s2.substring(4,12));
	 */
	
	
	
	
	//WAP to swap strings without using temp/third variable:
	  
	/*
	 * String a = "Hello"; String b = "World";
	 * 
	 * System.out.println("before swapping: ");
	 * System.out.println("the value of a is:"+ a);
	 * System.out.println("the value of b is:"+ b);
	 * 
	 * //1. append a and b: a = a+b; //HelloWorld
	 * 
	 * //2. Store initial string a in String b: b = a.substring(0,
	 * a.length()-b.length());
	 * 
	 * //3. Store initial string b in String a: a = a.substring(b.length());
	 * 
	 * System.out.println("the value of a and b after swapping");
	 * 
	 * System.out.println("the value of a is:"+ a);
	 * System.out.println("the value of b is:"+ b);
	 */  
	  
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	String rev="";
		String pali=s;	


	char[] ch=s.toCharArray();
	for(int i=s.length()-1;i>=0;i--) {
		//rev=rev+ch[i];
		rev=rev+s.charAt(i);
	}
	
	System.out.println(rev);
	
//	StringBuilder sb=new StringBuilder(s);
//	System.out.println(sb.reverse());
	
	
	if(pali.equals(rev)) {
		System.out.println("palindrome:"+rev);
	}
	
	else
		System.out.println("not palindrome:"+rev);
	
	
	
     }
}
