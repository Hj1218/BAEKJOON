import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = b;
        if(b>=Math.pow(10,7)){
            b= (int) Math.pow(10,7);
        }
        boolean [] prime = new boolean[(int) (b+1)];
        for(int i=2;i<=b;i++){
            prime[i]=true;
        }
        for(int i=2;i<b;i++){
            if(!prime[i]){
                continue;
            }
            for (int j=2*i;j<=b;j+=i){
                prime[j]=false;
            }
        }
        int count =0;
        for(int i=0;i<=b;i++){
            if(prime[i]){
                for(int j=2;Math.pow(i,j)<=c;j++){
                    if(Math.pow(i,j)>=a){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}