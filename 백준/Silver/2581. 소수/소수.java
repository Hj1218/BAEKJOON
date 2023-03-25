import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int sum=0;
        int a=0;
        int b=0;
        for(int i=M;i<=N;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                sum+=i;
                if(a==0){
                    b=i;
                }
                a++;
            }
        }
        if(sum==0){
            System.out.print(-1);
        } else  {
            System.out.println(sum);
            System.out.println(b);
        }
    }
}