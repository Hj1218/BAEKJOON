import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int k = in.nextInt();
        long answer=1;
        if(s%k==0){
            answer = (long) Math.pow(s/k,k);
        }
        else{
            answer = (long) (Math.pow(s/k,k-(s%k))*Math.pow(s/k+1,s%k));
        }
        System.out.println(answer);
    }
}