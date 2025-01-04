package interviewquestions;
import java.lang.String;
import java.util.Arrays;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		int a[]= {2,5,1,8,1,0,4};
		Arrays.sort(a);//sort the unsorted array and remove duplicates
		int b[]=new int[a.length];
		int c=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[c]=a[i];
				c++;
			}
		}
		b[c]=a[a.length - 1];//to get last element
		c++;
		for (int i = 0; i < c; i++) {
            System.out.print(b[i] + " ");
        }
		

	}

}
