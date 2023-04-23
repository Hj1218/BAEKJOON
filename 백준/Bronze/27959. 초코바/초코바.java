import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n*100>=m){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}