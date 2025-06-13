import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s="";
            for(int i = 0; i < k; i++) {
                s+="1";
            }
            for(int i = 1; i <=(n-k); i++) {
                s+="0";
            }
 
                
                
            System.out.println(s);
            }
        }
            
            //System.out.println(index);
    }
            
