package interviewquestions;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class AllArrayPrograms {

	public static void main(String[] args) {
		
		
		//java program to find the prime numbers in a list
//		int a[] ={1,6,7,9,2,3};
//		
//		
//		for(int i=0;i<a.length;i++) {
//			boolean isprime=true;
//			for(int j=2;j<a[i];j++) {
//				if(a[i]%j==0) {
//					isprime=false;
//					break;
//				}
//			}
//			if(isprime==true)
//				
//				System.out.println(a[i] + " are the prime numbers in the array ");
//		}
		
		
		//java program to remove the duplicates in array
		int a[] ={1,6,5,6,7,9,2,2,3};
		
		Arrays.sort(a);
		int j=0;
		int temp[]=new int[a.length];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
		}
		temp[j] = a[a.length - 1];//to get last element
        j++;

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    
		
		
		
	}

}
