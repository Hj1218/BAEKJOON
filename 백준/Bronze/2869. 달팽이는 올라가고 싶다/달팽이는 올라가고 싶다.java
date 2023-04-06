import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long v = in.nextInt();
        long day = (v-b)/(a-b);
        if((v-b)%(a-b)==0){
            System.out.print(day);
        }
        else{
            day++;
            System.out.print(day);
        }
    }
}