import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n = in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            for(int j=1;j*j<=a;j++){
                count++;
            }
            sb.append(count).append("\n");
            count=0;
        }
        System.out.print(sb);
    }
}