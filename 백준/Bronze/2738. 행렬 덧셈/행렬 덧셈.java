import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]a = new int[n][m];
        int [][]b = new int[n][m];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sb.append(a[i][j]+b[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}