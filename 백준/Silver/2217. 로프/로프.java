import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        Arrays.sort(num);
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,num[i]*(n-i));
        }
        System.out.println(max);
    }
}