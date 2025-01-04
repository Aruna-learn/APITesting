package interviewquestions;
import java.lang.String;
public class Count {

	public static void main(String[] args) {
		 String s="aruna";
	        char ch[]=s.toCharArray();
	        int count=1;
	        boolean counted[]=new boolean[s.length()];
	        for(int i=0;i<ch.length;i++){
	            if(counted[i]) continue;
	           
	            for(int j=i+1;j<ch.length;j++){
	                if(ch[i]==ch[j]){
	                    counted[j]=true;
	                    count++;
	                }
	            }
	            System.out.println(ch[i]+":"+count);
	        }

	}

}
