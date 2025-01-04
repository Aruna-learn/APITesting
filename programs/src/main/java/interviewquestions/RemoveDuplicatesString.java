package interviewquestions;

import java.util.Scanner;
import java.lang.String;

public class RemoveDuplicatesString {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");

		String s=sc.next();

		//		char[] ch=s.toCharArray();
		//		StringBuilder sbl2=new StringBuilder();
		//		for(int i=0;i<s.length();i++) {
		//			boolean repeated=false;
		//			for(int j=i+1;j<s.length();j++) {
		//				if(ch[i]==ch[j]) {
		//					repeated=true;//if it finds one repeats character it stops 
		//					break;
		//				}
		//			}
		//			if(!repeated) {
		//				sbl2.append(ch[i]);
		//			}
		//		}
		//		System.out.println(sbl2);

		
		
		
		
				String result="";
				
				for(int i=0;i<s.length();i++) {
					String ch=""+s.charAt(i);
					if(result.contains(ch)) {
						continue;
					}
					result=result+ch;
				}
				
		System.out.println(result);



//String s = "automation testing automation";
        
        // Split the string into words
        String[] words = s.split(" ");
        
        // Initialize an empty string to accumulate unique words
        String uniqueWords = "";
        
        for (String word : words) {
            // Check if the word is not already in the uniqueWords string
            if (!uniqueWords.contains(word)) {
                // If it's not in uniqueWords, add it with a trailing space
                uniqueWords += word + " ";
            }
        }
        
        // Trim the trailing space and split uniqueWords back into an array
        //String result = String.join("", uniqueWords.trim().split(" "));
        
        //System.out.println("String after removing duplicate words: " + uniqueWords);
	}

}
