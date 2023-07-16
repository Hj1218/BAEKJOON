import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextLong();
        int count=0;
        int num=1;
        while(s>=num){
            s=s-num;
            count++;
            num++;
        }
        System.out.println(count);
    }
}