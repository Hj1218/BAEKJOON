import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int [] n = new int[s.length()];
        for(int i=0;i<s.length();i++){
            n[i]=s.charAt(i)-'0';
        }
        Arrays.sort(n);
        for(int j = n.length-1;j>=0;j--){
            System.out.print(n[j]);
        }
    }
}