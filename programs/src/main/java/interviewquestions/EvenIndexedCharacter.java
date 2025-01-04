package interviewquestions;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class EvenIndexedCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
//		for(int i=0;i<s.length();i++) {
//			if(i%2==0) {
//				System.out.println("evn indexed characters are:"+s.charAt(i));
//				
//			}
		
		
//		char[] ch=s.toCharArray();
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+ch[i];
//			//rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		
//		String words[]=s.split(" ");
//		String wordrev="";
//		
//		for(String word:words) {
//			String rev="";
//			for(int i=word.length()-1;i>=0;i--) {
//				rev=rev+word.charAt(i);
//			}
//			wordrev=wordrev+rev+" ";
//		}
//		System.out.println(wordrev);

//	char[] ch=s.toCharArray();
//	int count=1;
//	for(int i=0;i<s.length();i++) {
//		for(int j=i+1;j<s.length();j++) {
//			if(ch[i]==ch[j]) {
//				count++;
//			}
//			
//		}
//		System.out.println("repeaterd characters are:"+count+" "+ch[i]);
//		break;
//	}
		
//		int count=1;
//		for(int i=0;i<s.length();i++) {
//			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')) {
//				count++;
//			}
//		}
//		System.out.println("number words in the string is:"+count);
//		String rev="";
//		String origin=s;
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println("after the string reversal the string is:"+rev);
//		
//		if(rev.equals(origin)) {
//			System.out.println("string is palindrome");
//		}
//		
//		else
//			System.out.println("string is not palindrome");//madam arora
		
		
//		System.out.println("enter the second  string");
//		String ss=sc.nextLine();
//		
//		if(s.length()!=ss.length()) {
//			System.out.println("strings are not anagram");
//		}
//		
//		else {
//			char[] ch=s.toCharArray();
//			char[] ch1=ss.toCharArray();
//			Arrays.sort(ch);
//			Arrays.sort(ch1);
//			if(Arrays.equals(ch, ch1)) {
//				System.out.println("string anagram");
//			}
//			else
//				System.out.println("not");
//		}
			
//		s.toLowerCase();
//		int vcount=0;
//		int ccount=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
//				vcount++;
//			}
//			else
//				ccount++;
//		}
//		
//		System.out.println("vowels count is:"+vcount);
//		System.out.println("consonants count is:"+ccount);
		
		
		// Assume ASCII characters (0-127), use boolean array to track
		//character occurrences
//		boolean[] unique = new boolean[128];
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(!unique[ch]) {
//				unique[ch]=true;
//				System.out.print(ch + " ");
//			}
//		}
		
		
//		String sp=s.replaceAll("\\s", "");
//		
//		System.out.println(sp);
		
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<s.length()-1;i++) {
//			if(s.charAt(i)!=' '){
//				sb.append(s.charAt(i));
//			}
//		}
//		System.out.println(sb.toString());
		
		//Java program to print each letter twice from a given string

			//	StringBuilder sb=new StringBuilder();
//		for(int i=0;i<s.length()-1;i++) {
//			char ch=s.charAt(i);
//				sb.append(ch).append(ch).append(ch);
//			
//		}
//	System.out.println(sb.toString());
		
	String t="";
				for(int i=0;i<s.length()-1;i++) {
					char ch=s.charAt(i);
						t=t+ch+ch;
					
				}
			System.out.println(t);
	
	//swapping numbers
				
//		System.out.println("enter the second string");
//		String s1=sc.nextLine();
	
//	String swp="";
//	swp=s;
//	s=s1;
//	s1=swp;
		
//		s=s+s1;
//		System.out.println(s);
//		s1=s.substring(0, s.length()-s1.length());
//		System.out.println(s1);
//		s=s.substring(s1.length());
//		
//	System.out.println("after swapping:"+s);
//	System.out.println("after swapping:"+s1);
	
	//Java program to gives input: aabbcccdd for the output String Str = “a2b2c3d2”
	
//		int count=1;
//		String output="";
//		for(int i=0;i<s.length();i++) {
//			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
//				count++;
//			}
//			else {
//				output=output+s.charAt(i);
//				if(count>1) {
//					output=output+count;
//				}
//				count=1;//rest the count
//		}
//		
//		
//		}
//		
//		
//		System.out.println(output);
		
		//Java program to gives two Output “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
		
//		StringBuilder lower=new StringBuilder();
//		StringBuilder upper=new StringBuilder();
//		
//		for(Character ch:s.toCharArray()) {
//			if(Character.isLowerCase(ch)) {
//				lower.append(ch);
//			}
//			else
//				upper.append(ch);
//		}
//		
//		System.out.println("Output in lowercase: "+lower);
//		 System.out.println("Output in uppercase "+upper);
		
		
		
//		StringBuilder alpha=new StringBuilder();
//		StringBuilder digit=new StringBuilder();
//		
//		for(Character ch:s.toCharArray()) {
//			if(Character.isLetter(ch)) {
//				alpha.append(ch);
//			}
//			else
//				digit.append(ch);
//		}
//		
//		System.out.println("Output in alphabets: "+alpha);
//		 System.out.println("Output in digits:"+digit);
		
		


		
		 StringBuilder result = new StringBuilder();
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            // If the current character is '0', check its position and modify it
	            if (c == '0') {
	                // Rule to change '0': Replace with '2' if it's the first or in between other digits
	                if (i > 0 && i < s.length() - 1) {
	                    result.append('2');
	                } 
	                else {
	                    result.append('0'); // Keep '0' otherwise
	                }
	            } 
	            else {
	                // Keep non-zero digits unchanged
	                result.append(c);
	            }
	            
	}
System.out.println(result);
	}
}

