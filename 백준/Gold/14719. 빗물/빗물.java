import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int [][]num = new int[a+1][b+1];
        for(int i=1;i<=b;i++){
            int c = in.nextInt();
            for(int j=a;j>a-c;j--){
                num[j][i]=1;
            }
        }
        boolean flag = false;
        int count = 0;
        int sum=0;
        for(int i=1;i<=a;i++){
            flag = false;
            count = 0;
            for(int j=1;j<=b;j++){
                if(num[i][j]==1){
                    flag = true;
                    sum+=count;
                    count=0;
                }
                if(flag&&num[i][j]==0){
                    count++;
                }
            }
        }
        System.out.println(sum);
    }
}