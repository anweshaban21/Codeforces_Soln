import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //sc.nextLine();
        // while(t-->0){
        //     int n=sc.nextInt();
        //     long k=sc.nextLong();
        //     long q=sc.nextLong();
            //int one=0,zero=0;
        String s=sc.next();
        int n=s.length();
        //char[] arr={'h','e','l','l','o'};
        int h=0,e=0,l=0,o=0;
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='h'){
                    h++;
                }
                else if(ch=='e' && h>0){
                    e++;
                }
                else if(ch=='l'&& e>0){
                    l++;
                }
                else if(ch=='o'&& l>1){
                    o++;
                }
        }
                if(h>0 && e>0 && l>1 && o>0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
    }
            
}

 
  
