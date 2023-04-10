import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int [] num=new int[n+1];
        StringBuilder sb = new StringBuilder();
        for(int i = 2;i<=n;i++){
            num[i]=i;
        }
        for(int j=2;j<=n;j++){
            if(num[j]==0){
                continue;
            }
            for(int k=j+j;k<=n;k+=j){
                num[k]=0;
            }
        }
        for(int a=m;a<=n;a++){
            if(num[a]!=0){
                sb.append(a).append("\n");
            }
        }
        System.out.print(sb);
    }
}