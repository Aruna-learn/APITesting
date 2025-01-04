package interviewquestions;

import java.util.Scanner;
import java.lang.String;
public class Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
//		if(n%2==0) {
//			System.out.println("even number:"+n);
//		}
//		else
//			System.out.println("odd number:"+n);
		
//		boolean prime=true;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				System.out.println("not prime");
//				prime=false;
//				break;
//			}
//			
//		}
//		if(prime==true) {
//			System.out.println("prime");
//		}
		
//		int sum=0;
//		while(n>0) {
//			sum=sum+n%10;
//			n=n/10;
//		}
//		System.out.println(sum);
//		
		
//		int sum=0;
//		int rev=0;
//		int original=n;
//		while(n!=0) {
//			rev=rev*10+n%10;
//			n=n/10;
//		}
//		
//		System.out.println(rev);
//		if(rev==original) {
//			System.out.println("palindrome:"+rev);
//		}
//		else
//			System.out.println("not palindrome:"+rev);
		
		
//		int count=0;
//		int digit=0;
//		while(n>0) {
//			
//			n=n/10;
//			count++;
//		}
//		
//		System.out.println(count);
		
//		int sum=0;
//		int rem=0;
//		int temp=n;
//		while(n>0) {
//			rem=n%10;
//			sum=sum+rem*rem*rem;  //153 370 371 407
//			n=n/10;
//		}
//		System.out.println(sum);
//		if(temp==sum) {
//			System.out.println("armstrong");
//		}
//		else
//			System.out.println("not armstrong");
		
//		int sum=0;
//		int rev=0;
//		while(n>0) {
//			rev=rev*10+n%10;
//			n=n/10;
//		}
//		
//		System.out.println("reversed number is:"+rev);
		
		
//		long fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		
//		System.out.println("factorial of number is:"+fact);
//		
//		int i=1;
//		while(i<=n) {
//			fact=fact*i;
//		}
//		System.out.println("factorial of number is:"+fact);
		System.out.println("enter the second numbber");
		int n1=sc.nextInt();
//		n=n*n1;
//		n1=n/n1;
//		n=n/n1;
		
//		n=n^n1;
//		n1=n^n1;
//		n=n^n1;
		
//		n=n+n1;
//		n1=n-n1;
//		n=n-n1;
//		
//		
//		
//		System.out.println("after swapping:"+n);
//		System.out.println("after swapping:"+n1);
		
//		int sum=0;
//		System.out.println("range of first  two numbers:"+n+" "+n1);
//		for(int i=0;i<=10;i++) {
//			
//			sum=n+n1;
//			System.out.println(sum);
//			
//			n=n1;
//			n1=sum;
//		}
		int count=0;
		
		for(int i=n;i<=n1;i++) {
			boolean isprime=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					isprime=true;
					break;
				}
				
			}
			if(isprime==false) {
				System.out.println(i);
			}
		}
		
		
		
	
	System.out.println("total number of primes:"+count);
		
		
	}

}
