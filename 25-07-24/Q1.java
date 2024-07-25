package q1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:");//i*-t5s-t8h1e4birds
        String pass=sc.nextLine();
        pass=pass.replaceAll("[a-zA-Z]", "");
        Stack<Integer> s=new Stack<>();
        for(int i=pass.length()-1;i>=0;i--){
            if(pass.charAt(i)>='0'&&pass.charAt(i)<='9'){
                int x=pass.charAt(i)-'0';
                s.push(x);
            }
        }
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i)=='+'){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }
            if(pass.charAt(i)=='-'){
                int a=s.pop();
                int b=s.pop();
                s.push(a-b);
            }
            if(pass.charAt(i)=='*'){
                int a=s.pop();
                int b=s.pop();
                s.push(a*b);
            }
            if(pass.charAt(i)=='/'){
                int a=s.pop();
                int b=s.pop();
                s.push(a/b);
            }
            if(pass.charAt(i)=='%'){
                int a=s.pop();
                int b=s.pop();
                s.push(a%b);
            }
            if(pass.charAt(i)=='^'){
                int a=s.pop();
                int b=s.pop();
                s.push(a^b);
            }
        }
        System.out.println("Output:");//35
        System.out.println(s.get(0));
    }
}