package interviewquestions;
import java.util.Scanner;
import java.lang.String;
public class Series {

	public static void main(String[] args) {
//		int n1=0;
//		int n2=1;
//		System.out.println("1st two numbers are:"+n1+" "+n2);
//		int sum=0;
//		int count=10;
//		
//	for(int i=2;i<count;i++) {
//		
//		sum=n1+n2;
//		System.out.println(" "+sum);
//		n1=n2;
//		n2=sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean isprime=false;
//		for(int i=2;i<n;i++) {
//			
//			if(n%i==0) {
//				System.out.println("not prime");
//				isprime=false;
//				break;
//			}
//			
//		}
//		if(isprime==true) {
//			System.out.println("prime");
//		}
		
		
		System.out.println("enter the  second number");
		int n1=sc.nextInt();
		int count=0;
		for(int i=n;i<=n1;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					System.out.println("not prime");
					isprime=true;
					break;
				}
			}
			if(isprime==false) {
				System.out.println(i);
			}
		}
		
		
		System.out.println(count);
		
		
		
		
	
		
		
		
		
		

	}

}
