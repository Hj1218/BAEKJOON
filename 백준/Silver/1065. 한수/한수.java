import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        if(n<100){
            System.out.println(n);
        }
        else{
            count = 99;
            for(int i=100;i<=n;i++){
                int b = i/100;
                int s = (i/10)%10;
                int e = i%10;
                if((b-s)==(s-e)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}