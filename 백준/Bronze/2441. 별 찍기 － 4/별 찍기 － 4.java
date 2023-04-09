import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(' ');
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}