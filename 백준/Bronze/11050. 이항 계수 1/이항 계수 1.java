import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int result=1;
        if((n==k)||(k==0)){
            result=1;
        }
        else{
            for(int i=1;i<=n;i++){
                result=result*i;
            }
            for(int j=1;j<=n-k;j++){
                result=result/j;
            }
            for(int l=1;l<=k;l++){
                result=result/l;
            }
        }
        System.out.print(result);
    }
}