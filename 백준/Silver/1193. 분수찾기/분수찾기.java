import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        int a =0;
        int b =0;
        while(true){
            if(n-count<=0){
                break;
            }
            n=n-count;
            count++;
        }
        if(count%2==0){
            a=1;
            b=count;
            for(int i=1;i<n;i++){
                a=a+1;
                b=b-1;
            }
        } else{
            a=count;
            b=1;
            for(int i=1;i<n;i++){
                a=a-1;
                b=b+1;
            }
        }

        System.out.print(a+"/"+b);
    }
}