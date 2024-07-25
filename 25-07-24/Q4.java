package q4;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        int a[]={4,5,-2,8,99,67};
        System.out.println("Input:");
       
        System.out.print("{");
        for(int i=0;i<a.length;i++){
            if(i!=a.length-1)
            System.out.print(a[i]+",");
            else
            System.out.print(a[i]);
        }
        System.out.print("}\n");
        
        char ch[]=new char[a.length];
        int v[]=new int[a.length];
        int temp[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        Arrays.sort(temp);
        char x='a';
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(temp[i]==a[j]){
                    ch[j]=x;
                    x++;
                    v[j]=1;
                }
            }
        }
        System.out.println("Output:");//{b,c,a,d,f,e}
        System.out.print("{");
        for(int i=0;i<a.length;i++){
            if(i!=a.length-1)
            System.out.print(ch[i]+",");
            else
            System.out.print(ch[i]);
        }
        System.out.print("}\n");
        
    }
}
/*
10 5 70 1
c  b d  a
1 5 10 70

*/