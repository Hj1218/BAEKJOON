import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T = in.nextInt();
        StringBuilder sb =new StringBuilder();
        for(int i=0 ; i<T;i++){
            String s = in.next();
            sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
        }
        System.out.print(sb);
    }
}