import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] num= new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
            sum+=num[i];
        }
        Arrays.sort(num);
        int a = (int) Math.round((double) sum/n);
        int b = num[n/2];
        int c = num[0];
        int max = -1;
        int count = 0;
        boolean check = false;
        for(int i=0;i<n-1;i++){
            if(num[i]==num[i+1]){
                count++;
            }
            else{
                count=0;
            }
            if(max<count){
                max=count;
                c = num[i];
                check = true;
            } else if (max==count&& check) {
                c = num[i];
                check = false;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(num[n-1]-num[0]);
    }
}