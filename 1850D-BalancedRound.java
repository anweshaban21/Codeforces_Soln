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
	        long k=sc.nextLong();
	        long a[]=new long[n];
	        for(int i=0;i<n;i++)
	            a[i]=sc.nextLong();
	        Arrays.sort(a);
	        long max=0;int count=0;
	        for(int i=0;i<n-1;i++){
	            if(a[i+1]-a[i]<=k){
	                count++;
	            }
	            else{
	                max=Math.max(max,count);
	                count=0;
	            }
	        }
	        max=Math.max(max,count);
	        
	        System.out.println(n-max-1);
	    }
		// your code goes here

	}
}
