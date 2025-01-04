package interviewquestions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.lang.String;
public class Arrays {

	public static void main(String[] args) {
		//		int a[]= {1,2,3,4,5};
		//
		//		int b[]= {4,5,6,7,8};
		//		int c[]=new int[a.length];
		//		int k=0;
		//		for(int i=0;i<a.length;i++) {
		//			for(int j=0;j<b.length;j++) {
		//				if(a[i]==b[j]) {
		//					c[k]=a[i];
		//					k++;
		//					break;
		//				}
		//			}
		//		}
		//
		//
		//		for(int i=0;i<k;i++) {
		//			System.out.println(c[i]);
		//		}
		//

		//first and last element of arraylist
		//		ArrayList<Integer> al=new ArrayList<Integer>();
		//		al.add(67);
		//		al.add(7);
		//		al.add(6);
		//		al.add(10);
		//		al.add(345);
		//		al.add(6097);
		//
		//		for(int num:al) {
		//			System.out.println(num);
		//		}
		//
		//		System.out.println(al.get(0));//first element
		//		System.out.println(al.get(al.size()-1));//lastelement
		//		System.out.println(al.lastIndexOf(al));

		//sort an array
		//		int a[]= {10,22,36,4,512};
		//		int temp=0;
		//		
		//		
		//		for(int i=0;i<a.length;i++) {
		//			for(int j=i+1;j<a.length;j++) {
		//				if(a[i]>a[j]) {
		//					temp=a[i];
		//					a[i]=a[j];
		//					a[j]=temp;
		//				}
		//			}
		//			System.out.println("after sorting of the array in ascending  is:"+a[i]);
		//		}
		//		
		//		
		//		for(int i=0;i<a.length;i++) {
		//			for(int j=i+1;j<a.length;j++) {
		//				if(a[i]<a[j]) {
		//					temp=a[i];
		//					a[i]=a[j];
		//					a[j]=temp;
		//				}
		//			}
		//			System.out.println("after sorting of the array descending:"+a[i]);
		//		}

		//remove duplicates in array
		//		int a[]= {10,22,22,36,4,512,4,2};
		//		int temp[]=new int[a.length];
		//		int j=0;
		//		for(int i=0;i<a.length-1;i++) {
		//			if(a[i]!=a[i+1]) {
		//				temp[j]=a[i];
		//				j++;
		//			}
		//		}
		//		temp[j]=a[a.length-1];
		//		j++;
		//		for (int i = 0; i < j; i++) {
		//            System.out.print(temp[i] + " ");
		//        }

		//remove duplicates from array list
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(4);
//		al.add(40);
//		al.add(45);
//		al.add(34);
//		al.add(2);
//		al.add(65);
//		al.add(2);
//		al.add(34);
//		for(Integer in: al) {
//			System.out.println("All elements in arraylist:"+in);
//		}
//
//		
//		Set<Integer> s=new HashSet<Integer>(al);
//		
//			System.out.println("After removal of duplicates:"+s);

		//find missing number in array
		
//		int a[]= {1,2,3,4,6};
//		int sum=0;
//		int summ=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
//		
//		for(int i=1;i<=6;i++) {
//			summ=summ+i;
//		}
//		System.out.println(summ);
//
//		System.out.println("missing number in the array is:"+(summ-sum));
		
		//largest and smallest element in array
		/*
		 * int a[]= {10,22,324,4,6,45,90};
		 * 
		 * int max=a[0]; int min=a[0]; int maxindex=0;
		 * 
		 * int minindex=0;
		 * 
		 * for(int i=0;i<a.length;i++) { if(a[i]>max) { max=a[i]; maxindex=i; } }
		 * System.out.println("max number in the array is:"+max+" index is:"+maxindex);
		 * 
		 * 
		 * for(int i=0;i<a.length;i++) { if(a[i]<min) { min=a[i]; minindex=i; } }
		 * System.out.println("min number in the array is:"+min+" index is:"+minindex);
		 */
		
		/*
		 * int a[]= {10,22,324,4,6,45,90}; boolean status=false; int find_el=22; for(int
		 * x:a) { if(x==find_el) { System.out.println("element found:"+x); status=true;
		 * break; } }
		 * 
		 * if(status==false) { System.out.println("not found"); }
		 * 
		 * for(int i=0;i<a.length;i++) { if(a[i]==find_el) {
		 * System.out.println("element found:"+a[i]); status=true; break; } }
		 * 
		 * if(status==false) { System.out.println("not found"); }
		 */
		
//		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
//		
//		int sum=0;
//		
//		for(String n:array) {
//			try {
//			int i=Integer.parseInt(n);
//			sum=sum+i;
//			}
//			catch(NumberFormatException e) {
//				
//			}
//		}
//		System.out.println(sum);
		
		
		int[] a={11,27,3,4,6,7,8,9};
		int evcount=0;
		int oddcount=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evcount++;
				
			}
			else 
				oddcount++;
			
		}
		
		
		System.out.println(evcount);
		System.out.println(oddcount);
		
	}

}
