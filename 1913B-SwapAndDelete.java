import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.next();
            int one=0,zero=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='1'){
                    one++;
                }
                else{
                    zero++;
                }
            }
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='1' && zero>0){
                    zero--;
                }
                else if(ch=='0' && one>0){
                    one--;
                }
                else{
                    break;
                }
            }
            System.out.println(one+zero);
            //System.out.println(c+" "+d);
            
            
            
        
            
            // for(int i=0;i<n;i++){
            //     a[i]=sc.nextInt();
            //     sum+=a[i];
            // }
            
            
            
        }
    }
}
 
  
