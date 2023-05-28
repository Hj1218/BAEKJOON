import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); //분자 1
        int b = in.nextInt(); //분모 1
        int c = in.nextInt(); //분자 2
        int d = in.nextInt(); //분모 2
        int bm = b*d; //계산을 위한 분모
        int aa = b*d; //답을 위한 분모
        int bj = b*c + d*a; //계산을 위한 분자
        int bb = b*c + d*a; //답을 위한 분자
        while(bm!=0){ //유클리드 호제법 
            int num = bj%bm; 
            bj = bm;
            bm = num;
        }
        System.out.println(bb/bj+" "+aa/bj);
    }
}