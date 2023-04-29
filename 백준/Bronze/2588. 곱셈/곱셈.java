import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = in.next();

        int result1 = a * (b.charAt(2)-'0');
        int result2 = a * (b.charAt(1)-'0');
        int result3 = a * (b.charAt(0)-'0');
        int result = result1 + result2*10 + result3*100;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result);
    }
}