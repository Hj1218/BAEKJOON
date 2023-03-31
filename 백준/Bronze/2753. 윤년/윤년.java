import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%4==0){
            if((n%100!=0)||(n%400==0)){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
        else{
            System.out.print(0);
        }
    }
}