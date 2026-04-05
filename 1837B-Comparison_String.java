import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        String S=sc.next();
	        char ch[]=S.toCharArray();
	       // long k=sc.nextLong();
	       // long a[]=new long[n];
	       int count=0;
	       int max=0;
	        for(int i=0;i<n-1;i++){
	            if(ch[i]==ch[i+1]){
	                count++;
	            }
	            else{
	                max=Math.max(count+1,max);
	                count=0;
	                
	            }
	            
	        }
	        max=Math.max(count+1,max);
	                
	            
	        
	        
	        
	        System.out.println(max+1);
	    }
		// your code goes here

	}
}
