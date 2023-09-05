import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int k = in.nextInt();
        int []num = new int[k+1];
        for(int i=1;i<=k;i++){
            num[i]=in.nextInt();
        }
        int start=1;
        while(start<=k){
            int n = num[start];
            for(int i=2;i<=n;i++){
                int count =0;
                while(n%i==0){
                    n/=i;
                    count++;
                }
                if(count!=0){
                    sb.append(i).append(" ").append(count).append("\n");
                }
                if(n==0){
                    break;
                }
            }
            start++;
        }
        System.out.println(sb);
    }
}