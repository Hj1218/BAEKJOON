import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] num = new int[n+1];
        for(int i=2;i<=n;i++){
            num[i]=i;
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(num[i]!=0){
                for(int j=i;j<=n;j+=i){
                    if(num[j]!=0){
                        num[j]=0;
                        count++;
                        if(count==k){
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }
    }
}