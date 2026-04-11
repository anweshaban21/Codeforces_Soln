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
	        int q=sc.nextInt();
	        long a[]=new long[n];
	        int odd=0;
	        long pref[]=new long[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	            if(a[i]%2!=0)
	                odd++;
	            pref[i]=odd;
	            
	        }
	        
	        
	        for(int i=1;i<=q;i++){
	            int odd2=0;
	            int l=sc.nextInt();
	            int r=sc.nextInt();
	            int k=sc.nextInt();
	            int extraodd=0;
	            if(k%2!=0){
	                extraodd=r-l+1;
	                
	            }
	            long ans=(l>1)?odd-(pref[r-1]-pref[l-2])+extraodd:odd-(pref[r-1])+extraodd;
	            
	            
	            if(ans%2!=0)
	                System.out.println("YES");
	            else
	                System.out.println("NO");
	                
	        }
	    }
		// your code goes here

	}
}
