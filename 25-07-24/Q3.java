package q3;


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        String ans="";
        String res = ""+n;
        if(res.length()==6){
            ans+="C";
        }
        else{
            ans+="W";
        }
        if (n==0) {
            ans+="Z";
        }else if(n==1){
            ans+="O";
        }
        else if(isPrime(n)){
            ans+="P";
        }
        else{
            ans+="N";
        }
        ans+=sumDig(n);
        if(n%2==0){
            ans+=(n/2);
        }
        else{
            ans+=((n-1)/2);
        }
        System.out.println(ans);

        
    }
    public static boolean isPrime(long n){
        for (long i = 2; i < n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static long sumDig(long n){
        while(n>9){
            int sum=0;
            while (n!=0) {
                sum+=n%10;
                n=n/10;
            }
            n=sum;
        }
        return n;
    }
}