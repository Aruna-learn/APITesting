package interviewquestions;

import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.String;

public class PractisePrograms {

	public static void main(String[] args) {
		//Fibonacci series
//		int n1=0;
//		int n2=1;
//		int sum=0;
//		System.out.println(n1+" "+n2);
//		
//		for(int i=2;i<=10;i++) {
//			sum=n1+n2;
//			System.out.println(" "+sum);
//			n1=n2;
//			n2=sum;// 0 1 2 3 4
//			
//			
//		}
		
		
		
		
		
		
		//Reverse Number
		
		
//		int n=376271;
//		
//		int rev=0;
//		
//		while(n!=0) {
//			rev=rev*10+n%10;
//			n=n/10;
//		}
//		
//		System.out.println(rev);
		
		//palindrome number
		
//int n=16461;
//int palin=n;
//		int rev=0;	
//		
//		
//		while(n!=0) {
//			rev=rev*10+n%10;
//			n=n/10;
//		}
//		
//		System.out.println(rev);
//		
//		if(palin==rev) {
//			System.out.println("number is palindrome:"+palin);
//		}
//		else
//			System.out.println("number is not palindrome:"+palin);
//		

		
		//factorial number
//		int n=5;
//		 long fact=1;
//		 for(int i=1;i<=n;i++) {
//			 fact=fact*i;
//		 }
//		System.out.println(fact);
//
	//even or odd	
//		int count=0;
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				System.out.println(i+ "even number");
//				count++;
//				
//			}
//			else
//				System.out.println(i+ "odd number");
//			count++;
//			
//		}
		//given number is even or odd
		
//		int n=2349864;
//		int evn=0;
//		int odd=0;
//		
//		while(n>0) {
//			int rem=n/10;
//			if(rem%2==0) {
//				evn++;
//			}
//			else { 
//				odd++;
//		}
//		n=n/10;
//		}
//		System.out.println(evn);
//		System.out.println(odd);
		
		//biggest or largest number
//int a=78, b=34;
//		
//		//using ternary operator
//		a=(a>b)?a:b;
//		System.out.println(a);
//
//		if(a>b)//using if else
//			System.out.println("a is largest");
//		else
//			System.out.println("b is largest");
//		
	//given number is prime or not
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter the number to check whether prime or not");
//		int n=sc.nextInt();
//		boolean prime=true;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				System.out.println("not prime number");
//				prime=false;
//				break;
//			}
//			}
//			if(prime==false) {
//				System.out.println("prime");
//				
//			}
			
		//count digits in a number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=sc.nextInt();
//		int count=0;
//		while(n>0) {
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);
		
		//count total of number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=sc.nextInt();
//		int sum=0;
//		while(n>0) {
//			sum=sum+n%10;
//			n=n/10;
//		}
//		System.out.println(sum);
		
		
		//swap number
//		int a=10;
//		int b=90;
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println(a);
//		System.out.println(b);
		
		//reverse string
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string to reverse");
//		String s=sc.next();
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.println(s.charAt(i));
//			rev=rev+s.charAt(i);
//		}
//		
//		System.out.println(rev);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string to reverse");
//		String s=sc.next();
//		String rev="";
//		char ch[]=s.toCharArray();
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.println(ch[i]);
//			rev=rev+ch[i];
//		}
//		
//		System.out.println(rev);
		//word reverse
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the word to reverse");
//		String s=sc.next();
//		String word[]=s.split(" ");
//		String revword="";
//		for( String w:word) {
//			String wordreverse="";
//		for(int i=w.length()-1;i>=0;i--) {
//			wordreverse=wordreverse+w.charAt(i);
//			
//		}
//		revword=revword+wordreverse+" ";
//		System.out.println(revword);
//		
//		
//		}
//		
		//character count
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the character to count");
//		String s=sc.next();
//		
//		System.out.println(s.length());
//		
//		int count=0;
//		 for(int i = 0; i < s.length(); i++) {    
//	            if(s.charAt(i) != ' ')    
//	                count++;    
//	        }    
//		System.out.println(count);
		
		
		//word  count
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the word to count");
//		String s=sc.nextLine();
//		int count=1;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
//				count++;
//			}
//		}
//		System.out.println("words count is:"+count);
		
		//Duplicate character count
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the character to count for duplicate");
//		String s=sc.nextLine();
//		char[] ch=s.toCharArray();
//		int count=0;
//		for(int i=0;i<s.length()-1;i++) {
//			
//			for(int j=1+1;j<s.length();j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//				}
//			}
//			//System.out.println("duplicate characters are:"+ch[i]);
//			
//			System.out.println("repeated or duplicated characters are:"+" "+count);
//		}
		
	//duplicates words
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the words to count for duplicate");		
//		String s=sc.nextLine();
//		
//		int count;
//		s=	s.toLowerCase();
//
//		String words[]=s.split(" ");
//		System.out.println("Duplicate Words in a given string");
//		for(int i=0;i<words.length;i++) {
//			count=1;
//			
//			for(int j=i+1;j<words.length;j++) {
//				if(words[i].equals(words[j])) {
//					count++;
//					 //words[j]="0";// Set words[j] to "0" to avoid counting the word again
//				}
//			}
//			 
//			if (count > 1) {
//                System.out.println(words[i] + ": " + count);
//            }
//
//			
//		}
		//remove white spaces  
//String s="Java     is a language ";
//		
//		System.out.println("Before whitespace removea:"+s);
//		
//
//        
//        // Use replaceAll() to replace multiple spaces with a single space
//        String output = s.replaceAll("\\s+", " ");
//        
//        System.out.println("Output: " + output);
		
		//sort array
//		int a[]=new int[] { 3,7,1,9,45,24};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		
//		for(int i=0;i<a.length;i++) {
//			int temp=0;
//for(int j=i+1;j<a.length;j++) {
//	if(a[i]>a[j]){
//		temp=a[i];
//		a[i]=a[j];
//		a[j]=temp;
//	}
//}
//System.out.println("After sorting:"+a[i]);
//		}
//		
			
			//char[] ch=s.toCharArray();
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
		
		// Use LinkedHashSet to maintain insertion order and remove duplicates
//        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//        StringBuilder result = new StringBuilder();
//        
//        for (char c : ch) {
//            if (set.add(c)) { // Only add character if it's not already in the set
//                result.append(c);
//            }
//        }
//        
//        System.out.println("String after removing duplicates: " + result.toString());
			
			
			
			//remove duplicates from the string
			String s="automation";
			Set<Character> set=new LinkedHashSet<Character>();		
			for(int i=0;i<s.length();i++) {
				set.add(s.charAt(i));
			}
		StringBuffer sb=new StringBuffer();
		for(Character c:set) {
		sb.append(c);
		}
		System.out.println(sb);
			
			
			
			//remove duplicate words
			
//			String s1="automation testing automation";
//			// Split the string into words
//	        String[] words = s1.split(" ");
//	        
//	        // Use LinkedHashSet to maintain insertion order and remove duplicates
//	        LinkedHashSet<String> uniqueWords = new LinkedHashSet<String>();
//	        
//	        for (String word : words) {
//	            uniqueWords.add(word); // Add each word to the set
//	        }
//	        
//	        // Join the words back into a single string
//	        String result = String.join(" ", uniqueWords);
//	        
//	        System.out.println("String after removing duplicate words: " + result);
		
	}

}
