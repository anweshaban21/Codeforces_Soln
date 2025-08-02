import java.util.*;
public class unnaturallp {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            ArrayList<Character> vowels=new ArrayList<>();
            ArrayList<Character> cons=new ArrayList<>();
            vowels.add('a');
            vowels.add('e');
            cons.add('b');
            cons.add('c');
            cons.add('d');
            boolean check=false;
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++) {
                char ch=s.charAt(i);
                if(check) {
                    check=false;
                    continue;
                }
                sb.append(ch);
                if(i==n-1 || i==n-2) {
                   continue;
                }
                if(vowels.contains(ch)) {
                   
                   char c1=s.charAt(i+2);
                    if(vowels.contains(c1)) {
                      sb.append('.');
                      continue;
                   }
                   char c2=s.charAt(i+3);
                   if(vowels.contains(c2)) {
                       sb.append(s.charAt(i+1));
                       sb.append('.');
                       check=true;
                   }
                }
            }
            System.out.println(sb.toString());
           
        }
    }
}
