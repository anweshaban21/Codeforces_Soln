import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	   
	        int k=sc.nextInt();
	        String s=sc.next();
	        char ch[]=s.toCharArray();
	        int odd=0,even=0;
	        int arr[]=new int[26];
	        HashMap<Character,Integer> map=new HashMap<>();
	        for(char i:ch){
	            //int p=(int)i;
	            arr[i-'a']++;
	            
	            
	        }
	        for(int i:arr){
	            if (i>0 && i%2!=0){
	                odd++;
	            }
	            
	        }
	        if(k+1>=odd){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	            
	        }
	        
            
	    }
		// your code goes here

	}
}
