import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        int index=0;
        for (int i = 0; i < 9; i++) {
            int num = in.nextInt();
            if(num>max){
                max=num;
                index=i+1;
            }
        }
        System.out.println(max);
        System.out.print(index);
    }
}