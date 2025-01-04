package seleniuminterview;

import java.util.Scanner;

public class FrequencyOrOccurenceCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		
		boolean counted[]=new boolean[s.length()];
		
		char ch[]=s.toCharArray();
		
	
		for(int i=0;i<s.length();i++)
		{
			if(counted[i]||ch[i]==' ') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					counted[j]=true;
				}
		
			}
			System.out.println(ch[i] + " -> " + count);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
