import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //n개의 창문, n명의 사람
        int a=1;
        int count=0;
        while(true){
            if(a*a<=n){
                count++;
                a++;
            }
            else{
                break;
            }
        }
        System.out.print(count);
    }
}