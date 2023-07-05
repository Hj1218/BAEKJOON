import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            int count=0;
            int n = in.nextInt();
            if(n==0){
                break;
            }
            else if(n==1){
                count=1;
            }
            else {
                boolean [] num = new boolean[2*n+1];
                Arrays.fill(num,true);
                num[0]=num[1]=false;
                for(int i=2;i*i<=2*n;i++){
                    if(num[i]){
                        for(int j=i*i;j<=2*n;j+=i){
                            num[j]=false;
                        }
                    }
                }
                for(int i=n+1;i<=2*n;i++){
                    if(num[i]){
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}