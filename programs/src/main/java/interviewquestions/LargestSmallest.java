package interviewquestions;

import java.lang.String;

public class LargestSmallest {

	public static void main(String[] args) {
		int a[]= {2,8,1,0,5,3};
		
//		int max=a[0];
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println(max);

int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
		
		
		
	}

}
