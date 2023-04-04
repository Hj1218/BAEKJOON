import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        int count=0;
        N=N-1;
        while(true){
            N=N-6*count;
            if(N<=0){
                break;
            }
            count++;
        }
        System.out.print(count+1);
    }
}
