import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int [] num ={31,28,31,30,31,30,31,31,30,31,30,31};
        int a = in.nextInt();
        int b = in.nextInt();
        int n=0;
        for(int i=1;i<a;i++){
            n=n+num[i-1];
        }
        n=n+b;
        System.out.print(day[n%7]);
    }
}