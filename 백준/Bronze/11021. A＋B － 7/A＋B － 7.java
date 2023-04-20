import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            sb.append("Case #").append(i + 1).append(": ").append(a + b).append("\n");
        }
        System.out.print(sb);
    }
}