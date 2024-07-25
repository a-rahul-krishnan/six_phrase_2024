package q5;

public class Q5 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int a[]={10,41,18,50,43,31,29,25,59,96,67};
        System.out.println("Input:");
        System.out.print("{");
        for(int i=0;i<a.length;i++){
            if(i!=a.length-1)
            System.out.print(a[i]+",");
            else
            System.out.print(a[i]);
        }
        System.out.print("}\n");
        int p[]=new int[a.length];
        for(int i=0;i<a.length;i++){
           int f=0;
           for(int j=2;j<a[i]/2;j++){
               if(a[i]%j==0){
                   f=1;
               }
           }
           if(f==0){
               p[i]=1;
           }
        }
        for(int i=0;i<a.length;i++){
            if(p[i]==1&&a[i]<min){
                min=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(min==a[i]){
                p[i]=0;
            }
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(p[i]==1){
                sum+=a[i];
            }
        }
        System.out.println("Output:\n"+sum);//241
        
    }
}
