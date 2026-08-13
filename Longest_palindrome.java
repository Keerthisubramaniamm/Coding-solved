//Longest palindrome in a string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner z= new Scanner(System.in);
	   String s=z.next();
	   System.out.print(Longestpalindrome(s));
	}
	public static String Longestpalindrome(String s){
	    int n=s.length();
	    if(n<2) return s;
	    int start=0;
	    int maxlen=1;
	    for(int i=0;i<n;i++){
	        int left=i;
	        int right=i;
	        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
	            int len=right-left+1;
	            if(len>maxlen){
	                maxlen=len;
	                start=left;
	            }
	            left--;
	            right++;
	        }
	        left=i;
	        right=i+1;
	         while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
	            int len=right-left+1;
	            if(len>maxlen){
	                maxlen=len;
	                start=left;
	            }
	            left--;
	            right++;
	        }
	    }
	    return s.substring(start,start+maxlen);
	}
}
