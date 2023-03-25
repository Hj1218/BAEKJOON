import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int count=0;
        boolean [] a = new boolean[101];
        for(int i=0;i<N;i++){
            int num=in.nextInt();
            if(a[num]==true){count++;}
            else{
                a[num]=true;
            }
        }
        System.out.print(count);
    }
}