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
        
        System.out.println(num[0]*num[n-1]);
    }
}