import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            int num= in.nextInt();
            sum+=num*num;
        }
        int result = sum%10;
        System.out.print(result);
    }
}