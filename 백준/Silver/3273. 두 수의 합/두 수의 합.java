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
        int nn = in.nextInt();
        int count=0;
        Arrays.sort(num);
        int start = 0;
        int end = n-1;
        while(start<end){
            int sum = num[start]+num[end];
            if(sum==nn){
                count++;
            }
            if(sum<=nn){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(count);
    }
}