package interviewquestions;

import java.util.Scanner;
import java.lang.String;

public class AllStringPrograms {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
		 String s = scanner.nextLine();
		 String rev="";
		// s.toLowerCase();
//		 for(int i=s.length()-1;i>=0;i--) {
//			 rev=rev+s.charAt(i);
//		 }
//
//		 System.out.println(rev);
//		 char[] ch=s.toCharArray();
//		 for(int i=s.length()-1;i>=0;i--) {
//			 rev=rev+ch[i];
//			 
//		 }
//		 System.out.println(rev);
		 
		 
//		 StringBuffer sb=new StringBuffer("Aruna");
//		 System.out.println(sb.reverse());
		 
//		String words[]=s.split(" ");
//		for(String word:words) {
//			String wordrev="";
//			for(int i=word.length()-1;i>=0;i--) {
//				wordrev=wordrev+word.charAt(i);
//			}
//			rev=rev+wordrev+" ";
//			
//		}
//		System.out.println(rev);
		 
		//find duplicate charactres in string 
		
//		 int count=0;
//		 char[] ch=s.toCharArray();
//		 for(int i=0;i<s.length();i++) {
//			 
//			 for(int j=i+1;j<s.length();j++) {
//				 if(ch[i]==ch[j]) {
//					 count++;
//				 }
//			 }
//			// System.out.println("duplicate characters are:"+ch[i]);
//			 break;
//		 }
		 
		 //System.out.println("repeated or duplicated characters are:"+" "+count);
		 
		 
//		 String str = "Automation Testing Software Engineer";
//	        int start = 0, count = 0;
//
//	        for (int i = 0; i < str.length(); i++) {
//	            if (str.charAt(i) == ' ') 
//	            	count++;  
//	            if (count == 1)
//	            { 
//	            	start = i + 1;
//	            	break; } 
//	        }
//	        
//	        for (int i = start; i < str.length(); i++)
//         System.out.print(str.charAt(i)); 
//	    }
//		 
//		
//		 
//		 String s="This is a tree";
//	String words[]=s.split(" ");
//	for(String word:words) {
//		String wordrev="";
//		for(int i=word.length()-1;i>=0;i--) {
//			wordrev=wordrev+word.charAt(i);
//		}
//		rev=rev+wordrev+"%";		
//	}
//	System.out.println(rev);
		 
		
		 char[] ch = s.toCharArray();
		 boolean[] b = new boolean[s.length()];
		
		 for(int i=0;i<ch.length;i++) {
			 if (b[i]) continue;// Skip already counted characters
			 int count=1;
			 for(int j=i+1;j<ch.length;j++) {
				 if(ch[i]==ch[j]) {
					 b[j] = true;  // Mark character as counted
					 count++;
					 
					 
				 }
				 
			 }
			 System.out.println(ch[i] + " : " + count);
		 }
		 
		 
		 
	}

}
