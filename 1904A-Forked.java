import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int x1=sc.nextInt();
	        int y1=sc.nextInt();
	        int x2=sc.nextInt();
	        int y2=sc.nextInt();
	        Set<List<Integer>> set1 = new HashSet<>();
	        Set<List<Integer>> set2 = new HashSet<>();
            set1.add(Arrays.asList(x1+a, y1+b));
            set1.add(Arrays.asList(x1+a, y1-b));
            set1.add(Arrays.asList(x1-a, y1+b));
            set1.add(Arrays.asList(x1-a, y1-b));
            
            set1.add(Arrays.asList(x1+b, y1+a));
            set1.add(Arrays.asList(x1+b, y1-a));
            set1.add(Arrays.asList(x1-b, y1+a));
            set1.add(Arrays.asList(x1-b, y1-a));
            
            set2.add(Arrays.asList(x2+a, y2+b));
            set2.add(Arrays.asList(x2+a, y2-b));
            set2.add(Arrays.asList(x2-a, y2+b));
            set2.add(Arrays.asList(x2-a, y2-b));
            
            set2.add(Arrays.asList(x2+b, y2+a));
            set2.add(Arrays.asList(x2+b, y2-a));
            set2.add(Arrays.asList(x2-b, y2+a));
            set2.add(Arrays.asList(x2-b, y2-a));
            
            int count=0;
            for (List<Integer> ar : set1) {
                if (set2.contains(ar)) {
                    count++;
                }
            }
            System.out.println(count);
	    }
		// your code goes here

	}
}
