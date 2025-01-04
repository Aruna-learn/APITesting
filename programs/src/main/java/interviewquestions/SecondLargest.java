package interviewquestions;
import java.lang.String;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {2,7,12,90,35};
		
		int max=a[0];
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(a[3]);

	}

}
