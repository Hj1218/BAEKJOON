import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0; //집-학교, 학교-pc방, pc방-학원, 학원-집 이동시간 (초)
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        int sum = a+b+c+d; // 총 이동시간
        int x = sum/60; // 총 이동시간 x분
        int y = sum%60; // 총 이동시간 y초
        System.out.println(x);
        System.out.println(y);
    }
}